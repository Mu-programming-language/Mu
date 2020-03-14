package semantic;

import analysis.*;
import node.*;
import set.*;
import java.util.HashMap;
import java.util.Map;

public class TypeAnalysis extends DepthFirstAdapter {
	private Map<String, Set> sets = new HashMap<String, Set>();

	private TypeAnalysis() {}

	public static void start(Node tree) {
		TypeAnalysis typeAnalysis = new TypeAnalysis();
		tree.apply(typeAnalysis);
	}

	@Override
	public void caseADeclarationStatementInstruction(ADeclarationStatementInstruction node) {
		String id = node.getSetIdentifier().getText();
		this.sets.put(id, new Empty());
	}

	@Override
	public void caseAAssignmentStatementInstruction(AAssignmentStatementInstruction node) {
		// TODO Auto-generated method stub
		super.caseAAssignmentStatementInstruction(node);
	}

	@Override
	public void caseADefinitionStatementInstruction(ADefinitionStatementInstruction node) {
		// String id = node.getSetIdentifier().getText();

	}
}
