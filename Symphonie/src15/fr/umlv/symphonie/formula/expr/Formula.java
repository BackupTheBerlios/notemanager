/*
 * 
 *
 */
package fr.umlv.symphonie.formula.expr;

import java.util.ArrayList;

/**
 * @author jrichert
 *
 */
public interface Formula {

    public ArrayList<String> getFormula(String request) throws Exception;
    
}
