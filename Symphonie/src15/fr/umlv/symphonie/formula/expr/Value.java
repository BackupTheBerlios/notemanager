/*
 * Created on 2 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr;

import fr.umlv.symphonie.formula.expr.Expr;

import java.util.ArrayList;

import fr.umlv.symphonie.mediator.FormulaViewMediator;

/**
 * @author jrichert
 *
 */
public class Value {

	  
    public static Expr numberIconst(final int value,final FormulaViewMediator mediator) {
    return new Expr() {
	    public ArrayList<String> eval() {
	    	ArrayList<String> list=new ArrayList<String>();
	    	for(int i = 0;i < mediator.nbElt();i++)
	    		list.add(String.valueOf(value));
		return list;
	    }
		    
	};
    }
    
    public static Expr numberDconst(final float value,final FormulaViewMediator mediator) {
        return new Expr() {
    	    public ArrayList<String> eval() {
    	    	ArrayList<String> list=new ArrayList<String>();
    	    	for(int i = 0;i < mediator.nbElt();i++)
    	    		list.add(String.valueOf(value));
    		return list;
    	    }
    	
    	};
        }
	
}
