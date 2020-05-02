package structure;

import java.util.*;
import node.*;
import structure.set.Set;

public class Scope {
	private final Scope parent;
	private final Map<String, Set> elements = new HashMap<>();

	public Scope(Scope parent) {
		this.parent = parent;
	}

	// public void addDeclaration(ADeclarationStatement node) {
	// 	Token variable = node.getIdentifier();
	// 	String name = variable.getText();
	// 	if (alreadyDeclared(name)) {
	// 		throw new SemanticException("variable " + name + " has already been declared", variable);
	// 	}
	// 	this.variables.put(name, Type.getType(node.getType()));
	// }

	// private boolean alreadyDeclared(String name) {
	// 	if (this.variables.containsKey(name)) {
	// 		return true;
	// 	}
	// 	if (this.parent != null) {
	// 		return this.parent.alreadyDeclared(name);
	// 	}
	// 	return false;
	// }

	// public Type getType(TIdentifier variable) {
	// 	String name = variable.getText();
	// 	if (this.variables.containsKey(name)) {
	// 		return this.variables.get(name);
	// 	}
	// 	if (this.parent != null) {
	// 		return this.parent.getType(variable);
	// 	}
	// 	throw new SemanticException("variable '" + name + "' has no declaration", variable);
	// }

	public Scope getParent() {
		return this.parent;
	}
}
