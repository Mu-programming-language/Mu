
package semantic;

import node.*;

public class SemanticException extends RuntimeException {
	private static final long serialVersionUID = -2698039146960913347L;

	public SemanticException(String message, Token token) {
		super(message + " at line " + token.getLine() + " position " + token.getPos());
	}
}
