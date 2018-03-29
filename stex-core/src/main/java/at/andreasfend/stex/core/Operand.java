package at.andreasfend.stex.core;

public class Operand {

	private Object value;
	private Type type;
	
	public Operand(Object value, Type type) {
		this.value = value;
		this.type = type;
	}

	public Object getValue() {
		return value;
	}
	
	public String getIdentifier() {
		return (String)value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public enum Type {
		ID,
		VAL
	}
}
