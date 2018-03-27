package at.andreasfend.virtualmachine.runtime;

public class Convert {

	private Convert() {
		
	}
	
	public static DataUnit toInt(DataUnit data) {
		if(data.getType() == DataType.INTEGER)
			return data;
		else if(data.getType() == DataType.FLOAT)
			return new DataUnit(data.getFloat().intValue(), DataType.INTEGER);
		else if(data.getType() == DataType.BOOL)
			return new DataUnit(data.getBool() ? 1 : 0, DataType.INTEGER);
		else if(data.getType() == DataType.STRING) {
			return new DataUnit(Integer.parseInt(data.getString()), DataType.INTEGER);
		}
		
		throw new RuntimeException("Can not convert data type " + data.getType().name() + " to integer");
	}
	
	public static DataUnit toFloat(DataUnit data) {
		if(data.getType() == DataType.INTEGER)
			return new DataUnit(data.getInteger().doubleValue(), DataType.FLOAT);
		else if(data.getType() == DataType.FLOAT)
			return data;
		else if(data.getType() == DataType.BOOL)
			return new DataUnit(data.getBool() ? 1.0 : 0.0, DataType.FLOAT);
		else if(data.getType() == DataType.STRING) {
			return new DataUnit(Double.parseDouble(data.getString()), DataType.FLOAT);
		}
		
		throw new RuntimeException("Can not convert data type " + data.getType().name() + " to float");
	}
	
	public static DataUnit toBool(DataUnit data) {
		if(data.getType() == DataType.INTEGER)
			return new DataUnit(data.getInteger() > 0, DataType.BOOL);
		else if(data.getType() == DataType.FLOAT)
			return new DataUnit(data.getFloat() > 0, DataType.BOOL);
		else if(data.getType() == DataType.BOOL)
			return data;
		else if(data.getType() == DataType.STRING) {
			return new DataUnit(Boolean.parseBoolean(data.getString()), DataType.BOOL);
		}
		
		throw new RuntimeException("Can not convert data type " + data.getType().name() + " to bool");
	}
	
	public static DataUnit toString(DataUnit data) {
		if(data.getType() == DataType.INTEGER)
			return new DataUnit(data.getInteger().toString(), DataType.STRING);
		else if(data.getType() == DataType.FLOAT)
			return new DataUnit(data.getFloat().toString(), DataType.STRING);
		else if(data.getType() == DataType.BOOL)
			return new DataUnit(data.getBool().toString(), DataType.STRING);
		else if(data.getType() == DataType.STRING) {
			return data;
		}
		
		throw new RuntimeException("Can not convert data type " + data.getType().name() + " to string");
	}
	
}
