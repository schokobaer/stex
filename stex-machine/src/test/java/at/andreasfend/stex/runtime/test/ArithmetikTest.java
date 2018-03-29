package at.andreasfend.stex.runtime.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.runtime.DataUnit;
import at.andreasfend.stex.runtime.Machine;

public class ArithmetikTest {

	@Test
	public void arrayAddInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(1, Type.VAL), new Operand(0, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(4, Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(16, Type.VAL), new Operand(3, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(4, Type.VAL), "a"));
		
		ins.add(new Instruction(OperationType.VAR, new Operand("99", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, null, null, "_c"));
		ins.add(new Instruction(OperationType.ADD, new Operand("a", Type.ID), new Operand("x", Type.ID), "_c"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("_c", Type.ID), null, "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit[] result = new Machine(ins, false).execute().getArray();
		
		assertEquals(result.length, 6);
		assertEquals(result[5].getInteger(), new Integer(99));

	}
	
	@Test
	public void intAddArray() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(1, Type.VAL), new Operand(0, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(4, Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(16, Type.VAL), new Operand(3, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(4, Type.VAL), "a"));
		
		ins.add(new Instruction(OperationType.VAR, new Operand("99", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, null, null, "_c"));
		
		ins.add(new Instruction(OperationType.ADD, new Operand("x", Type.ID), new Operand("a", Type.ID), "_c"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("_c", Type.ID), null, "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit[] result = new Machine(ins, false).execute().getArray();
		
		assertEquals(result.length, 6);
		assertEquals(result[0].getInteger(), new Integer(99));

	}
	
	@Test
	public void arrayAddArray() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(1, Type.VAL), new Operand(0, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(4, Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(16, Type.VAL), new Operand(3, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(4, Type.VAL), "a"));
		
		ins.add(new Instruction(OperationType.VAR, null, null, "b"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(3, Type.VAL), null, "b"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(55, Type.VAL), new Operand(0, Type.VAL), "b"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(66, Type.VAL), new Operand(1, Type.VAL), "b"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(77, Type.VAL), new Operand(2, Type.VAL), "b"));
		
		ins.add(new Instruction(OperationType.VAR, null, null, "_c"));
		ins.add(new Instruction(OperationType.ADD, new Operand("a", Type.ID), new Operand("b", Type.ID), "_c"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("_c", Type.ID), null, "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit[] result = new Machine(ins, false).execute().getArray();
		
		assertEquals(result.length, 8);
		assertEquals(result[6].getInteger(), new Integer(66));

	}
	
	@Test
	public void intAddInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("true", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.ADD, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getInteger().intValue(), 6);

	}
	
	@Test
	public void stringAddInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand("Hallo ", Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("true", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.ADD, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getString(), "Hallo true");

	}
	
	@Test
	public void arraySubInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(1, Type.VAL), new Operand(0, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(4, Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(16, Type.VAL), new Operand(3, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(4, Type.VAL), "a"));
		
		ins.add(new Instruction(OperationType.VAR, new Operand(16, Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, null, null, "_c"));
		ins.add(new Instruction(OperationType.SUB, new Operand("a", Type.ID), new Operand("x", Type.ID), "_c"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("_c", Type.ID), null, "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit[] result = new Machine(ins, false).execute().getArray();
		
		assertEquals(result.length, 4);
		assertEquals(result[3].getInteger().intValue(), 25);

	}
	
	@Test
	public void arraySubArray() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(1, Type.VAL), new Operand(0, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(4, Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(16, Type.VAL), new Operand(3, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(4, Type.VAL), "a"));
		
		ins.add(new Instruction(OperationType.VAR, null, null, "b"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(3, Type.VAL), null, "b"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(0, Type.VAL), "b"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(66, Type.VAL), new Operand(1, Type.VAL), "b"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(2, Type.VAL), "b"));
		
		ins.add(new Instruction(OperationType.VAR, null, null, "_c"));
		ins.add(new Instruction(OperationType.SUB, new Operand("a", Type.ID), new Operand("b", Type.ID), "_c"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("_c", Type.ID), null, "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit[] result = new Machine(ins, false).execute().getArray();
		
		assertEquals(result.length, 3);
		assertEquals(result[1].getInteger(), new Integer(4));
		assertEquals(result[2].getInteger(), new Integer(16));

	}
	
	@Test
	public void stringSubString() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand("ein string kein kleim", Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("in", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.SUB, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getString(), "e strg ke kleim");

	}
	
	@Test
	public void arrayMul3() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(1, Type.VAL), new Operand(0, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(4, Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(9, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(16, Type.VAL), new Operand(3, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(25, Type.VAL), new Operand(4, Type.VAL), "a"));
		
		ins.add(new Instruction(OperationType.VAR, new Operand(3, Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, null, null, "_c"));
		ins.add(new Instruction(OperationType.MUL, new Operand("a", Type.ID), new Operand("x", Type.ID), "_c"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("_c", Type.ID), null, "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit[] result = new Machine(ins, false).execute().getArray();
		
		assertEquals(result.length, 15);
		assertEquals(result[8].getInteger().intValue(), 16);
		assertEquals(result[11].getInteger().intValue(), 4);

	}
	
	@Test
	public void stringMul2() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand("otto", Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand(2, Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.MUL, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getString().length(), 8);
		assertEquals(result.getString(), "ottootto");

	}
	
	@Test
	public void floatMulInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(3, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("5.5", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.MUL, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getFloat().doubleValue(), 16.5d, 0.000001);

	}
	
	@Test
	public void floatDivInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(10.5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("5", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.DIV, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getFloat().doubleValue(), 2.1d, 0.000001);

	}
	
	@Test
	public void intDivInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(12, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("5", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.DIV, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getInteger().intValue(), 2);

	}
	
	@Test(expected = RuntimeException.class)
	public void intDivZero() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(12, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand(0, Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.DIV, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
	}
	
	@Test
	public void intModInt() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(13, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("5", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.MOD, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getInteger().intValue(), 3);

	}
	
	
}
