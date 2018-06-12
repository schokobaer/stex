package at.andreasfend.stex.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.OperationType;

public class Compiler {

	/**
	 * Compiles the given source code.
	 * 
	 * @param sourceCode raw stex source code.
	 * @return a valid Stex program.
	 */
	public StexProgram compile(String sourceCode) {

		Parser parser = new Parser();
		ParseTree tree = parser.parse(sourceCode);
		StexVisitor visitor = new StexVisitor();
		ReferenzResolver refResolver = new ReferenzResolver();

		List<Instruction> program = visitor.visit(tree);
		program = refResolver.resolve(program);

		// Find main Method
		for (int i = 0; i < program.size(); i++) {
			Instruction ins = program.get(i);
			if(ins.getOp() == OperationType.MARK && "main".equals(ins.getTarget())) {
				return new StexProgram(program, i);
			}
		}
		
		return new StexProgram(program);
	}

	/**
	 * Reads all input files and compiles them from stex source code to a stex program.
	 * 
	 * @param inputFiles Array of stex source files.
	 * @return a valid Stex program.
	 */
	public StexProgram compile(File[] inputFiles) {
		String sourceCode = "";
		try {
			for (File file : inputFiles) {
				byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
				sourceCode += new String(encoded);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return compile(sourceCode);
	}
	
}
