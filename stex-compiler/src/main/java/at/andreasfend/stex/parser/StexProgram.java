package at.andreasfend.stex.parser;

import java.util.List;

import at.andreasfend.stex.core.Instruction;

public class StexProgram {

	private List<Instruction> instructions;
	private Integer startingPoint;
	
	public StexProgram(List<Instruction> instructions, Integer startingPoint) {
		this.instructions = instructions;
		this.startingPoint = startingPoint;
	}
	
	public StexProgram(List<Instruction> instructions) {
		this(instructions, null);
	}
	
	public List<Instruction> getInstructions() {
		return instructions;
	}
	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}
	public Integer getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(Integer startingPoint) {
		this.startingPoint = startingPoint;
	}
	
	
	
}
