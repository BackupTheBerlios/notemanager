/*
 * Created on 17 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LanguageHandler extends DefaultHandler {

	private final Map<String,String> map;
	private String key;	
	private String value;
	
	protected LanguageHandler(Map<String,String> map){
		this.map = map;
	}
						
	public void startElement(String uri, String localName, String qName, Attributes attrs) throws SAXException {
		key=qName;						
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(!qName.equalsIgnoreCase("menuBar"))
			map.put(key,value);
	}
	
	public void characters(char[] buf, int offset, int len) throws SAXException {		
		value=new String(buf,offset,len);		
	}	
}
