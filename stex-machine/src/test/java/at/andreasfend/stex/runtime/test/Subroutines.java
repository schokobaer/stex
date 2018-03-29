package at.andreasfend.stex.runtime.test;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.runtime.DataType;
import at.andreasfend.stex.runtime.DataUnit;
import at.andreasfend.stex.runtime.Machine;
import at.andreasfend.stex.core.OperationType;

public class Subroutines {

	@Test
	public void subroutine() {
		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("0", Type.VAL), null, "res"));

		ins.add(new Instruction(OperationType.CONST, new Operand("2", Type.VAL), null, "c1"));

		ins.add(new Instruction(OperationType.VAR, new Operand("6", Type.VAL), null, "v1"));

		ins.add(new Instruction(OperationType.SUBSTACK, null, null, null));
		ins.add(new Instruction(OperationType.PARAMETER, new Operand("c1", Type.ID), null, "sum1"));
		ins.add(new Instruction(OperationType.PARAMETER, new Operand("v1", Type.ID), null, "sum2"));
		ins.add(new Instruction(OperationType.CALL, new Operand(7, Type.VAL), null, "res"));

		ins.add(new Instruction(OperationType.RET, new Operand("res", Type.ID), null, null));

		// Summe: 8
		ins.add(new Instruction(OperationType.VAR, null, null, "summe"));

		ins.add(new Instruction(OperationType.ADD, new Operand("sum1", Type.ID), new Operand("sum2", Type.ID),
				"summe"));

		ins.add(new Instruction(OperationType.RET, new Operand("summe", Type.ID), null, null));
		
		DataUnit result = new Machine(ins, false).execute();
		
		Assert.assertEquals(result, new DataUnit(8, DataType.INTEGER));
		
	}
	
}
