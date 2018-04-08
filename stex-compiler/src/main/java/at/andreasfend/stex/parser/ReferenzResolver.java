package at.andreasfend.stex.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;

public class ReferenzResolver {

	public List<Instruction> resolve(List<Instruction> program) {
		
		Map<Object, Integer> marks = new HashMap<>();
		Map<FunctionBean, Integer> funcs = new HashMap<>();
		
		// First round find marks and funcs
		for (int i = 0; i < program.size(); i++) {
			Instruction ins = program.get(i);
			if(ins.getOp() != OperationType.NOP)
				continue;
			if(ins.getTarget() != null) {
				FunctionBean fb = new FunctionBean();
				fb.args = (List<String>)ins.getOp1().getValue();
				fb.name = ins.getTarget();
				ins.setOp1(null);
				//ins.setTarget(null);
				funcs.put(fb, i);
			}
			else {
				marks.put(ins.getOp1().getValue(), i);
			}
		}
		
		// Second round resolve open TMP
		for (int i = 0; i < program.size(); i++) {
			Instruction ins = program.get(i);
			if(ins.getOp() == OperationType.CMP || ins.getOp() == OperationType.JMP ||
					ins.getOp() == OperationType.TRYCATCH) {
				int index = marks.get(ins.getOp1());
				ins.setOp1(new Operand(index, Type.VAL));
			}
			else if(ins.getOp() == OperationType.CALL) {
				for (Map.Entry<FunctionBean, Integer> f: funcs.entrySet()) {
					if(ins.getOp1().getIdentifier().equals(f.getKey().name)) {
						ins.setOp1(new Operand(f.getValue(), Type.VAL));
						break;
					}
				}
			}
			else if(ins.getOp() == OperationType.PARAMETER) {
				for (Map.Entry<FunctionBean, Integer> f: funcs.entrySet()) {
					String search = f.getKey().name + "_";
					if(ins.getTarget().startsWith(search)) {
						String strIndex = ins.getTarget().substring(search.length());
						int index = Integer.parseInt(strIndex);
						ins.setTarget(f.getKey().args.get(index));
						break;
					}
				}
			}	
		}
		
		return program;
	}
	
	private class FunctionBean {
		List<String> args;
		String name;
		
		@Override
		public boolean equals(Object o) {
			if(!o.getClass().equals(this.getClass()))
				return false;
			FunctionBean that = (FunctionBean) o;
			return that.name.equals(name);
		}
	}
	
}
