/*
 * Created on 9 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr;

import java.io.PushbackReader;
import java.io.StringReader;

import java.util.ArrayList;

import fr.umlv.symphonie.formula.sablecc.lexer.Lexer;
import fr.umlv.symphonie.formula.sablecc.node.Start;
import fr.umlv.symphonie.formula.sablecc.parser.Parser;

import fr.umlv.symphonie.mediator.FormulaViewMediator;
import fr.umlv.symphonie.IGFormColleague;

/**
 * @author jrichert
 *
  */
public class DefaultFormula extends IGFormColleague implements Formula {

	private static ArrayList<String> result;
	 
	/**
	 * Call a superConstructor with mediator's param
	 * @param mediator 
	 */
	public DefaultFormula(FormulaViewMediator mediator)
	{
		super(mediator);
	}

	/**
	 *Set a result calculate by sablecc. 
	 *@param ArrayList<String> is set element of an evaluation
	 */
	public static void setResult(ArrayList<String> evaluation)
	{
		result = evaluation;
	}
	

	/**
	 * This function takes a formula. It calls lexer, parser (create a tree) and develop result.
	 * @param request is the formula calculate by module
	 * @return sablecc's result
	 */
	public ArrayList<String> getFormula(String request) throws Exception
	{
		Lexer lexer = new Lexer (new PushbackReader(new StringReader(request)));
	    Parser parser = new Parser(lexer);
	    Start ast = parser.parse();
	  
	    Context context=new Context();
	    ast.apply(new FormulaInterpret(context,this.getMediator()));
		
		return result;
	}
	
}

