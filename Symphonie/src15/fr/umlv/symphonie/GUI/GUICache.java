/*
 * Created on 21 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import fr.umlv.symphonie.GUI.menu.GUIItem;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GUICache {
	static private final Map<String,String> mapLangage =new HashMap<String,String>();
	static private final Map<String,GUIItem> menuRegistry = new HashMap<String,GUIItem>();
	static private final Map<String,GUIItem> toolBarRegistry = new HashMap<String,GUIItem>();
	static private final Map<String,GUIItem> popupRegistry = new HashMap<String,GUIItem>();
	
	static private final JMenuBar menuBar = new JMenuBar(); 
	static private final JToolBar toolBar = new JToolBar();
	
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
		LanguageParser.parse(defaultLangage,mapLangage);				
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
		return mapLangage;
	}
	/**
	 * 
	 * @return
	 */
	public Map<String,GUIItem> getMenuRegistry(){
		return menuRegistry;
	}
	
	/**
	 * 
	 * @return
	 */
	public JMenuBar getMenuBar(){
		return menuBar;
	}
	/**
	 * 
	 * @return
	 */
	public JToolBar getToolBar(){
		return toolBar;
	}
	
	/**
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	public void setLangage(String fileName) throws SAXException,IOException,ParserConfigurationException{
		LanguageParser.parse(fileName,mapLangage);
		Iterator it = menuRegistry.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();			
			((GUIItem)pairs.getValue()).setText();			
		}
		
		
	}
	
}
