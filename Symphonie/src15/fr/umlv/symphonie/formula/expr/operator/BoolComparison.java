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
public class BoolComparison {

	public enum TestBool {
		AND {
			ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2){
		    ArrayList<String> result = new ArrayList<String>();
		    
		    for(int ind = 0;ind < v1.size();ind++)
		    {
		    	if(Boolean.getBoolean(v1.get(ind)) == true && Boolean.getBoolean(v2.get(ind)) == true)
		    		{
		    		result.add(0,"true");
		    		}
		    	else {
		        result.add(0,"false");
		    	}
		    }
				return result;
			}
		    		
		    	
		    
		}, OR {
		ArrayList<String> test(ArrayList<String> v1,ArrayList<String> v2) {
			 ArrayList<String> result = new ArrayList<String>();
			    
			    for(int ind = 0;ind < v1.size();ind++)
			    {
			    	if(Boolean.getBoolean(v1.get(ind)) == true || Boolean.getBoolean(v2.get(ind)) == true)
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
	
	public static Expr binOp(final TestBool cmp,final Expr left,final Expr right) {
    	return new Expr() {		
    		public ArrayList<String> eval() {    			    		
    		  return cmp.test(left.eval(),right.eval());
    				}
    	    };
        }
	
	
}
