/*
 * Created on 21 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.umlv.symphonie.GUI.menu.AbstractGUIItem;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GUICache {
	static private final Map<String,String> map =new HashMap<String,String>();
	static private final Map<String,AbstractGUIItem> registry = new HashMap<String,AbstractGUIItem>();
	private final String defaultLangage = "menu_FR.xml";
	private static boolean isInstancied = false;
	private static GUICache instance;
	/**
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	private GUICache() throws SAXException,IOException,ParserConfigurationException{					
		LanguageParser.parse(defaultLangage,map);				
	}
	/**
	 * 
	 * @return
	 */
	public static GUICache newInstance() throws SAXException,IOException,ParserConfigurationException{
		
		if(!isInstancied){
			instance = new GUICache();
			isInstancied=true;
		}
		return instance;
	}	
	/**
	 * 
	 * @return
	 */
	public Map<String,String> getMapLangage(){
		return map;
	}
	/**
	 * 
	 * @return
	 */
	public Map<String,AbstractGUIItem> getRegistry(){
		return registry;
	}
	/**
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	public void setLangage() throws SAXException,IOException,ParserConfigurationException{
		LanguageParser.parse(defaultLangage,map);
	}
	
}
