package at.andreasfend.virtualmachine.runtime;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import at.andreasfend.virtualmachine.runtime.Operand.Type;

public class TestRuntime {

	public static void main(String[] args) {

		Machine machine = new Machine(converts(), false);
		machine.run();
		
		
	}

	private static List<Instruction> subRoutine() {
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

		return ins;
	}

	private static List<Instruction> compare() {
		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("0", Type.VAL), null, "res"));

		ins.add(new Instruction(OperationType.CONST, new Operand("4", Type.VAL), null, "_c1"));
		ins.add(new Instruction(OperationType.CONST, new Operand("5", Type.VAL), null, "_c2"));
		ins.add(new Instruction(OperationType.VAR, new Operand("null", Type.VAL), null, "cp"));
		ins.add(new Instruction(OperationType.SMALLER, new Operand("_c1", Type.ID), new Operand("_c2", Type.ID), "cp"));

		ins.add(new Instruction(OperationType.CMP, new Operand("cp", Type.ID), new Operand(6, Type.VAL), null));
		ins.add(new Instruction(OperationType.JMP, new Operand(7, Type.VAL), null, null));

		ins.add(new Instruction(OperationType.ASSIGN, new Operand("10", Type.VAL), null, "res"));

		ins.add(new Instruction(OperationType.ADD, new Operand("res", Type.ID), new Operand("1", Type.VAL), "res"));

		ins.add(new Instruction(OperationType.RET, new Operand("res", Type.ID), null, null));

		return ins;
	}

	private static List<Instruction> ggt() {
		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("32", Type.VAL), null, "zahl1"));
		ins.add(new Instruction(OperationType.VAR, new Operand("16", Type.VAL), null, "zahl2"));

		ins.add(new Instruction(OperationType.VAR, new Operand("null", Type.VAL), null, "cpw"));
		ins.add(new Instruction(OperationType.VAR, new Operand("null", Type.VAL), null, "cpi"));

		// While Head: 4
		ins.add(new Instruction(OperationType.NOTEQUALS, new Operand("zahl2", Type.ID), new Operand("0", Type.VAL),
				"cpw"));
		ins.add(new Instruction(OperationType.CMP, new Operand("cpw", Type.ID), new Operand(6, Type.VAL), null));
		ins.add(new Instruction(OperationType.JMP, new Operand(12, Type.VAL), null, null));
		// While Body
		// IF Statement: 7
		ins.add(new Instruction(OperationType.BIGGER, new Operand("zahl1", Type.ID), new Operand("zahl2", Type.ID),
				"cpi"));
		ins.add(new Instruction(OperationType.CMP, new Operand("cpi", Type.ID), new Operand(9, Type.VAL), null));
		ins.add(new Instruction(OperationType.JMP, new Operand(10, Type.VAL), null, null));

		// THEN: 10
		ins.add(new Instruction(OperationType.SUB, new Operand("zahl1", Type.ID), new Operand("zahl2", Type.ID),
				"zahl1"));

		// ELSE: 11
		ins.add(new Instruction(OperationType.SUB, new Operand("zahl2", Type.ID), new Operand("zahl1", Type.ID),
				"zahl2"));

		// While Bottom: 12
		ins.add(new Instruction(OperationType.JMP, new Operand(3, Type.VAL), null, null));

		// While End: 13
		ins.add(new Instruction(OperationType.RET, new Operand("zahl1", Type.ID), null, null));

		return ins;
	}

	private static List<Instruction> blockTest() {
		int whileHead = 2;
		int whileBody = 5;
		int whileEnd = 12;

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("0", Type.VAL), null, "sum"));
		ins.add(new Instruction(OperationType.VAR, new Operand("4", Type.VAL), null, "i"));

		ins.add(new Instruction(OperationType.VAR, new Operand("null", Type.VAL), null, "cmp"));

		// While Head: 3
		ins.add(new Instruction(OperationType.BIGGER, new Operand("i", Type.ID), new Operand("0", Type.VAL), "cmp"));
		ins.add(new Instruction(OperationType.CMP, new Operand("cmp", Type.ID), new Operand(whileBody, Type.VAL),
				null));
		ins.add(new Instruction(OperationType.JMP, new Operand(whileEnd, Type.VAL), null, null));

		// While Body: 6
		ins.add(new Instruction(OperationType.BLOCK, null, null, null));
		ins.add(new Instruction(OperationType.VAR, null, null, "e"));
		ins.add(new Instruction(OperationType.MUL, new Operand("i", Type.ID), new Operand("i", Type.ID), "e"));
		ins.add(new Instruction(OperationType.ADD, new Operand("sum", Type.ID), new Operand("e", Type.ID), "sum"));
		ins.add(new Instruction(OperationType.SUB, new Operand("i", Type.ID), new Operand("1", Type.VAL), "i"));

		// While Bottom: 11
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		ins.add(new Instruction(OperationType.JMP, new Operand(whileHead, Type.VAL), null, null));

		// While End: 13
		ins.add(new Instruction(OperationType.RET, new Operand("sum", Type.ID), null, null));

		return ins;
	}

	private static List<Instruction> pointer1() {

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("0", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, new Operand("1", Type.VAL), null, "y"));
		ins.add(new Instruction(OperationType.VAR, new Operand("4", Type.VAL), null, "pointer"));

		// pointer = &x;
		ins.add(new Instruction(OperationType.REF, new Operand("x", Type.ID), null, "pointer"));

		// *pointer = 6;
		ins.add(new Instruction(OperationType.WREF, new Operand("6", Type.VAL), null, "pointer"));

		// y = *pointer;
		ins.add(new Instruction(OperationType.RREF, new Operand("pointer", Type.ID), null, "y"));

		ins.add(new Instruction(OperationType.RET, new Operand("y", Type.ID), null, null));

		return ins;
	}

	private static List<Instruction> pointer2() {

		int setFunction = 7 - 1;

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("0", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, new Operand("4", Type.VAL), null, "pointer"));
		ins.add(new Instruction(OperationType.REF, new Operand("x", Type.ID), null, "pointer"));

		ins.add(new Instruction(OperationType.SUBSTACK, null, null, null));
		ins.add(new Instruction(OperationType.PARAMETER, new Operand("pointer", Type.ID), null, "arg1"));
		ins.add(new Instruction(OperationType.CALL, new Operand(setFunction, Type.VAL), null, null));

		ins.add(new Instruction(OperationType.RET, new Operand("x", Type.ID), null, null));

		// Set:
		ins.add(new Instruction(OperationType.WREF, new Operand("6", Type.VAL), null, "arg1"));
		ins.add(new Instruction(OperationType.RET, null, null, null));

		return ins;
	}
	
	private static List<Instruction> byrefproblem() {

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("5", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, new Operand("x", Type.ID), null, "y"));
		ins.add(new Instruction(OperationType.VAR, null, null, "pointer"));
		ins.add(new Instruction(OperationType.REF, new Operand("x", Type.ID), null, "pointer"));
		ins.add(new Instruction(OperationType.WREF, new Operand("10", Type.VAL), null, "pointer"));
		ins.add(new Instruction(OperationType.RET, new Operand("y", Type.ID), null, null));
		
		return ins;
	}
	
	private static List<Instruction> array() {

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, null, null, "a"));
		ins.add(new Instruction(OperationType.ARRAY, new Operand(5, Type.VAL), null, "a"));
		ins.add(new Instruction(OperationType.WARRAY, new Operand(5, Type.VAL), new Operand(2, Type.VAL), "a"));
		ins.add(new Instruction(OperationType.VAR, new Operand("1", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.RARRAY, new Operand("a", Type.ID), new Operand(2, Type.VAL), "x"));
		ins.add(new Instruction(OperationType.RET, new Operand("x", Type.ID), null, null));
		
		return ins;
	}
	
	private static List<Instruction> io() {

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, null, null, "x"));
		ins.add(new Instruction(OperationType.PRINT, new Operand("x", Type.ID), null, null));
		ins.add(new Instruction(OperationType.READ, null, null, "x"));
		ins.add(new Instruction(OperationType.ERR, new Operand("EXIT", Type.VAL), null, null));
		ins.add(new Instruction(OperationType.RET, new Operand("x", Type.ID), null, null));
		
		return ins;
	}
	
	private static List<Instruction> converts() {

		List<Instruction> ins = new LinkedList<>();

		// Main: 0
		ins.add(new Instruction(OperationType.VAR, new Operand("false", Type.VAL), null, "x"));
		ins.add(new Instruction(OperationType.VAR, null, null, "int"));
		ins.add(new Instruction(OperationType.VAR, null, null, "float"));
		ins.add(new Instruction(OperationType.VAR, null, null, "bool"));
		ins.add(new Instruction(OperationType.VAR, null, null, "string"));
		
		
		ins.add(new Instruction(OperationType.INT, new Operand("x", Type.ID), null, "int"));
		ins.add(new Instruction(OperationType.FLOAT, new Operand("x", Type.ID), null, "float"));
		ins.add(new Instruction(OperationType.BOOL, new Operand("x", Type.ID), null, "bool"));
		ins.add(new Instruction(OperationType.STRING, new Operand("x", Type.ID), null, "string"));

		ins.add(new Instruction(OperationType.RET, new Operand("string", Type.ID), null, null));
		
		return ins;
	}

}
