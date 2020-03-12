import parser.*;
import lexer.*;
import node.*;
import java.io.*;

public class Main {
	public static void main(String[] arguments) {
		Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024)));
		Node tree;
		try {
			tree = p.parse();
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
