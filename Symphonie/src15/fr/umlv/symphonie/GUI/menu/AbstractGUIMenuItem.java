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
	 * 
	 * @param guiCache
	 * @param itemName
	 * @param menuName
	 */
	public AbstractGUIMenuItem(GUICache guiCache,String itemName,String menuName) {
		this.itemName=itemName;
		this.guiCache=guiCache;		
		this.menuName=menuName;
		if(menuName.equals("")){
			item = new JMenu(getItemName());
		}
		else {
			item = new JMenuItem(getItemName());
			JMenu parent =(JMenu) guiCache.getMenuRegistry().get(menuName).getItem();
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
	 */
	abstract public void setAction();
}
