package at.andreasfend.stex.runtime.test;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.runtime.DataType;
import at.andreasfend.stex.runtime.DataUnit;
import at.andreasfend.stex.runtime.Machine;

public class TryCatchTest {

	@Test
	public void throwInTryBlock() {
		
		int jmpCatchHead = 5;
		int jmpCatchEnd = 7;
		
		List<Instruction> ins = new LinkedList<>();

		// var res = 5;
		ins.add(new Instruction(OperationType.VAR, new Operand(5, Type.VAL),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));

		// try
		ins.add(new Instruction(OperationType.TRYCATCH, new Operand(jmpCatchHead, Type.VAL), null, "e"));
		
		// throw 2;
		ins.add(new Instruction(OperationType.THROW, new Operand("2", Type.VAL), null, null));
		
		// res = 10;
		ins.add(new Instruction(OperationType.ASSIGN, new Operand(10, Type.VAL),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));
		
		// Leave try-catch
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		ins.add(new Instruction(OperationType.JMP, new Operand(jmpCatchEnd, Type.VAL), null, null));
		
		// catch(e)
		// res = 20;
		ins.add(new Instruction(OperationType.ASSIGN, new Operand(20, Type.VAL),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));
		
		// Leave catch
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		
		// return res
		ins.add(new Instruction(OperationType.RET, new Operand("res", Type.ID), null, null));
		
		Integer result = new Machine(ins, false).execute().getInteger();
		
		Assert.assertEquals(result, new Integer(20));
		
	}
	
	@Test
	public void throwInSubroutine() {
		
		int jmpCatchHead = 9;
		int jmpCatchEnd = 11;
		int summeHead = 12;
		
		List<Instruction> ins = new LinkedList<>();

		// var res = 5;
		ins.add(new Instruction(OperationType.VAR, new Operand(5, Type.VAL), null, "res"));

		// try
		ins.add(new Instruction(OperationType.TRYCATCH, new Operand(jmpCatchHead, Type.VAL), null, "e"));
		
			// var a = 100;
			ins.add(new Instruction(OperationType.VAR, new Operand(100, Type.VAL), null, "a"));
			
			// var b = 9;
			ins.add(new Instruction(OperationType.VAR, new Operand(9, Type.VAL), null, "b"));
			
			// res = Summe(a, b);
			ins.add(new Instruction(OperationType.SUBSTACK, null, null, null));
			ins.add(new Instruction(OperationType.PARAMETER, new Operand("a", Type.ID), null, "sum1"));
			ins.add(new Instruction(OperationType.PARAMETER, new Operand("b", Type.ID), null, "sum2"));
			ins.add(new Instruction(OperationType.CALL, new Operand(summeHead, Type.VAL), null, "res"));
		
		// Leave try-catch
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		ins.add(new Instruction(OperationType.JMP, new Operand(jmpCatchEnd, Type.VAL), null, null));
		
		// catch(e)
			// res = 20;
			ins.add(new Instruction(OperationType.ASSIGN, new Operand(55, Type.VAL), null, "res"));
		
		// Leave catch
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		
		// return res
		ins.add(new Instruction(OperationType.RET, new Operand("res", Type.ID), null, null));
		
		
		// Subhead Summe
		// var summe;
		ins.add(new Instruction(OperationType.VAR, null, null, "summe"));

		// summe = sum1 + sum2;
		ins.add(new Instruction(OperationType.ADD, new Operand("sum1", Type.ID), new Operand("sum2", Type.ID),
				"summe"));
		
		// throw 2;
		ins.add(new Instruction(OperationType.THROW, new Operand("sum2", Type.ID), null, "summe"));
		
		// return summe;
		ins.add(new Instruction(OperationType.RET, new Operand("summe", Type.ID), null, null));
		
		
		
		
		
		Integer result = new Machine(ins, false).execute().getInteger();
		
		Assert.assertEquals(result, new Integer(55));
		
	}
	
	@Test
	public void catchException() {
		
		int jmpCatchHead = 5;
		int jmpCatchEnd = 7;
		
		List<Instruction> ins = new LinkedList<>();

		// var res = 5;
		ins.add(new Instruction(OperationType.VAR, new Operand(5, Type.VAL),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));

		// try
		ins.add(new Instruction(OperationType.TRYCATCH, new Operand(jmpCatchHead, Type.VAL), null, "e"));
		
		// throw 2;
		ins.add(new Instruction(OperationType.THROW, new Operand(2, Type.VAL), null, null));
		
		// res = 10;
		ins.add(new Instruction(OperationType.ASSIGN, new Operand(10, Type.VAL),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));
		
		// Leave try-catch
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		ins.add(new Instruction(OperationType.JMP, new Operand(jmpCatchEnd, Type.VAL), null, null));
		
		// catch(e)
		// res = e;
		ins.add(new Instruction(OperationType.ASSIGN, new Operand("e", Type.ID),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));
		
		// Leave catch
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		
		// return res
		ins.add(new Instruction(OperationType.RET, new Operand("res", Type.ID), null, null));
		
		Integer result = new Machine(ins, false).execute().getInteger();
		
		Assert.assertEquals(result, new Integer(2));
		
	}
	
	@Test(expected = RuntimeException.class)
	public void throwUncaughtException() {
				
		List<Instruction> ins = new LinkedList<>();

		// var res = 5;
		ins.add(new Instruction(OperationType.VAR, new Operand(5, Type.VAL),
				new Operand(DataType.INTEGER.getCode(), Type.VAL), "res"));

		// throw 2;
		ins.add(new Instruction(OperationType.THROW, new Operand("2", Type.VAL), null, null));
		
		new Machine(ins, false).execute();
		
	}
	
}
