package semantic;

import analysis.*;
import node.*;
import structure.set.*;
import java.util.HashMap;
import java.util.Map;

public class TypeAnalysis extends DepthFirstAdapter {
	private Map<String, Set> sets = new HashMap<String, Set>();

	private TypeAnalysis() {}

	public static void run(Node tree) {
		TypeAnalysis typeAnalysis = new TypeAnalysis();
		tree.apply(typeAnalysis);
	}


}
