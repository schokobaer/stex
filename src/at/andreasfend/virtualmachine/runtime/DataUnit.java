package at.andreasfend.virtualmachine.runtime;

import java.util.HashMap;
import java.util.Map;

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
	
	public Double getFloat() {
		return (Double) content;
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
	
	public DataUnit[] getArray() {
		return (DataUnit[]) content;
	}
	
	public Map<String, DataUnit> getObject() {
		return (Map<String, DataUnit>) content;
	}
	
	public void set(Object content, DataType type) {
		this.content = content;
		this.type = type;
	}
	
	public DataUnit copy() {
		if(type == DataType.ARRAY) {
			DataUnit[] arr = new DataUnit[getArray().length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = getArray()[i];
			}
			return new DataUnit(arr, type, constante);
		}
		if(type == DataType.OBJECT) {
			Map<String, DataUnit> obj = new HashMap<>(getObject());
			return new DataUnit(obj, type);
		}
		return new DataUnit(content, type, constante);
	}
	
	public String print() {
		switch (type) {
		case NULL:
			return "NULL";
		case BOOL:
			return getBool() ? "true" : "false";
		case INTEGER:
			return getInteger().toString();
		case FLOAT:
			return getFloat().toString();
		case STRING:
			return getString();
		case POINTER:
			return "*" + getPoiner().print();
		case FUNCTION:
			return "FUNCTION";
		case ARRAY:
			String res = "[ ";
			for (DataUnit child: getArray()) {
				res += child.print() + ", ";
			}
			if(getArray().length > 0)
				res = res.substring(0, res.length()-2) + " ";
			return res + "]";
		case OBJECT:
			String strObj = "{ ";
			for (Map.Entry<String, DataUnit> attr: getObject().entrySet()) {
				strObj += attr.getKey() + ": " + attr.getValue().print() + ", ";
			}
			if(getObject().size() > 0)
				strObj = strObj.substring(0, strObj.length()-2) + " ";
			strObj += "}";
			return strObj;
		default:
			throw new RuntimeException("Unknown data type: " + type.name());
		}
	}
	
	@Override
	public boolean equals(Object arg1) {
		if(arg1 == null || !arg1.getClass().equals(this.getClass()))
			return false;
		DataUnit that = (DataUnit)arg1;
		if(this.type != that.type)
			return false;
		if(this.type == DataType.INTEGER) {
			return this.getInteger().equals(that.getInteger());
		}
		else if(this.type == DataType.FLOAT) {
			return this.getFloat().equals(that.getFloat());
		}
		else if(this.type == DataType.BOOL) {
			return this.getBool().equals(that.getBool());
		}
		else if(this.type == DataType.STRING) {
			return this.getString().equals(that.getString());
		}
		else if(this.type == DataType.NULL) {
			return true;
		}
		else if(this.type == DataType.POINTER) {
			return this.getPoiner() == that.getPoiner();
		}
		else if(this.type == DataType.ARRAY) {
			if(this.getArray().length != that.getArray().length)
				return false;
			for (int i = 0; i < getArray().length; i++) {
				if(!this.getArray()[i].equals(that.getArray()[i]))
					return false;
			}
			return true;
		}
		else if(this.type == DataType.OBJECT) {
			if(this.getObject().size() != that.getObject().size())
				return false;
			for (Map.Entry<String, DataUnit> kp: this.getObject().entrySet()) {
				if(!kp.getValue().equals(that.getObject().get(kp.getKey())))
					return false;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(content == null)
			return "NULL";
		return type.name() + ":" + content.toString();
	}
	
	public static DataUnit parse(Object content) {
		
		if(content == null)
			return new DataUnit(null, DataType.NULL, true);
		
		String strContent = content.toString();
		
		try {
			return new DataUnit(Integer.parseInt(strContent),
					DataType.INTEGER, true);
		}
		catch(Exception e) { }
		
		try {
			return new DataUnit(Double.parseDouble(strContent),
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
