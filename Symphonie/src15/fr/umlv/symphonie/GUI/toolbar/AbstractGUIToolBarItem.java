/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.toolbar;


import javax.swing.AbstractButton;
import javax.swing.JButton;
import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.GUI.menu.GUIItem;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractGUIToolBarItem implements GUIItem{

	private final GUICache guiCache;
	private final String itemName;	
	private final AbstractButton item;
	
	/**
	 * 
	 * @param guiCache
	 * @param itemName
	 * @param menuName
	 */
	public AbstractGUIToolBarItem(GUICache guiCache,String itemName) {
		this.itemName=itemName;
		this.guiCache=guiCache;		
		item = new JButton(getItemName());
		guiCache.getToolBar().add(item);
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
	private String getItemName(){
		return guiCache.getMapLangage().get(itemName);
	}
	/**
	 * 
	 */
	public void register(){
		guiCache.getToolBarRegistry().put(itemName,this);
	}
	/**
	 * 
	 */
	public void setText(){
		item.setText(getItemName());
	}
	/**
	 * 
	 */
	abstract public void setAction();
}
