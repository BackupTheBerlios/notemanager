/*
 * Created on 2 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr.operator;


import fr.umlv.symphonie.formula.expr.Expr;

import java.util.ArrayList;

/**
 * @author jrichert
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class FloatComparison {

	 public enum TestFloat {
		 LT {
		  ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
		  	 ArrayList<String> result = new ArrayList<String>();
			    
			    for(int ind = 0;ind < v1.size();ind++)
			    {
			    	if(Float.valueOf(v1.get(ind)) < Float.valueOf(v2.get(ind)))
			    		{
			    		result.add(0,"true");
			    		}
			    	else {
			        result.add(0,"false");
			    	}
			    }
			    return result;
		  				
		    }
		}, LTEQ {
		   ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
		    ArrayList<String> result = new ArrayList<String>();
		    
		    for(int ind = 0;ind < v1.size();ind++)
		    {
		    	if(Float.valueOf(v1.get(ind)) <= Float.valueOf(v2.get(ind)))
		    		{
		    		result.add(0,"true");
		    		}
		    	else {
		        result.add(0,"false");
		    	}
		    }
		    return result;
			   
		    }
		}, GT {
		    ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
		    	ArrayList<String> result = new ArrayList<String>();
			    
			    for(int ind = 0;ind < v1.size();ind++)
			    {
			    	if(Float.valueOf(v1.get(ind)) > Float.valueOf(v2.get(ind)))
			    		{
			    		result.add(0,"true");
			    		}
			    	else {
			        result.add(0,"false");
			    	}
			    }
			    return result;
		
		    }
		}, GTEQ {
		    ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
		    	ArrayList<String> result = new ArrayList<String>();
			    
			    for(int ind = 0;ind < v1.size();ind++)
			    {
			    	if(Float.valueOf(v1.get(ind)) >= Float.valueOf(v2.get(ind)))
			    		{
			    		result.add(0,"true");
			    		}
			    	else {
			        result.add(0,"false");
			    	}
			    }
			    return result;
				   
			    
		    }
		}, EQUAL {
		    ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
		    	ArrayList<String> result = new ArrayList<String>();
			    
			    for(int ind = 0;ind < v1.size();ind++)
			    {
			    	if(Float.valueOf(v1.get(ind)) == Float.valueOf(v2.get(ind)))
			    		{
			    		result.add(0,"true");
			    		}
			    	else {
			        result.add(0,"false");
			    	}
			    }
			    return result;
				   
			
		    }
		}, NEQ {
		    ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
		    	ArrayList<String> result = new ArrayList<String>();
			    
			    for(int ind = 0;ind < v1.size();ind++)
			    {
			    	if(Float.valueOf(v1.get(ind)) != Float.valueOf(v2.get(ind)))
			    		{
			    		result.add(0,"true");
			    		}
			    	else {
			        result.add(0,"false");
			    	}
			    }
			    return result;
				   
		    }
		};
		abstract ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2);	    
	    }
	 
	 
	 
	 public static Expr binOp(final TestFloat cmp,final Expr left,final Expr right) {
		return new Expr() {
				
			public ArrayList<String> eval() {
			    return cmp.test(left.eval(),right.eval());
				
			}
		    };
	    }
	 
	 
	
	
}
