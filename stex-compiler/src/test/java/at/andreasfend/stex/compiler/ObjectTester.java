package at.andreasfend.stex.compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.parser.Compiler;
import at.andreasfend.stex.parser.StexProgram;

public class ObjectTester {

	@Test
	public void emptyObject() {
		Compiler compiler = new Compiler();

		String code = "main() { var obj = { name }; }";

		StexProgram program = compiler.compile(code);

		assertEquals(program.getInstructions().get(3).getOp(), OperationType.OBJECT);
	}
	
}
