/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.menu.file;

import java.io.IOException;

import javax.swing.JMenu;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.umlv.symphonie.GUI.menu.MenuItem;
import fr.umlv.symphonie.GUI.menu.MenuItemCache;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemFile extends MenuItemCache implements MenuItem {

	private final JMenu menu;
	
	public ItemFile() throws SAXException,IOException,ParserConfigurationException{
		menu = new JMenu(getMap().get("file"));
		register();
	}
		
	public JMenu getJMenu(){
		return menu;
	}
	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#register()
	 */
	public void register() {
		getRegistry().put("file",this);				
	}

	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#setText()
	 */
	public void setText() {
		menu.setText(getMap().get("file"));		
	}

	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#setAction()
	 */
	public void setAction() {
		// TODO Auto-generated method stub

	}

}
