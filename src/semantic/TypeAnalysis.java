package semantic;

import analysis.*;
import node.*;
import java.util.List;
import java.util.ArrayList;

public class TypeAnalysis extends DepthFirstAdapter {
	private List<String> sets = new ArrayList<String>();

	private TypeAnalysis() {}

	public static void run(Node tree) {
		TypeAnalysis typeAnalysis = new TypeAnalysis();
		tree.apply(typeAnalysis);
	}

	@Override
	public void inADefinitionStatementInstruction(ADefinitionStatementInstruction node) {
		String set = node.getNew().getText();
		this.sets.add(set);
	}

	@Override
	public void inAIdentifierSetTerm(AIdentifierSetTerm node) {
		String set = node.getSetIdentifier().getText();
		if (!this.sets.contains(set)) {
			throw new SemanticException("unknow set " + node.getSetIdentifier().getText(), node.getSetIdentifier());
		}
	}
}
