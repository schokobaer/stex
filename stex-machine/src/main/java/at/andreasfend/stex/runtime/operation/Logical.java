package at.andreasfend.stex.runtime.operation;

import at.andreasfend.stex.runtime.DataType;
import at.andreasfend.stex.runtime.DataUnit;

public class Logical {

	private Logical() {
	}

	public static DataUnit equals(DataUnit op1, DataUnit op2) {
		boolean result = op1.equals(op2);
		return new DataUnit(result, DataType.BOOL, false);
	}

	public static DataUnit notEquals(DataUnit op1, DataUnit op2) {
		boolean result = !op1.equals(op2);
		return new DataUnit(result, DataType.BOOL, false);
	}

	public static DataUnit bigger(DataUnit op1, DataUnit op2) {
		return new DataUnit(op1.compareTo(op2) > 0, DataType.BOOL);
	}

	public static DataUnit smaller(DataUnit op1, DataUnit op2) {
		return new DataUnit(op1.compareTo(op2) < 0, DataType.BOOL);
	}
	
	public static DataUnit and(DataUnit op1, DataUnit op2) {
		if (op1.getType() == DataType.BOOL && op2.getType() == DataType.BOOL)
			return new DataUnit(op1.getBool() && op2.getBool(), DataType.BOOL, false);
		throw new RuntimeException("Expected boolean, but got datatypes: " + op1.getType().name() + " and " + op2.getType().name());
	}
	
	public static DataUnit or(DataUnit op1, DataUnit op2) {
		if (op1.getType() == DataType.BOOL && op2.getType() == DataType.BOOL)
			return new DataUnit(op1.getBool() || op2.getBool(), DataType.BOOL, false);
		throw new RuntimeException("Expected boolean, but got datatypes: " + op1.getType().name() + " and " + op2.getType().name());
	}
	
	public static DataUnit not(DataUnit op1) {
		if (op1.getType() == DataType.BOOL)
			return new DataUnit(!op1.getBool(), DataType.BOOL, false);
		throw new RuntimeException("Expected boolean, but got datatype: " + op1.getType().name());
	}
	
	public static DataUnit in(DataUnit set, DataUnit elem) {
		if (set.getType() == DataType.ARRAY) {
			for (DataUnit du: set.getArray()) {
				if(elem.equals(du))
					return new DataUnit(true, DataType.BOOL);
			}
			return new DataUnit(false, DataType.BOOL);
		}
		
		if (set.getType() == DataType.STRING) {
			String haysteck = set.getString();
			String needle = Convert.toString(elem).getString();
			return new DataUnit(haysteck.contains(needle), DataType.BOOL);
		}
		
		throw new RuntimeException("Expected array, but got datatype: " + set.getType().name());
		
	}

}
