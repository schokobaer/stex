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


public class ConvertTests {

	@Test
	public void convert() {
		
		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("false", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, null, null, "int"));
		ins.add(new Instruction(OperationType.VAR, null, null, "float"));
		ins.add(new Instruction(OperationType.VAR, null, null, "bool"));
		ins.add(new Instruction(OperationType.VAR, null, null, "string"));
		
		
		// Check type
		ins.add(new Instruction(OperationType.TYPE, new Operand("x", Type.ID), null, "int"));
		ins.add(new Instruction(OperationType.RET, new Operand("int", Type.ID), null, null));
		
		ins.add(new Instruction(OperationType.INT, new Operand("x", Type.ID), null, "int"));
		ins.add(new Instruction(OperationType.FLOAT, new Operand("x", Type.ID), null, "float"));
		ins.add(new Instruction(OperationType.BOOL, new Operand("x", Type.ID), null, "bool"));
		ins.add(new Instruction(OperationType.STRING, new Operand("x", Type.ID), null, "string"));

		ins.add(new Instruction(OperationType.RET, new Operand("string", Type.ID), null, null));
		
		Integer result = new Machine(ins, false).execute().getInteger();
		
		assertEquals(result, new Integer(8));
	}
	
}
