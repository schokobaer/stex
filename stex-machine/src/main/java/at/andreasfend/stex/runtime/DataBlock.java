package at.andreasfend.stex.runtime;

import java.util.HashMap;

public class DataBlock {

	private DataBlock parent = null;
	private HashMap<String, DataUnit> data = new HashMap<>();
	private Integer catchPointer = null;
	private String exceptionIdentifier = null;
	
	public DataBlock(DataBlock parent) {
		this.parent = parent;
	}
	
	public DataBlock(DataBlock parent, Integer catchPointer, String exceptionIdentifier) {
		this(parent);
		this.catchPointer = catchPointer;
		this.exceptionIdentifier = exceptionIdentifier;
	}
	
	public DataBlock getParent() {
		return parent;
	}
	
	public Integer getCatchPointer() {
		return catchPointer;
	}
	
	public String getExceptionIdentifier() {
		return exceptionIdentifier;
	}

	public boolean contains(String id) {
		String[] structure = id.split("\\.");
		DataBlock block = this;
		while(block != null) {
			if(block.data.containsKey(structure[0])) {
				DataUnit du = block.data.get(structure[0]);
				int index = 1;
				while (structure.length > index) {
					if(du.getType() != DataType.OBJECT || !du.getObject().containsKey(structure[index]))
						return false;
					du = du.getObject().get(structure[index]);
					index++;
				}
				return true;
			}
			block = block.parent;
		}
		return false;
	}
	
	public DataUnit get(String id) {
		String[] structure = id.split("\\.");
		DataBlock block = this;
		while(block != null) {
			if(block.data.containsKey(structure[0])) {
				DataUnit du = block.data.get(structure[0]);
				int index = 1;
				while (structure.length > index) {
					if(du.getType() != DataType.OBJECT || !du.getObject().containsKey(structure[index]))
						throw new RuntimeException("Identifier not found: " + id);
					du = du.getObject().get(structure[index]);
					index++;
				}
				return du;
			}
			block = block.parent;
		}
		throw new RuntimeException("Identifier not found: " + id);
	}
	
	public void makeVar(String id) {
		String[] structure = id.split("\\.");
		if(structure.length == 1) {
			if(contains(id))
				throw new RuntimeException("Identifier already allocated: " + id);
			data.put(id, new DataUnit(null, DataType.NULL, false));
		}
		else {
			DataBlock block = this;
			while(block != null) {
				if(block.data.containsKey(structure[0])) {
					DataUnit du = block.data.get(structure[0]);
					int index = 1;
					while (structure.length > index + 1) {
						if(du.getType() != DataType.OBJECT || !du.getObject().containsKey(structure[index]))
							throw new RuntimeException("Identifier not found: " + id);
						du = du.getObject().get(structure[index]);
						index++;
					}
					du.getObject().put(structure[index], new DataUnit(null, DataType.NULL));
					return;
				}
				block = block.parent;
			}
			throw new RuntimeException("Identifier not found: " + id);
		}
	}
	
	@Deprecated
	public void makeConstante(String id, DataUnit val) {
		if(contains(id))
			throw new RuntimeException("Identifier already allocated: " + id);
		data.put(id, val);
	}
		
	public void assign(String id, DataUnit val) {
		String[] structure = id.split("\\.");
		DataBlock block = this;
		while(block != null) {
			if(block.data.containsKey(structure[0])) {
				if(structure.length == 1) {
					block.data.put(id, val);
					return;
				}
				else {
					DataUnit du = block.data.get(structure[0]);
					int index = 1;
					while (structure.length > index + 1) {
						if(du.getType() != DataType.OBJECT || !du.getObject().containsKey(structure[index]))
							throw new RuntimeException("Identifier not found: " + id);
						du = du.getObject().get(structure[index]);
						index++;
					}
					du.getObject().put(structure[index], val);
					return;
				}
			}
			block = block.parent;
		}
		throw new RuntimeException("Identifier not found: " + id);
	}
		
	@Override
	public String toString() {
		HashMap<String, DataUnit> all = new HashMap<>();
		DataBlock block = this;
		while(block != null) {
			all.putAll(block.data);
			block = block.parent;
		}
		return all.toString();
	}
	
}
