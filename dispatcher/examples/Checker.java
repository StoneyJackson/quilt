import java.io.IOException;

import org.antlr.runtime.*;
public class Checker{
	public static void main(String[] args) throws RecognitionException{
		CharStream cs = null;
		try {
			cs = new ANTLRFileStream(args[0]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QuiltDispatchBasicLexer lexer = new QuiltDispatchBasicLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		
		
		
		/*With this TokenStream an instance of the parser can be created*/
		QuiltDispatchBasicParser parser = new QuiltDispatchBasicParser(tokens);
		
		//attempts to recognize a rulesheet. Prints syntax errors
		parser.rulesheet();

		/*The parser can then be used to parse the input. To parse a Java 'compilationUnit' - one of the nonterminals defined by java.g - run
		RuleReturnScope result = parser.compilationUnit();*/
		System.out.println("Lexing complete");
		
	}
}
