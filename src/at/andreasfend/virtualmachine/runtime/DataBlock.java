package at.andreasfend.virtualmachine.runtime;

import java.util.HashMap;

public class DataBlock {

	private DataBlock parent = null;
	private HashMap<String, DataUnit> data = new HashMap<>();
	
	public DataBlock(DataBlock parent) {
		this.parent = parent;
	}
	
	public DataBlock getParent() {
		return parent;
	}
	
	public boolean contains(String id) {
		DataBlock block = this;
		while(block != null) {
			if(block.data.containsKey(id))
				return true;
			block = block.parent;
		}
		return false;
	}
	
	public DataUnit get(String id) {
		DataBlock block = this;
		while(block != null) {
			if(block.data.containsKey(id))
				return block.data.get(id);
			block = block.parent;
		}
		throw new RuntimeException("Identifier not found: " + id);
	}
	
	public void makeVar(String id) {
		if(contains(id))
			throw new RuntimeException("Identifier already allocated: " + id);
		data.put(id, new DataUnit(null, DataType.NULL, false));
	}
	
	public void makeConstante(String id, DataUnit val) {
		if(contains(id))
			throw new RuntimeException("Identifier already allocated: " + id);
		data.put(id, val);
	}
		
	public void assign(String id, DataUnit val) {
		DataBlock block = this;
		while(block != null) {
			if(block.data.containsKey(id)) {
				block.data.put(id, val);
				return;
			}
			block = block.parent;
		}
		throw new RuntimeException("Identifier not found: " + id);
	}
	
	
}
