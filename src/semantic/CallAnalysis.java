package semantic;

import analysis.*;
import node.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class CallAnalysis extends DepthFirstAdapter {
	private List<String> variables = new ArrayList<String>();

	private CallAnalysis() {}

	public static void run(Node tree) {
		CallAnalysis callAnalysis = new CallAnalysis();
		tree.apply(callAnalysis);
	}


}
