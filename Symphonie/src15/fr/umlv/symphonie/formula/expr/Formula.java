/*
 * Created on 23 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr;

import java.util.ArrayList;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface Formula {

	/**
	 * This function takes a formula. It calls lexer, parser (create a tree) and develop result.
	 * @param request is the formula calculate by module
	 * @return sablecc's result
	 */
	public ArrayList<String> getFormula(String request) throws Exception;
	
}
