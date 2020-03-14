package interpreter;

import node.*;

@SuppressWarnings("serial")
public class InterpreterException extends Exception {
	private Token location;

	public InterpreterException(Token location, String message) {
		super("at line " + location.getLine() + " pos " + location.getPos() + " " + message);
		this.location = location;
	}

	public Token getLocation() {
		return this.location;
	}
}
