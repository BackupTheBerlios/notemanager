/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.menu;


import javax.swing.AbstractButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import fr.umlv.symphonie.GUI.GUICache;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractGUIMenuItem implements GUIItem{

	private final GUICache guiCache;
	private final String itemName;
	private final String menuName;
	private final AbstractButton item;
	
	/**
	 * for JMenuItem
	 * @param guiCache
	 * @param itemName
	 * @param menuName
	 */
	public AbstractGUIMenuItem(GUICache guiCache,String itemName,String menuName,boolean isSubMenu) {
		this.itemName=itemName;
		this.guiCache=guiCache;		
		this.menuName=menuName;	
		if(!isSubMenu){
			item = new JMenuItem(getItemName());				
		}
		else {
			item = new JMenu(getItemName());
		}
		guiCache.getMenuRegistry().get(menuName).getItem().add(item);
		register();
		
	}	
	
	/**
	 * for Jmenu
	 * @param guiCache
	 * @param itemName
	 */
	public AbstractGUIMenuItem(GUICache guiCache,String itemName) {
		this.itemName=itemName;
		this.guiCache=guiCache;	
		this.menuName=null;
		
		item = new JMenu(getItemName());
		guiCache.getMenuBar().add(item);
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
		guiCache.getMenuRegistry().put(itemName,this);
	}
	/**
	 * 
	 */
	public void setText(){
		item.setText(getItemName());
	}
	/**
	 * 
	 * @return
	 */
	public GUICache getGuiCache(){
		return guiCache;
	}
	
	/**
	 * 
	 */
	abstract public void setAction();
}
