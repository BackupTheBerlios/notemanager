/*
 * Created on 5 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.mediator;

import java.util.ArrayList;
import javax.swing.JTable;
import fr.umlv.symphonie.formula.expr.Formula;
/**
 * @author jrichert
 *
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 *
 *This class comunicate between package's formula and package's graphics
 *
 */
public class FVMediator implements FormulaViewMediator {
	
	private final JTable table;
	private final boolean isColumn;
	private Formula formula;
	
	/**
	 * Construct a mediator with a JTable. A variable specifies if the formula is for a olumn or a line
	 * @param table composed with element's table
	 * @param isColumn is variable witch indicate if it's a line or a column
	 */
	public FVMediator(JTable table,boolean isColumn)
	{
		this.table = table;
		this.isColumn = isColumn;
	}
	
	/**
	 *This function return element from JTable with a header's name 
	 *@param colligName is header's name use
	 *@return AraryList is fill with JTabel's element
	 */
	public ArrayList<String> getData(String collignName){
		
	/*
	 table.getModel();
	 */
		
		ArrayList<String> list = new ArrayList<String>();
	list.add("15");
	list.add("5");
	list.add("1");
		
		return list;
	}
	
	/**
	 * This function create an interaction between graphics part and Formula part
	 *  @return ArrayList with all column's or line's name
	 */
	public ArrayList<String> getLineColumnName()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("toto");
	return list;
	}
	
	/**
	 * @return int which is column's or line's number elts
	 */
	public int nbElt(){
		/*if(isColumn)
			return table.getModel().getColumnCount();
		else
			return table.getModel().getRowCount();
	*/
		return 3;
	}
	
	/**
	 * Put a formula in a mediator
	 * @param form is the formula set
	 */
	public void setFormula(Formula form)
	{
		formula = form;
	}
	
	/**
	 * Return a formula's result 
	 * @param query is the formula uses
	 *@return ArrayList which evaluation's result 
	 */
	public ArrayList<String> eval(String query) throws Exception{
		return formula.getFormula(query);  
	}
	
	
	
	
	
}
