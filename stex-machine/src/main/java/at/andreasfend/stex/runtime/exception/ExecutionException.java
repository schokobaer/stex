package at.andreasfend.stex.runtime.exception;

public class ExecutionException extends RuntimeException {

	private int line;
	
	public ExecutionException(String ms) {
		super(ms);
	}
	
	public int getLineNumber() {
		return line;
	}
	
	public void setLineNumber(int lineNumber) {
		this.line = lineNumber;
	}
	
}
