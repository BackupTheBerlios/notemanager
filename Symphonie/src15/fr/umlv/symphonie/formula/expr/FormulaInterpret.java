package fr.umlv.symphonie.formula.expr;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import fr.umlv.symphonie.formula.sablecc.analysis.AnalysisAdapter;
import fr.umlv.symphonie.formula.sablecc.node.*;

import fr.umlv.symphonie.formula.expr.ColumnValue;
import fr.umlv.symphonie.mediator.FormulaViewMediator;


import fr.umlv.symphonie.formula.expr.operator.BoolComparison;
import fr.umlv.symphonie.formula.expr.operator.FloatComparison;
import fr.umlv.symphonie.formula.expr.operator.Operations;

import static fr.umlv.symphonie.formula.expr.operator.BoolComparison.TestBool.*;
import static fr.umlv.symphonie.formula.expr.operator.FloatComparison.TestFloat.*;
import static fr.umlv.symphonie.formula.expr.operator.Operations.Op.*;





public class FormulaInterpret extends AnalysisAdapter {

  private final Context context;
  private final FormulaViewMediator mediator;

  public FormulaInterpret(Context context,FormulaViewMediator mediator) {
      	this.context = context;
      	this.mediator = mediator;
  }
  
  public void caseStart(Start node) {
  	
       node.getPFormule().apply(this);
       
  }

  public void caseAExprFormule(AExprFormule node)
  {	   
  	node.getExpr().apply(this);
    Expr expr=(Expr)getOut(node.getExpr());
    DefaultFormula.setResult(Evaluate.evaluate(expr));
  }
  
  
    public void caseALowPriorityExpr(ALowPriorityExpr node)
    {	    	      	
    	node.getExprLowPriority().apply(this);
    	Expr e=(Expr)getOut(node.getExprLowPriority());
    	setOut(node,e);
    }

    
    public void caseAAndExpr(AAndExpr node)
    {    	
    	node.getExpr().apply(this);
    	Expr left = (Expr)getOut(node.getExpr());
    	node.getExprLowPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprLowPriority());

    	Expr e=BoolComparison.binOp(AND,left,right);
    	setOut(node,e);   

	 }

    public void caseAOrExpr(AOrExpr node)
    {
      	node.getExpr().apply(this);
    	Expr left = (Expr)getOut(node.getExpr());
    	node.getExprLowPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprLowPriority());

    	Expr e=BoolComparison.binOp(OR,left,right);
    	setOut(node,e);   
	 }
    
    public void caseANormalPriorityExprLowPriority(ANormalPriorityExprLowPriority node)
    {    	
    	node.getExprNormalPriority().apply(this);
    	Expr e = (Expr)getOut(node.getExprNormalPriority());
    	setOut(node,e);   
    }
    
    public void caseALowerThanExprLowPriority(ALowerThanExprLowPriority node)
    {
    	node.getExprLowPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprLowPriority());
    	node.getExprNormalPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprNormalPriority());

    	Expr e=FloatComparison.binOp(LT,left,right);
    	setOut(node,e);   
    }

    
    public void caseALowerEqualExprLowPriority(ALowerEqualExprLowPriority node)
    {
    	node.getExprLowPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprLowPriority());
    	node.getExprNormalPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprNormalPriority());

    	Expr e=FloatComparison.binOp(LTEQ,left,right);
    	setOut(node,e);   
    }
    
    public void caseAGreaterThanExprLowPriority(AGreaterThanExprLowPriority node)
    {
    	node.getExprLowPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprLowPriority());
    	node.getExprNormalPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprNormalPriority());

    	Expr e=FloatComparison.binOp(GT,left,right);
    	setOut(node,e);   
    }
    
    public void caseAGreaterEqExprLowPriority(AGreaterEqExprLowPriority node)
    {
    	node.getExprLowPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprLowPriority());
    	node.getExprNormalPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprNormalPriority());

    	Expr e=FloatComparison.binOp(GTEQ,left,right);
    	setOut(node,e);   	
    }
    
    public void caseAEqualExprLowPriority(AEqualExprLowPriority node)
    {
    	node.getExprLowPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprLowPriority());
    	node.getExprNormalPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprNormalPriority());

    	Expr e=FloatComparison.binOp(EQUAL,left,right);
    	setOut(node,e);   	
    }
    
    public void caseANotEqualExprLowPriority(ANotEqualExprLowPriority node)
    {
    	node.getExprLowPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprLowPriority());
    	node.getExprNormalPriority().apply(this);
    	Expr right = (Expr)getOut(node.getExprNormalPriority());

    	Expr e=FloatComparison.binOp(NEQ,left,right);
    	
    	setOut(node,e);   
    }
    
    public void caseAHighPriorityExprNormalPriority(AHighPriorityExprNormalPriority node)
    {  
    	node.getExprHighPriority().apply(this);
    	Expr e = (Expr)getOut(node.getExprHighPriority());
    	setOut(node,e);   	
    }
    
    
    public void caseAPlusExprNormalPriority(APlusExprNormalPriority node)
    {
	node.getExprNormalPriority().apply(this);
	Expr left = (Expr)getOut(node.getExprNormalPriority());
	node.getExprHighPriority().apply(this);
	Expr right = (Expr)getOut(node.getExprHighPriority());

	Expr e=Operations.binOp(PLUS,left,right);
	setOut(node,e);       
    }

    public void caseAMinusExprNormalPriority(AMinusExprNormalPriority node)
    {   
	node.getExprNormalPriority().apply(this);
	Expr left = (Expr)getOut(node.getExprNormalPriority());
	node.getExprHighPriority().apply(this);
	Expr right = (Expr)getOut(node.getExprHighPriority());

	Expr e=Operations.binOp(MINUS,left,right);

	setOut(node,e);       
    }
    
    public void caseAExpratomExprHighPriority(AExpratomExprHighPriority node)
    {
    	node.getExpratom().apply(this);
    	Expr e = (Expr)getOut(node.getExpratom());
    	setOut(node,e);   	
    }
    
    public void caseAMultExprHighPriority(AMultExprHighPriority node)
    {
    	node.getExprHighPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprHighPriority());
    	node.getExpratom().apply(this);
    	Expr right = (Expr)getOut(node.getExpratom());

    	Expr e=Operations.binOp(MULT,left,right);
    	setOut(node,e);  
    }

    public void caseADivExprHighPriority(ADivExprHighPriority node)
    {
    	node.getExprHighPriority().apply(this);
    	Expr left = (Expr)getOut(node.getExprHighPriority());
    	node.getExpratom().apply(this);
    	Expr right = (Expr)getOut(node.getExpratom());

    	Expr e=Operations.binOp(DIV,left,right);
    	setOut(node,e);  
    }
    
    public void caseAPluginsFunctionExpratom(APluginsFunctionExpratom node)
    {
    
        Courses	courses = new Courses();	
    	
    	setIn(node,courses);
    	node.getBloc().apply(this);
    	
    	/*Creation de la classe*/
    	
    	String className = "fr.umlv.symphonie.formula.expr.plugins.".concat(node.getFunctionKeyName().toString());
    	try {
    		Class function = Class.forName(className.substring(0,className.length()-1));
    		Object o = function.newInstance();
    		Class[] params = {Class.forName("fr.umlv.symphonie.formula.expr.Courses"),Class.forName("fr.umlv.symphonie.mediator.FormulaViewMediator")};
    		
      		
    		Method method = function.getDeclaredMethod("function",params); 
    		Object result = method.invoke(o,courses,mediator);
    		Expr e = (Expr)result;
    	
    		setOut(node,e);
    	}
    
    	catch(SecurityException se){
    		System.out.println("SecurityException");
    	}    	
    	catch(ClassNotFoundException cnfe){    		
    		System.out.println("Pas de classe existante");
    		cnfe.printStackTrace();
		}    	
    	catch(IllegalAccessException iae){
    		System.out.println("Illegal access Exception");
    	}
    	catch (NoSuchMethodException e) {
			
			e.printStackTrace();
		}
    	catch (IllegalArgumentException e) {
			
			e.printStackTrace();
			
		}
		catch (InvocationTargetException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		}
    	
    	
    
    	
    }
    
    public void caseAIconstExpratom(AIconstExpratom node)
    {
    	
    	Expr e = Value.numberIconst(Integer.parseInt(node.getIconst().getText()),mediator);
    	setOut(node,e);
    }

    public void caseADconstExpratom(ADconstExpratom node)
    {
    	Expr e = Value.numberDconst(Float.parseFloat(node.getDconst().getText()),mediator);
    	setOut(node,e);
    }
  
       
    public void caseAColumnExpratom(AColumnExpratom node)
    {
    	
    	Expr e = ColumnValue.getValue(mediator,node.getName().getText());
    	setOut(node,e);
    	    	
    	
    }

   
    public void caseAPluginsKeyWordsBloc(APluginsKeyWordsBloc node)
    {
    	Courses c = (Courses)getIn(node.parent()); 
    	    	
    

    	String className = "fr.umlv.symphonie.formula.expr.plugins.".concat(node.getFunctionKeyName().toString());
    	try {
    		Class function = Class.forName(className.substring(0,className.length()-1));
    		Object o = function.newInstance();
    		Class[] params = {Class.forName("fr.umlv.symphonie.mediator.FormulaViewMediator")};
    		
      		
    		Method method = function.getDeclaredMethod("keyword",params); 
    		Object result = method.invoke(o,mediator);
    		c = (Courses)result;
    		setIn(node,c);
    		
    	}
    
    	catch(SecurityException se){
    		System.out.println("SecurityException");
    	}    	
    	catch(ClassNotFoundException cnfe){    		
    		System.out.println("Pas de classe existante");
    		cnfe.printStackTrace();
		}    	
    	catch(IllegalAccessException iae){
    		System.out.println("Illegal access Exception");
    	}
    	catch (NoSuchMethodException e) {
			
			e.printStackTrace();
		}
    	catch (IllegalArgumentException e) {
			
			e.printStackTrace();
			
		}
		catch (InvocationTargetException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		}
    	
    	
    
    	
    	
    	
    }
  
   
    
    public void caseACellAccessBloc(ACellAccessBloc node)
    {
    	setIn(node,getIn(node.parent()));
    	node.getCourses().apply(this);
    }
    

    public void caseASingleCourses(ASingleCourses node)
    {    	
    	Courses c = (Courses)getIn(node.parent()); 	
    	c.getList().add(node.getName().getText());
    	setIn(node,c);
    }
    

    public void caseAMultipleCourses(AMultipleCourses node)
    {
    	Courses c = (Courses)getIn(node.parent()); 	
    	c.getList().add(node.getName().getText());
    	
    	setIn(node,c);
        node.getCourses().apply(this);
      
    }
    
   
  
}
