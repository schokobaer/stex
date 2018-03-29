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

public class LogicalTest {

	@Test
	public void sixBigger7() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(6, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("7", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.BIGGER, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getBool().booleanValue(), false);

	}
	
	@Test
	public void sixSmaller7() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(6, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("7", Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.SMALLER, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getBool().booleanValue(), true);

	}
	
	@Test
	public void sixSmaller6() {
		List<Instruction> ins = new LinkedList<>();

		ins.add(new Instruction(OperationType.VAR, new Operand(6, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand(6, Type.VAL), null, "b"));
		
		ins.add(new Instruction(OperationType.SMALLER, new Operand("a", Type.ID), new Operand("b", Type.ID), "a"));
		ins.add(new Instruction(OperationType.RET, new Operand("a", Type.ID), null, null));

		DataUnit result = new Machine(ins, false).execute();
		
		assertEquals(result.getBool().booleanValue(), false);

	}
	
}
