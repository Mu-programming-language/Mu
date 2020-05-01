package semantic;

import analysis.*;
import node.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class NumberAnalysis extends DepthFirstAdapter {
	private List<Integer> asks = new ArrayList<Integer>();

	private NumberAnalysis() {}

	public static void run(Node tree) {
		NumberAnalysis numberAnalysis = new NumberAnalysis();
		tree.apply(numberAnalysis);
	}

	@Override
	public void caseAAskInstruction(AAskInstruction node) {
		Integer number = Integer.parseInt(node.getNumber().getText());
		this.asks.add(number);
	}

	@Override
	public void caseAProofInstruction(AProofInstruction node) {
		Integer number = Integer.parseInt(node.getNumber().getText());
		if (!this.asks.contains(number)) {
			throw new SemanticException("'#" + number + "' not referenced in ask statement", node.getNumber());
		}
	}
}
