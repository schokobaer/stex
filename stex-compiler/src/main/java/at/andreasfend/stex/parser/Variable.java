package at.andreasfend.stex.parser;

public class Variable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Variable(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
