/*
 * Created on 5 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.mediator;

import java.util.ArrayList;

/**
 * @author jrichert
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface FormulaViewMediator {

	/**
	 * This function return the JTable's element from JTable 
	 * @param collignName is a string for a line or a column of a JTable
	 * @return ArrayList of column's data 
	 */
	public ArrayList<String> getData(String collignName);
	/**
	 * This function is able to return JTable's title name
	 * @return ArrayList with column or line title
 	 */
	public ArrayList<String> getLineColumnName();			
	/**
	 * Give column or line element's number
	 * @return column/line number elts
	 */
	public int nbElt();
	/**
	 * Send arraylist of result from fromula 
	 * @param formula is a string respresents a mathematic expression 
	 * @return ArrayList of result
	 */
	public ArrayList<String> eval(String formula) throws Exception;
	
}
