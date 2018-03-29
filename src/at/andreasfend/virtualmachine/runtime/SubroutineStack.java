package at.andreasfend.virtualmachine.runtime;

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
