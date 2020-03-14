package interpreter;

import analysis.*;
import node.*;
import element.*;
import category.*;
import java.util.HashMap;
import java.util.Map;

public class Interpreter extends DepthFirstAdapter {
	private Category category;
	private Map<String, Element> elements = new HashMap<String, Element>();

	private Interpreter() {}

	public static void start(Node tree) {
		Interpreter interpreter = new Interpreter();
		tree.apply(interpreter);
	}

	@Override
	public void inAProgram(AProgram node) {
		String category = node.getCategory().getText();
		if (category.equals(Category.ANALYSIS.toString())) {
			this.category = Category.ANALYSIS;
		}
		else if (category.equals(Category.ALGEBRA.toString())) {
			this.category = Category.ALGEBRA;
		}
		else if (category.equals(Category.SET_THEORY.toString())) {
			this.category = Category.SET_THEORY;
		}
		else if (category.equals(Category.GEOMETRY.toString())) {
			this.category = Category.GEOMETRY;
		}
		else {
			this.category = Category.STATISTIC_AND_PROBABILITY;
		}
	}

	@Override
	public void caseADeclarationStatementInstruction(ADeclarationStatementInstruction node) {
		// TODO Auto-generated method stub
		super.caseADeclarationStatementInstruction(node);
	}

	@Override
	public void caseAAssignmentStatementInstruction(AAssignmentStatementInstruction node) {
		// TODO Auto-generated method stub
		super.caseAAssignmentStatementInstruction(node);
	}

	@Override
	public void caseADefinitionStatementInstruction(ADefinitionStatementInstruction node) {
		// TODO Auto-generated method stub
		super.caseADefinitionStatementInstruction(node);
	}
}
