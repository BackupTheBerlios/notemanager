/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.menu.file;

import java.io.IOException;

import javax.swing.JMenuItem;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.GUI.menu.MenuItem;
import fr.umlv.symphonie.GUI.menu.AbstractGUIItem;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemFilePrint extends AbstractGUIItem implements MenuItem {

	private final JMenuItem item;
	
	public ItemFilePrint(GUICache cache){
		super(cache);
		item = new JMenuItem(getMap().get("filePrint"));
		ItemFile itemFile = (ItemFile)(getRegistry().get("file"));		
		itemFile.getJMenu().add(item);
		register();
	}	
	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#register()
	 */
	public void register() {
		getRegistry().put("filePrint",this);				
	}

	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#setText()
	 */
	public void setText() {
		item.setText(getMap().get("filePrint"));		
	}

	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#setAction()
	 */
	public void setAction() {
		// TODO Auto-generated method stub

	}

}
