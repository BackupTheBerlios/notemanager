/*
 * Created on 2 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr;


import java.util.ArrayList;

/**
 * @author jrichert
 *
  */
public class Evaluate {

	 
    public static ArrayList<String> evaluate(final Expr expr){
    	return expr.eval();
    
    
    }
	
	
}
