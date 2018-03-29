package at.andreasfend.stex.runtime.operation;

import at.andreasfend.stex.runtime.DataType;
import at.andreasfend.stex.runtime.DataUnit;

public class Arithetik {

	private Arithetik() {

	}

	public static DataUnit add(DataUnit op1, DataUnit op2) {

		Integer i1 = (Integer) op1.getContent();
		Integer i2 = (Integer) op2.getContent();

		return new DataUnit(i1 + i2, DataType.INTEGER, false);
	}

	public static DataUnit sub(DataUnit op1, DataUnit op2) {

		Integer i1 = (Integer) op1.getContent();
		Integer i2 = (Integer) op2.getContent();

		return new DataUnit(i1 - i2, DataType.INTEGER, false);
	}

	public static DataUnit mul(DataUnit op1, DataUnit op2) {

		Integer i1 = (Integer) op1.getContent();
		Integer i2 = (Integer) op2.getContent();

		return new DataUnit(i1 * i2, DataType.INTEGER, false);
	}

	public static DataUnit div(DataUnit op1, DataUnit op2) {

		Integer i1 = (Integer) op1.getContent();
		Integer i2 = (Integer) op2.getContent();

		return new DataUnit(i1 / i2, DataType.INTEGER, false);
	}

	public static DataUnit mod(DataUnit op1, DataUnit op2) {

		Integer i1 = (Integer) op1.getContent();
		Integer i2 = (Integer) op2.getContent();

		return new DataUnit(i1 % i2, DataType.INTEGER, false);
	}

}
