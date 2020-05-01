import parser.*;
import lexer.*;
import node.*;
import java.io.*;
import interpreter.*;
import semantic.*;

public class Main {
	public static void main(String[] arguments) {
		if (arguments.length == 0) {
			System.err.println("COMMAND-LINE ERROR: missing filename argument.");
			System.exit(1);
		}
		else if (arguments.length > 1) {
			System.err.println("COMMAND-LINE ERROR: too many arguments.");
			System.exit(1);
		}
		try {
			Parser parser = new Parser(new Lexer(new PushbackReader(new FileReader(arguments[0]), 1024)));
			Node tree;
			tree = parser.parse();

			NumberAnalysis.run(tree);


			// FunctionTable functionTable = new FunctionTable();
			// FunctionFinder.startAnalyse(functionTable, tree);
			// CallVerifier.startAnalyse(functionTable, tree);

			Interpreter.start(tree);
		}
		catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND ERROR: " + e.getMessage() + ".");
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println("INPUT/OUTPUT ERROR: " + e.getMessage());
			System.exit(1);
		}
		catch (LexerException e) {
			System.err.println("LEXICAL ERROR: " + e.getMessage());
			System.exit(1);
		}
		catch (ParserException e) {
			System.err.println("SYNTAX ERROR: " + e.getMessage());
			System.exit(1);
		}
	}
}
