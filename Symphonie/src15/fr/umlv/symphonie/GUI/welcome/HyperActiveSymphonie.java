/*
 * Created on 22 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.welcome;

import java.awt.Container;
import java.io.File;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class HyperActiveSymphonie implements HyperlinkListener {
 	 
	/* (non-Javadoc)
	 * @see javax.swing.event.HyperlinkListener#hyperlinkUpdate(javax.swing.event.HyperlinkEvent)
	 */
	public void hyperlinkUpdate(HyperlinkEvent e) {
		// TODO Auto-generated method stub
		if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
 			JEditorPane pane = (JEditorPane) e.getSource();
			//JScrollPane pane = (JScrollPane) e.getSource();
 			if (e instanceof HTMLFrameHyperlinkEvent) {
 				HTMLFrameHyperlinkEvent  evt = (HTMLFrameHyperlinkEvent)e;
 				HTMLDocument doc = (HTMLDocument)pane.getDocument();
 				doc.processHTMLFrameHyperlinkEvent(evt);
 				
 			} else {
 				try {
 					System.out.println("Trying to set page with "+e.getURL());
 					String name = e.getDescription();
 					System.out.println("====>>>> Selected View =  "+name);
 					Container c = pane.getParent();
 					c.add(new JScrollPane(new JTable((new ViewTable(new File("."))))));
 					//pane.setPage(e.getURL());
 				} catch (Throwable t) {
 					t.printStackTrace();
 				}
 			}
 		}
 	}
	
}
	