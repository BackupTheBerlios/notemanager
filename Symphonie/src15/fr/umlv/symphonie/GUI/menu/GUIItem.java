/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.menu;

import javax.swing.AbstractButton;


/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface GUIItem {

	public void register();
	
	public void setText();
	
	public AbstractButton getItem();
	
	public void setAction();
}
