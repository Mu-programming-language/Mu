package compiler;

import java.io.*;
import analysis.*;
import node.*;

public class Compiler extends DepthFirstAdapter {
	private PrintStream output;

	private Compiler(String outputFilename) throws IOException {
		FileOutputStream file = new FileOutputStream(outputFilename);
		this.output = new PrintStream(file);
	}

	public static void run(String outputFilename, Node tree) throws IOException {
		Compiler compiler = new Compiler(outputFilename);
		tree.apply(compiler);
	}

	@Override
	public void inASetTheoryProgram(ASetTheoryProgram node) {
		this.output.println(node.getCategory().getText() + " " + node.getSetTheory().getText() + node.getSemicolon().getText());
		this.output.println();
	}

	@Override
	public void inAStatementBlock(AStatementBlock node) {
		this.output.println(node.getStatement().getText() + node.getColumn().getText());
	}

	@Override
	public void inAAskBlock(AAskBlock node) {
		this.output.println(node.getAsk().getText() + node.getColumn().getText());
	}

	@Override
	public void inAProofBlock(AProofBlock node) {
		this.output.println(node.getProof().getText() + node.getColumn().getText());
	}

	@Override
	public void inADeclarationStatementInstruction(ADeclarationStatementInstruction node) {
		this.output.print(node.getLet().getText());
	}

	@Override
	public void inADefinitionStatementInstruction(ADefinitionStatementInstruction node) {
		this.output.print(node.getLet().getText());
	}


}
