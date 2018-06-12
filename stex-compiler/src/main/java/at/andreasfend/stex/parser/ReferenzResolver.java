package at.andreasfend.stex.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;

/**
 * Converts tmp-Operands to valid references in the program.
 * 
 * @author Andreas Fend
 *
 */
public class ReferenzResolver {

	/**
	 * Goes through the given instructions in 2 steps. First step it searchs marks
	 * from functions and if/while/try-blocks. Second step it replaces the tmp
	 * operands with the valid instruction number.
	 * 
	 * @param List of instructions of the program.
	 * @return  the same list with replaced references or Runtime Exception, when
	 * there is an reference error.
	 */
	public List<Instruction> resolve(List<Instruction> program) {
		
		Map<Object, Integer> marks = new HashMap<>();
		Map<FunctionBean, Integer> funcs = new HashMap<>();
		
		// First round find marks and funcs
		for (int i = 0; i < program.size(); i++) {
			Instruction ins = program.get(i);
			if(ins.getOp() != OperationType.MARK)
				continue;
			if(ins.getTarget() != null) {
				FunctionBean fb = new FunctionBean();
				fb.args = (List<String>)ins.getOp1().getValue();
				fb.name = ins.getTarget();
				//ins.setOp1(null);
				//ins.setTarget(null);
				funcs.put(fb, i);
			}
			else {
				marks.put(ins.getOp1().getValue(), i);
				ins.setTarget(ins.getOp1().getValue().toString());
				ins.setOp1(null);
			}
		}
		
		// Second round resolve open TMP
		for (int i = 0; i < program.size(); i++) {
			Instruction ins = program.get(i);
			if(ins.getOp() == OperationType.CMP) {
				int index = marks.get(ins.getOp2().getValue());
				ins.setOp2(new Operand(index, Type.VAL));
			}
			else if(ins.getOp() == OperationType.JMP || ins.getOp() == OperationType.TRYCATCH) {
				int index = marks.get(ins.getOp1().getValue());
				ins.setOp1(new Operand(index, Type.VAL));
			}
			else if(ins.getOp() == OperationType.CALL) {
				boolean found = false;
				for (Map.Entry<FunctionBean, Integer> f: funcs.entrySet()) {
					if(ins.getOp1().getIdentifier().equals(f.getKey().name)) {
						ins.setOp1(new Operand(f.getValue(), Type.VAL));
						found = true;
						break;
					}
				}
				if(!found)
					throw new RuntimeException("Call to undefined Function: " + ins.getOp1().getIdentifier());
			}
			else if(ins.getOp() == OperationType.PARAMETER) {
				boolean found = false;
				for (Map.Entry<FunctionBean, Integer> f: funcs.entrySet()) {
					String search = f.getKey().name + "_";
					if(ins.getTarget().startsWith(search)) {
						String strIndex = ins.getTarget().substring(search.length());
						int index = Integer.parseInt(strIndex);
						ins.setTarget(f.getKey().args.get(index));
						found = true;
						break;
					}
				}
				if(!found)
					throw new RuntimeException("Undefined Parameter ");
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
