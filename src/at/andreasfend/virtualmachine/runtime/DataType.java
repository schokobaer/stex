package at.andreasfend.virtualmachine.runtime;

public enum DataType {

	NULL(0),
	POINTER(1),
	INTEGER(2),
	FLOAT(4),
	BOOL(8),
	STRING(16),
	ARRAY(32),
	OBJECT(64),
	FUNCTION(128);
	
	
	private int code;
	
	DataType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public static DataType byCode(int code) {
		for (DataType dt: DataType.values()) {
			if(dt.getCode() == code)
				return dt;
		}
		throw new RuntimeException("Unvalid data type code: " + code);
	}
	
}
