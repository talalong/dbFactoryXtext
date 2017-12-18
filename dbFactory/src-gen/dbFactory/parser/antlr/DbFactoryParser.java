/*
 * generated by Xtext 2.12.0
 */
package dbFactory.parser.antlr;

import com.google.inject.Inject;
import dbFactory.parser.antlr.internal.InternalDbFactoryParser;
import dbFactory.services.DbFactoryGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DbFactoryParser extends AbstractAntlrParser {

	@Inject
	private DbFactoryGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDbFactoryParser createParser(XtextTokenStream stream) {
		return new InternalDbFactoryParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public DbFactoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DbFactoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
