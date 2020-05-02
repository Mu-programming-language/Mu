package interpreter;

import analysis.*;
import node.*;
import structure.element.*;
import java.util.HashMap;
import java.util.Map;

public class Interpreter extends DepthFirstAdapter {
	// private Map<String, Element> elements = new HashMap<String, Element>();

	private Interpreter() {}

	public static void run(Node tree) {
		Interpreter interpreter = new Interpreter();
		tree.apply(interpreter);
	}

}
