/*
 * Created on 2 mars 2005
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
 * @author jrichert
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Average {

	

	
	 public static Expr function(final Courses courses,final FormulaViewMediator mediator) {
	    return new Expr() {
		    public ArrayList<String> eval() {
		    	
		    	float oldValue;
		    	float div = 1.0f;
		    	
		    	
		    	ArrayList<String> result = new ArrayList<String>();
		    	ArrayList<String> listCourses = courses.getList();
		    	div = listCourses.size();
		    	
		    	for(int i = 0;i < div;i++)
		    	{
		    		
		    		ArrayList<String> data = mediator.getData(listCourses.get(i));
		    		for(int j = 0;j < data.size();j++)
		    			if(i == 0)	
		    				result = new ArrayList<String>(data);
		    			else
			    			{		    				
		    				oldValue = Float.parseFloat(result.get(j));
		    				result.set(j,String.valueOf(Float.parseFloat(data.get(j))+oldValue));
			    			}
		    	}
		    	System.out.println(result);
		    	for(int i = 0;i < mediator.nbElt();i++)
		    	{
		    		oldValue = Float.parseFloat(result.get(i));			    	
		    		result.set(i,String.valueOf(oldValue/div));
		    	}
		    	return result;
		    }
	
	    };
	 }
	
}
