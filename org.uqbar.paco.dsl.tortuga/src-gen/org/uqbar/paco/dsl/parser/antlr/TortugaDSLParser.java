/*
* generated by Xtext
*/
package org.uqbar.paco.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.uqbar.paco.dsl.services.TortugaDSLGrammarAccess;

public class TortugaDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TortugaDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.uqbar.paco.dsl.parser.antlr.internal.InternalTortugaDSLParser createParser(XtextTokenStream stream) {
		return new org.uqbar.paco.dsl.parser.antlr.internal.InternalTortugaDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "TortugaProgram";
	}
	
	public TortugaDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TortugaDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
