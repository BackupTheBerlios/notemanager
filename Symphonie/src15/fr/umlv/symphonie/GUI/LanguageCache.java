/*
 * Created on 17 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LanguageCache {
	
	private static boolean instancied = false;
	private static LanguageCache languageCacheInstance ;
	private final Map<String,String> map = new HashMap<String,String>();
	
	/**
	 * default constructor, this class is an Singleton, application can have only one instance
	 * of this class
	 * @param fileName
	 */
	private LanguageCache(String fileName) throws SAXException,ParserConfigurationException, IOException{
		parseConfigFile(fileName);		
	}
	/**
	 * 
	 * @param fileName can't be null
	 * @return
	 */
	protected static LanguageCache newLanguageCache(String fileName) throws SAXException,ParserConfigurationException, IOException{
		if(!instancied){
			languageCacheInstance = new LanguageCache(fileName);
			instancied = true;		
		}
		return languageCacheInstance;	
	}
	/**
	 * parse XML file
	 * @param fileName can't be null
	 */
	protected void parseConfigFile(String fileName) throws SAXException,ParserConfigurationException,IOException{		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		// fill map 
		parser.parse(new FileInputStream(fileName),new LanguageHandler(map));
	}
	/**
	 * 
	 * @return
	 */
	protected Map<String,String> getMap(){
		return map;
	}	
}
