package fr.umlv.symphonie.formula.expr.operator;

import fr.umlv.symphonie.formula.expr.Expr;

import java.util.ArrayList;


public class Operations {
   

  public enum Op {
    PLUS {
    	ArrayList<String> operate(ArrayList<String> v1,ArrayList<String> v2){
    		
    		  ArrayList<String> result = new ArrayList<String>();
  		    
  		    for(int ind = 0;ind < v1.size();ind++) 		    
  		    	result.add(0,String.valueOf(Float.valueOf(v1.get(ind)) + Float.valueOf(v2.get(ind))));  		    		
    		
        return result;
      }
    }, MINUS {
    	ArrayList<String> operate(ArrayList<String> v1,ArrayList<String> v2){
    		
    		 ArrayList<String> result = new ArrayList<String>();
   		    
   		    for(int ind = 0;ind < v1.size();ind++) 		    
   		    	result.add(0,String.valueOf(Float.valueOf(v1.get(ind)) - Float.valueOf(v2.get(ind))));
   		    		
     		
         return result;
        
      }
    }, MULT {
    	ArrayList<String> operate(ArrayList<String> v1,ArrayList<String> v2){
    		ArrayList<String> result = new ArrayList<String>();
   		    
   		    for(int ind = 0;ind < v1.size();ind++) 		    
   		    	result.add(0,String.valueOf(Float.valueOf(v1.get(ind)) * Float.valueOf(v2.get(ind))));
   		    		
     		
         return result;
      }
    }, DIV {
    	ArrayList<String> operate(ArrayList<String> v1,ArrayList<String> v2){
    		ArrayList<String> result = new ArrayList<String>();
   		    
   		    for(int ind = 0;ind < v1.size();ind++) 		    
   		    	result.add(0,String.valueOf(Float.valueOf(v1.get(ind)) / Float.valueOf(v2.get(ind))));
   		    		
     		
         return result;
      }
    }, MOD {
    	ArrayList<String> operate(ArrayList<String> v1,ArrayList<String> v2){
    		ArrayList<String> result = new ArrayList<String>();
   		    
   		    for(int ind = 0;ind < v1.size();ind++) 		    
   		    	result.add(0,String.valueOf(Float.valueOf(v1.get(ind)) % Float.valueOf(v2.get(ind))));
   		    		
     		
         return result;
	
      }	  
    };
    abstract ArrayList<String> operate(ArrayList<String> v1,ArrayList<String> v2);
  }
  
  public static Expr binOp(final Op op,final Expr left,final Expr right) {
    return new Expr() {
      public ArrayList<String> eval() {
        return op.operate(left.eval(),right.eval());
      	
      }     
      
    };
    
   
    
  }
   
    
    
  
  
    
 

}
