package fr.umlv.symphonie.formula.expr;

import java.util.*;

/**
 * 
 * @author julien
 *Create interpret  context's
 */
public class Context {

    private final HashMap<String,Expr> map = new HashMap<String,Expr>();

    public void set(String name,Expr e) {
	map.put(name,e);    
    }

    public Expr get(String name) {
	Expr e = map.get(name);

	if(e == null) throw new RuntimeException("variable "+name+" undefined");
	
	return e;
    }


}
