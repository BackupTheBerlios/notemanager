/*
 * Created on 3 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr;

import java.util.ArrayList;

/**
 * @author jrichert
 *Create information's list
 *
 */
public class Courses {

	private ArrayList<String> list;
	
	public Courses()
	{
		this.list = new ArrayList<String>();
	}
	
	public ArrayList<String> getList()
	{
	return list;
	}
	
	public void setList(ArrayList<String> list)	
	{
	this.list = list;	
	}
	
	
}
