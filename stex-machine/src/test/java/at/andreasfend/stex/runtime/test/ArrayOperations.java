package at.andreasfend.stex.runtime.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.runtime.Machine;

public class ArrayOperations {

	@Test
	public void arraywrite() {
		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(5, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("1", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("haumirab", Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand("uren ", Type.VAL), new Operand(1, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		ins.add(new Instruction(OperationType.RARRAY, new Operand("a", Type.ID), new Operand(2, Type.VAL), "x"));
		ins.add(new Instruction(OperationType.RET, new Operand("x", Type.ID), null, null));

		Integer result = new Machine(ins, false).execute().getInteger();

		assertEquals(result, new Integer(8));
	}

}
