/*
 * Created on 5 mars 2005
 *
 */
package fr.umlv.symphonie.formula.expr;

import fr.umlv.symphonie.formula.expr.Expr;

import java.util.ArrayList;

import fr.umlv.symphonie.mediator.*;

/**
 * @author jrichert
 *
 * This class create an expression with column's or line's element 
 */
public class ColumnValue {

    /**
     * Give column's result.
     * @param mediator give information on the table
     * @param columnName is column's name where we takes information
     * @return Expr with an arraylist of result
     */
	public static Expr getValue(final FormulaViewMediator mediator,final String columnName) {
	    return new Expr() {
		    public ArrayList<String> eval() {		    	
		    	ArrayList<String> list = mediator.getData(columnName);
		    	return list;
		    }
			    
		};
	    }
	
	
}
