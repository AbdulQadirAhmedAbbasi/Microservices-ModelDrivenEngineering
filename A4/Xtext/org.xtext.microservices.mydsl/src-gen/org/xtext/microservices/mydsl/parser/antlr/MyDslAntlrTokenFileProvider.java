/*
 * generated by Xtext 2.25.0
 */
package org.xtext.microservices.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/microservices/mydsl/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
