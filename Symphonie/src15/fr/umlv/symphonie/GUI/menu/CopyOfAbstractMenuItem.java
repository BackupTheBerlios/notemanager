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

import fr.umlv.symphonie.GUI.LanguageParser;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CopyOfAbstractMenuItem {

	static private final Map<String,String> map =new HashMap<String,String>();
	static private final Map<String,CopyOfAbstractMenuItem> registry = new HashMap<String,CopyOfAbstractMenuItem>();
	static private LanguageParser cache;
	private final String defaultLangage = "menu_FR.xml";
	/*
	public CopyOfAbstractMenuItem() throws SAXException,IOException,ParserConfigurationException{					
			cache = LanguageParser.newLanguageCache(defaultLangage,map);
			// fill language map 
			cache.parseLanguageConfigFile();						
	}
	*/
			
	/**
	 * 
	 * @return
	 */
	public Map<String,CopyOfAbstractMenuItem> getRegistry(){
		return registry;
	}
	/**
	 * 
	 * @return
	 */
	public Map<String,String> getMap(){
		return map;
	}
}
