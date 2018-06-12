package at.andreasfend.stex.compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.parser.Compiler;
import at.andreasfend.stex.parser.StexProgram;

public class ArrayTester {

	@Test
	public void arrayInitEmpty() {

		Compiler compiler = new Compiler();

		String code = "main() { var arr = []; }";

		StexProgram program = compiler.compile(code);
		// 3: arr, ARRAY 0 -> _tmp0, ASSIGN _tmp0 -> arr
		assertEquals(program.getInstructions().get(3).getOp(), OperationType.ARRAY);
		assertEquals(program.getInstructions().get(3).getOp1().getValue(), new Integer(0));
	}

	@Test
	public void arrayInitThree() {
		Compiler compiler = new Compiler();

		String code = "main() { var arr = [4, 5, 6]; }";

		StexProgram program = compiler.compile(code);

		assertEquals(program.getInstructions().get(3).getOp(), OperationType.ARRAY);
		assertEquals(program.getInstructions().get(3).getOp1().getValue(), new Integer(3));
		
		assertEquals(program.getInstructions().get(4).getOp(), OperationType.WARRAY);
		assertEquals(program.getInstructions().get(4).getOp1().getValue(), "4");
		assertEquals(program.getInstructions().get(4).getOp2().getValue(), 0);
		assertEquals(program.getInstructions().get(5).getOp(), OperationType.WARRAY);
		assertEquals(program.getInstructions().get(5).getOp1().getValue(), "5");
		assertEquals(program.getInstructions().get(5).getOp2().getValue(), 1);
		assertEquals(program.getInstructions().get(6).getOp(), OperationType.WARRAY);
		assertEquals(program.getInstructions().get(6).getOp1().getValue(), "6");
		assertEquals(program.getInstructions().get(6).getOp2().getValue(), 2);
	}
}
