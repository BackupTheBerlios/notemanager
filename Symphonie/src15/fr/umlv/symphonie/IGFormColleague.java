/*
 * Created on 9 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie;

import fr.umlv.symphonie.mediator.FormulaViewMediator;

/**
 * @author jrichert
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 * 
 * Class with specification for formula and graphics part. 
 */
public abstract class IGFormColleague {

	private FormulaViewMediator mediator;
	
	/**
	 * Contruc a Colleague elt.
	 *
	 */
	public IGFormColleague()
	{		
	}
	
	/**
	 * Construct a colleague with a mediator 
	 * @param mediator
	 */
	
	public IGFormColleague(FormulaViewMediator mediator)
	{
		this.mediator = mediator;
	}
	
	/**
	 * This function is necesarie for known a mediator for a particular elt.
	 * @return mediator of colleague
	 */
	public FormulaViewMediator getMediator()
	{
		return mediator;
	}
	
}
