package fr.umlv.symphonie.formula.expr;

import java.util.ArrayList;

import javax.swing.JTable;

import fr.umlv.symphonie.formula.expr.Formula;
import fr.umlv.symphonie.mediator.FVMediator;
import fr.umlv.symphonie.mediator.FormulaViewMediator;
import junit.framework.TestCase;

/*
 * Created on 12 mars 2005
 *
 */



/**
 * @author jrichert
 *
 */
public class FormulaTest extends TestCase {

    FormulaViewMediator mediator;
    Formula formula;
    
    public void setUp()
    {
     System.out.println("Debut des tests");
     this.mediator = new FVMediator(new JTable(),true);
     this.formula = new Formula(mediator);   
    }
     
    public void tearDown()
    {
     System.out.println("Fin des tests");       
    }
    
        
    public void testSetResult()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("15");
        list.add("5");
        list.add("3");
        list.add("23");
        list.add("8");
        
    }

    public void testGetFormula() throws Exception
    {
        
        System.out.println(formula.getFormula("1"));
    
    }

}
