/*
 * Created on 11 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.formula.expr.plugins;

import fr.umlv.symphonie.formula.expr.Courses;
import fr.umlv.symphonie.mediator.FormulaViewMediator;

/**
 * @author julien
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Data {

	 public static Courses keyword(final FormulaViewMediator mediator) {
	 	Courses courses = new Courses();
	 	 courses.setList(mediator.getLineColumnName());
	 	return courses;
	 }
}
