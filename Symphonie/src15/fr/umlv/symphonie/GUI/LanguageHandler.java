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
	
	protected LanguageHandler(Map<String,String> map){
		this.map = map;
	}
			
	/**
	 * calls on the start of the XML document
	 */
	public void startDocument() throws SAXException{
		
	}
	/**
	 * calls at the end of the XML document
	 */
	public void endDocument() throws SAXException{
		
	}
	
	
	public void startElement(String uri, String localName, String qName, Attributes attrs) throws SAXException {
		
	}
	

	public void endElement(String uri, String localName, String qName) throws SAXException {
		
	}
	
	public void chararters(char[] buf, int offset, int len) throws SAXException {
		
		
	}
	
	
}
