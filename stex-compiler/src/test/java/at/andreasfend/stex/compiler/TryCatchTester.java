package at.andreasfend.stex.compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.parser.Compiler;
import at.andreasfend.stex.parser.StexProgram;

public class TryCatchTester {

	
	@Test
	public void emptyObject() {
		Compiler compiler = new Compiler();

		String code = "main() { "
				+ "try { var asdf; }"
				+ "catch(e) { var qwer; }"
				+ "}";

		StexProgram program = compiler.compile(code);

		// 1: Trycatch
		assertEquals(program.getInstructions().get(1).getOp(), OperationType.TRYCATCH);
	}
	
}
