package at.andreasfend.stex.parser.node;

import java.util.List;

import at.andreasfend.stex.core.Instruction;

public interface Parsable {
	List<Instruction> parse();
}
