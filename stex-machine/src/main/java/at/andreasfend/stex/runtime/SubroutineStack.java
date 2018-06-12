package at.andreasfend.stex.runtime;

/**
 * Stack of a function-call. Is a linked list. It holds all variables in the
 *  head DataBlock, the parent stack, return pointer and the target where the
 * return argument should be stored.
 * 
 * @author Andreas Fend.
 *
 */
public class SubroutineStack {

	private SubroutineStack parent = null;
	private DataBlock dataBlock = new DataBlock(null);
	private int retPointer = -1;
	private String target = null;
	
	public SubroutineStack getParent() {
		return parent;
	}
	public void setParent(SubroutineStack parent) {
		this.parent = parent;
	}

	public int getRetPointer() {
		return retPointer;
	}
	public void setRetPointer(int retPointer) {
		this.retPointer = retPointer;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	
	
	
	public DataUnit get(String id) {
		return dataBlock.get(id);
	}
	
	public void assign(String id, DataUnit val) {
		if(val.getType() == DataType.ARRAY || val.getType() == DataType.OBJECT)
			dataBlock.assign(id, val);
		else
			dataBlock.assign(id, val.copy());
	}
	
	public void makeVar(String id) {
		dataBlock.makeVar(id);
	}
	
	public void enterBlock() {
		dataBlock = new DataBlock(dataBlock);
	}
	
	public void leaveBlock() {
		if(dataBlock.getParent() == null)
			throw new RuntimeException("On highest Layer of Blocks");
		dataBlock = dataBlock.getParent();
	}
	
	public void enterTry(Integer catchPointer, String expIdentifier) {
		dataBlock = new DataBlock(dataBlock, catchPointer, expIdentifier); 
	}
	
	public SubroutineStack throwException() {
		SubroutineStack stack = this;
		
		while(stack != null) {
			while(stack.dataBlock != null) {
				if(stack.getCatchPointer() != null)
					return stack;
				stack.dataBlock = stack.dataBlock.getParent();
			}
			stack = stack.parent;
		}
		
		return null;
	}
	
	public Integer getCatchPointer() {
		return dataBlock.getCatchPointer();
	}
	
	public String getExceptionIdentifier() {
		return dataBlock.getExceptionIdentifier();
	}
	
	@Deprecated
	public void makeConstante(String id, DataUnit val) {
		dataBlock.makeConstante(id, val);
	}
	
	public void terminate() {
		// TODO: IMPLEMENT
	}
	
	
	@Override
	public String toString() {
		return dataBlock.toString();
	}
	
}
