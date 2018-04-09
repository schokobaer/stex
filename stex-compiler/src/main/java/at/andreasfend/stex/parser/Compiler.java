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

	public List<Instruction> compile(String sourceCode) {

		Parser parser = new Parser();
		ParseTree tree = parser.parse(sourceCode);
		StexVisitor visitor = new StexVisitor();
		ReferenzResolver refResolver = new ReferenzResolver();

		List<Instruction> program = visitor.visit(tree);
		program = refResolver.resolve(program);

		return program;
	}

	public List<Instruction> compile(File[] inputFiles) {
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
	
	
	public static void main(String[] args) {
		Compiler compiler = new Compiler();
		
		List<Instruction> program = compiler.compile(
				new File[] {new File("D:\\Workspace\\stex\\stex-compiler\\src\\test\\resources\\parsing\\summe.stex")});
		
		for (int i=0; i < program.size(); i++) {
			Instruction instruction = program.get(i);
			if(instruction.getOp() == OperationType.MARK && instruction.getTarget() != null
					&& !instruction.getTarget().contains("_") && i > 0)
				System.out.println();
			System.out.println(i + "\t" + instruction);
		}
		
	}

}
