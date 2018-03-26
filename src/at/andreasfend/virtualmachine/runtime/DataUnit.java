package at.andreasfend.virtualmachine.runtime;

public class DataUnit {

	private boolean constante = false;
	private DataType type;
	private Object content;
	
	public DataUnit(Object content, DataType type) {
		this(content, type, false);
	}
	
	public DataUnit(Object content, DataType type, boolean constatne) {
		this.constante = constatne;
		set(content, type);
	}

	public boolean isConstante() {
		return constante;
	}

	public DataType getType() {
		return type;
	}

	public Object getContent() {
		return content;
	}
	
	public Integer getInteger() {
		return (Integer) content;
	}
	
	public Float getFloat() {
		return (Float) content;
	}
	
	public Boolean getBool() {
		return (Boolean) content;
	}
	
	public String getString() {
		return (String) content;
	}
	
	public DataUnit getPoiner() {
		return (DataUnit) content;
	}
	
	public void set(Object content, DataType type) {
		this.content = content;
		this.type = type;
	}
	
	public DataUnit copy() {
		return new DataUnit(content, type, constante);
	}
	
	@Override
	public String toString() {
		if(content == null)
			return "NULL";
		return type.name() + ":" + content.toString();
	}
	
	public static DataUnit parse(Object content) {
		
		String strContent = content.toString();
		
		try {
			return new DataUnit(Integer.parseInt(strContent),
					DataType.INTEGER, true);
		}
		catch(Exception e) { }
		
		try {
			return new DataUnit(Float.parseFloat(strContent),
					DataType.FLOAT, true);
		}
		catch(Exception e) { }
		
		if(strContent.equals("true"))
			return new DataUnit(true, DataType.BOOL, true);
		if(strContent.equals("false"))
			return new DataUnit(false, DataType.BOOL, true);
		
		if(strContent.equals("null"))
			return new DataUnit(null, DataType.NULL, true);
		
		return new DataUnit(strContent, DataType.STRING, true);
	}
	
}
