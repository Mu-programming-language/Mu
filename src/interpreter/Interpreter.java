package interpreter;

import analysis.*;
import node.*;
import element.*;
import java.util.HashMap;
import java.util.Map;

public class Interpreter extends DepthFirstAdapter {
	private Map<String, Element> elements = new HashMap<String, Element>();

	private Interpreter() {}

	public static void start(Node tree) {
		Interpreter interpreter = new Interpreter();
		tree.apply(interpreter);
	}
}
