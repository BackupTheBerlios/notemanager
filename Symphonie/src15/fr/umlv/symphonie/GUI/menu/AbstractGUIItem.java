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
public class AbstractGUIItem {

	private final GUICache guiCache;
	public AbstractGUIItem(GUICache guiCache) {					
			this.guiCache=guiCache;			
	}		
	/**
	 * 
	 * @return
	 */
	public Map<String,AbstractGUIItem> getRegistry(){
		return guiCache.getRegistry();
	}
	/**
	 * 
	 * @return
	 */
	public Map<String,String> getMap(){
		return guiCache.getMapLangage();
	}
}
