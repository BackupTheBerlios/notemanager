/*
 * Created on 1 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.viewsymphonie;

import javax.swing.JTable;

/**
 * @author jrichert
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Teachers implements SymphonieView {

	private JTable teacher;
	
	public void init(){
		this.teacher = new JTable();
	}
	
	
	
}
