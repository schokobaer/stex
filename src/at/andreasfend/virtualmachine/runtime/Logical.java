package at.andreasfend.virtualmachine.runtime;

public class Logical {

	private Logical() {
	}

	public static DataUnit equals(DataUnit op1, DataUnit op2) {
		boolean result = op1.getContent().equals(op2.getContent());
		return new DataUnit(result, DataType.BOOL, false);
	}

	public static DataUnit notEquals(DataUnit op1, DataUnit op2) {
		boolean result = !op1.getContent().equals(op2.getContent());
		return new DataUnit(result, DataType.BOOL, false);
	}

	public static DataUnit bigger(DataUnit op1, DataUnit op2) {

		if ((op1.getType() == DataType.INTEGER || op1.getType() == DataType.FLOAT)
				&& (op2.getType() == DataType.INTEGER || op2.getType() == DataType.FLOAT)) {
			Double f1 = Double.parseDouble(op1.getContent().toString());
			Double f2 = Double.parseDouble(op2.getContent().toString());
			return new DataUnit(f1 > f2, DataType.BOOL, false);
		}

		if (op1.getType() == DataType.BOOL && op2.getType() == DataType.BOOL)
			return new DataUnit(op1.getBool() && !op2.getBool(), DataType.BOOL, false);

		// TODO: Implement for String
		throw new RuntimeException("No matching datatypes: " + op1.getType().name() + " and " + op2.getType().name());

	}

	public static DataUnit smaller(DataUnit op1, DataUnit op2) {

		if ((op1.getType() == DataType.INTEGER || op1.getType() == DataType.FLOAT)
				&& (op2.getType() == DataType.INTEGER || op2.getType() == DataType.FLOAT)) {
			Double f1 = Double.parseDouble(op1.getContent().toString());
			Double f2 = Double.parseDouble(op2.getContent().toString());
			return new DataUnit(f1 < f2, DataType.BOOL, false);
		}

		if (op1.getType() == DataType.BOOL && op2.getType() == DataType.BOOL)
			return new DataUnit(!op1.getBool() && op2.getBool(), DataType.BOOL, false);

		// TODO: Implement for String
		throw new RuntimeException("No matching datatypes: " + op1.getType().name() + " and " + op2.getType().name());

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

}
