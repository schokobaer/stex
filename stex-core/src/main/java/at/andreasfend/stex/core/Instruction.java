package at.andreasfend.stex.core;

public class Instruction {

	private OperationType op;
	private Operand op1;
	private Operand op2;
	private String target;
	
	public Instruction(OperationType op, Operand op1, Operand op2, String target) {
		this.op = op;
		this.op1 = op1;
		this.op2 = op2;
		this.target = target;
	}
	
	public OperationType getOp() {
		return op;
	}
	public void setOp(OperationType op) {
		this.op = op;
	}
	public Operand getOp1() {
		return op1;
	}
	public void setOp1(Operand op1) {
		this.op1 = op1;
	}
	public Operand getOp2() {
		return op2;
	}
	public void setOp2(Operand op2) {
		this.op2 = op2;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	
	@Override
	public String toString() {
		String result = op.name();
		if(op1 != null)
			result += " " + op1.getValue();
		if(op2 != null)
			result += " " + op2.getValue();
		if(target != null)
			result += " -> " + target;
		
		
		return result;
	}
	
}
