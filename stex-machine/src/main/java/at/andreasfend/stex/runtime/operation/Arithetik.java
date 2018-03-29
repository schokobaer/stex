package at.andreasfend.stex.runtime.operation;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.runtime.DataType;
import at.andreasfend.stex.runtime.DataUnit;

public class Arithetik {

	private Arithetik() {

	}

	public static DataUnit add(DataUnit op1, DataUnit op2) {

		// Array
		if(op1.getType() == DataType.ARRAY && op2.getType() == DataType.ARRAY) {
			DataUnit[] arr2 = new DataUnit[op1.getArray().length + op2.getArray().length];
			for (int i = 0; i < op1.getArray().length; i++) {
				arr2[i] = op1.getArray()[i];
			}
			for (int i = 0; i < op2.getArray().length; i++) {
				arr2[i + op1.getArray().length] = op2.getArray()[i];
			}
			return new DataUnit(arr2, DataType.ARRAY);
		}
		if(op1.getType() == DataType.ARRAY) {
			DataUnit[] arr2 = new DataUnit[op1.getArray().length + 1];
			for (int i = 0; i < op1.getArray().length; i++) {
				arr2[i] = op1.getArray()[i];
			}
			arr2[op1.getArray().length] = op2;
			return new DataUnit(arr2, DataType.ARRAY);
		}
		if(op2.getType() == DataType.ARRAY) {
			DataUnit[] arr2 = new DataUnit[op2.getArray().length + 1];
			for (int i = 0; i < op2.getArray().length; i++) {
				arr2[i+1] = op2.getArray()[i];
			}
			arr2[0] = op1;
			return new DataUnit(arr2, DataType.ARRAY);
		}
		
		// String
		if(op1.getType() == DataType.STRING ||op2.getType() == DataType.STRING) {
			String res = op1.print() + op2.print();
			return new DataUnit(res, DataType.STRING);
		}
		
		// Object/Function/Pointer => NotAllowed
		if(op1.getType() == DataType.OBJECT || op2.getType() == DataType.OBJECT ||
				op1.getType() == DataType.FUNCTION || op2.getType() == DataType.FUNCTION ||
				op1.getType() == DataType.POINTER || op2.getType() == DataType.POINTER) {
			throw new RuntimeException("Unvalid addition" + op1.getType().name() + " + " + op2.getType().name());
		}
		
		Double d1 = Convert.toFloat(op1).getFloat();
		Double d2 = Convert.toFloat(op2).getFloat();
		DataUnit sum = new DataUnit(d1 + d2, DataType.FLOAT);
		
		if(op1.getType() == DataType.FLOAT || op2.getType() == DataType.FLOAT)
			return sum;

		return Convert.toInt(sum);
	}

	public static DataUnit sub(DataUnit op1, DataUnit op2) {

		// Array: remove op2 from op1
		if(op1.getType() == DataType.ARRAY) {
			List<DataUnit> arr2 = new LinkedList<>();
			for (DataUnit du: op1.getArray()) {
				arr2.add(du);
			}
			List<DataUnit> rms = new LinkedList<>();
			if(op2.getType() == DataType.ARRAY) {
				for (DataUnit du: op2.getArray()) {
					rms.add(du);
				}
			}
			else
				rms.add(op2);
			for (DataUnit rm: rms) {
				int index = -1;
				for (int i = 0; i < arr2.size(); i++) {
					if(rm.equals(arr2.get(i))) {
						index = i;
						break;
					}
				}
				if(index >= 0)
					arr2.remove(index);
			}
		}
		
		// Object/Function/Pointer => NotAllowed
		if(op1.getType() == DataType.OBJECT || op2.getType() == DataType.OBJECT ||
				op1.getType() == DataType.FUNCTION || op2.getType() == DataType.FUNCTION ||
				op1.getType() == DataType.POINTER || op2.getType() == DataType.POINTER) {
			throw new RuntimeException("Unvalid subtraction" + op1.getType().name() + " + " + op2.getType().name());
		}
		
		// String: remove op2.print from string
		if(op1.getType() == DataType.STRING) {
			String haysteck = op1.getString();
			String needle = op2.print();
			while(haysteck.contains(needle))
				haysteck = haysteck.replace(needle, "");
			return new DataUnit(haysteck, DataType.STRING);
		}
		
		Double d1 = Convert.toFloat(op1).getFloat();
		Double d2 = Convert.toFloat(op2).getFloat();
		DataUnit sum = new DataUnit(d1 - d2, DataType.FLOAT);
		
		if(op1.getType() == DataType.FLOAT || op2.getType() == DataType.FLOAT)
			return sum;

		return Convert.toInt(sum);
	}

	public static DataUnit mul(DataUnit op1, DataUnit op2) {

		// Array
		if(op1.getType() == DataType.ARRAY && op2.getType() == DataType.INTEGER) {
			DataUnit[] arr2 = new DataUnit[op1.getArray().length * op2.getInteger()];
			int row = 0;
			while (row < op2.getInteger()) {
				for (int i = 0; i < op1.getArray().length; i++) {
					int index = row * op1.getArray().length;
					arr2[index + i] = op1.getArray()[i];
				}
			}
			return new DataUnit(arr2, DataType.ARRAY);
		}
		
		// String
		if(op1.getType() == DataType.STRING && op2.getType() == DataType.INTEGER) {
			String res = "";
			for (int i = 0; i < op2.getInteger(); i++) {
				res += op1.getString();
			}
			return new DataUnit(res, DataType.STRING);
		}
		
		// Object/Function/Pointer => NotAllowed
		if(op1.getType() == DataType.OBJECT || op2.getType() == DataType.OBJECT ||
				op1.getType() == DataType.FUNCTION || op2.getType() == DataType.FUNCTION ||
				op1.getType() == DataType.POINTER || op2.getType() == DataType.POINTER) {
			throw new RuntimeException("Unvalid multiplication" + op1.getType().name() + " + " + op2.getType().name());
		}
		
		Double d1 = Convert.toFloat(op1).getFloat();
		Double d2 = Convert.toFloat(op2).getFloat();
		DataUnit sum = new DataUnit(d1 * d2, DataType.FLOAT);
		
		if(op1.getType() == DataType.FLOAT || op2.getType() == DataType.FLOAT)
			return sum;

		return Convert.toInt(sum);
	}

	public static DataUnit div(DataUnit op1, DataUnit op2) {

		// Object/Function/Pointer/Array/String => NotAllowed
		if(op1.getType() == DataType.OBJECT || op2.getType() == DataType.OBJECT ||
				op1.getType() == DataType.FUNCTION || op2.getType() == DataType.FUNCTION ||
				op1.getType() == DataType.ARRAY || op2.getType() == DataType.ARRAY ||
				op1.getType() == DataType.STRING || op2.getType() == DataType.STRING ||
				op1.getType() == DataType.POINTER || op2.getType() == DataType.POINTER) {
			throw new RuntimeException("Unvalid multiplication" + op1.getType().name() + " + " + op2.getType().name());
		}
		
		Double d1 = Convert.toFloat(op1).getFloat();
		Double d2 = Convert.toFloat(op2).getFloat();
		
		if(d2.equals(0)) {
			throw new RuntimeException("Division by zero");
		}
		
		DataUnit sum = new DataUnit(d1 / d2, DataType.FLOAT);
		
		if(op1.getType() == DataType.FLOAT || op2.getType() == DataType.FLOAT)
			return sum;

		return Convert.toInt(sum);
	}

	public static DataUnit mod(DataUnit op1, DataUnit op2) {

		// Object/Function/Pointer/Array/String => NotAllowed
		if(op1.getType() == DataType.OBJECT || op2.getType() == DataType.OBJECT ||
				op1.getType() == DataType.FUNCTION || op2.getType() == DataType.FUNCTION ||
				op1.getType() == DataType.ARRAY || op2.getType() == DataType.ARRAY ||
				op1.getType() == DataType.STRING || op2.getType() == DataType.STRING ||
				op1.getType() == DataType.POINTER || op2.getType() == DataType.POINTER) {
			throw new RuntimeException("Unvalid multiplication" + op1.getType().name() + " + " + op2.getType().name());
		}
		
		Double d1 = Convert.toFloat(op1).getFloat();
		Double d2 = Convert.toFloat(op2).getFloat();
		
		if(d2.equals(0)) {
			throw new RuntimeException("Division by zero");
		}
		
		DataUnit sum = new DataUnit(d1 % d2, DataType.FLOAT);
		
		if(op1.getType() == DataType.FLOAT || op2.getType() == DataType.FLOAT)
			return sum;

		return Convert.toInt(sum);
	}

}
