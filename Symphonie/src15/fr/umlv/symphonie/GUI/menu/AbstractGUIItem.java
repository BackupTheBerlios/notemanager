/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.menu;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.GUI.LanguageParser;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractGUIItem implements GUIItem{

	private final GUICache guiCache;
	private final String itemName;
	private final String menuName;
	private final AbstractButton item;
	
	/**
	 * 
	 * @param guiCache
	 * @param itemName
	 * @param menuName
	 */
	public AbstractGUIItem(GUICache guiCache,String itemName,String menuName) {
		this.itemName=itemName;
		this.guiCache=guiCache;		
		this.menuName=menuName;
		if(menuName.equals("")){
			item = new JMenu(getItemName(menuName));
		}
		else {
			item = new JMenuItem(getItemName(itemName));
			JMenu parent =(JMenu) guiCache.getRegistry().get(menuName);
			parent.add(item);		
		}
		register();
	}		
	/**
	 * 
	 */
	public AbstractButton getItem(){
		return item;
	}
	
	/**
	 * 
	 * @param itemName
	 * @return
	 */	
	private String getItemName(String itemName){
		return guiCache.getMapLangage().get(itemName);
	}
	/**
	 * 
	 */
	public void register(){
		guiCache.getRegistry().put(itemName,this);
	}
	/**
	 * 
	 */
	public void setText(){
		item.setText(itemName);
	}
	/**
	 * 
	 */
	abstract public void setAction();
}
