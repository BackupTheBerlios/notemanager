/*
 * Created on 11 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr.plugins;

import java.util.ArrayList;

import fr.umlv.symphonie.formula.expr.Courses;
import fr.umlv.symphonie.formula.expr.Expr;

import fr.umlv.symphonie.mediator.FormulaViewMediator;

/**
 * @author julien
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Max {

	
	 public static Expr function(final Courses courses,final FormulaViewMediator mediator) {
	    return new Expr() {
		    public ArrayList<String> eval() {
		    	float newValue;
		    	float oldValue;
		    	
		    	ArrayList<String> result = new ArrayList<String>();
		    	ArrayList<String> listCourses = courses.getList();
		    	
		    	for(int i = 0;i < listCourses.size();i++)
		    	{
		    		
		    		ArrayList<String> data = mediator.getData(listCourses.get(i));
		    		for(int j = 0;j < data.size();j++)
		    			if(i == 0)	
		    				result = new ArrayList<String>(data);
		    			else
			    			{
		    				newValue = Float.parseFloat(data.get(j));
		    				oldValue = Float.parseFloat(result.get(j));
		    				if(oldValue < newValue)		    					
		    					result.set(j,String.valueOf(newValue));
			    			}
		    	}
		    	
		    	return result;
		    }
	
	    };
	 }
	
}
