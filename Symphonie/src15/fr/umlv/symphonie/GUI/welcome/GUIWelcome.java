/*
 * Created on 22 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.welcome;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.GUI.InternalFrameView;
import fr.umlv.symphonie.printer.SymphoniePrinter;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GUIWelcome {
	
	private final JEditorPane editorPane;
	private String fileLangPage; 
	private final GUICache cache;
	private String selectedView;
	
	
	public GUIWelcome(GUICache cache,String file){
		this.fileLangPage = file;
		this.cache = cache;
		this.editorPane = new JEditorPane();
		editorPane.setEditable(false);
		
		File fileTemp = null;
		URL welcomePage = null;
		
		try{
			fileTemp = new File(fileLangPage);
			//welcomePage =  new URL("file://"+fileTemp);
			welcomePage = fileTemp.toURL();
			
		}catch(MalformedURLException mfe){
			mfe.printStackTrace();
		}
		
		if(welcomePage != null){
			try{
				editorPane.setPage(welcomePage);
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		else{
			System.err.println("File not found "+fileLangPage);
		}
		
		editorPane.addHyperlinkListener(new HyperlinkListener(){

			public void hyperlinkUpdate(HyperlinkEvent e) {
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
		 			JEditorPane pane = (JEditorPane) e.getSource();
					
		 			if (e instanceof HTMLFrameHyperlinkEvent) {
		 				HTMLFrameHyperlinkEvent  evt = (HTMLFrameHyperlinkEvent)e;
		 				HTMLDocument doc = (HTMLDocument)pane.getDocument();
		 				doc.processHTMLFrameHyperlinkEvent(evt);
		 				
		 			} else {
		 				try {
		 					System.out.println("Trying to set page with "+e.getURL());
		 					String viewName = e.getDescription();
		 					System.out.println("====>>>> Selected View =  "+viewName);
		 					Container c = pane.getParent();
		 					c.add(GUIWelcome.this.cache.getViewMap().get(viewName).getComponent());
		 					
		 					
		 					
		 					/* JDesktopPane desk = (JDesktopPane) c.getComponent(0);
		 					//set the selectedView
		 					selectedView = viewName;
		 					InternalFrameView iView = InternalFrameView.newInstance(viewName,GUIWelcome.this.cache.getViewMap().get(viewName));
		 					desk.add(iView.getInternalFrameView());
		 					*/
		 					//pane.setPage(e.getURL());
		 				} catch (Throwable t) {
		 					t.printStackTrace();
		 				}
		 			}
		 		}
				
			}
			
		});
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSelectedView(){
		return selectedView;
	}
	/**
	 * 
	 * @param file
	 */
	public void setFileLangPage(String file){
		this.fileLangPage = file;
	}
	
	/**
	 * 
	 * @return
	 */
	public JEditorPane getEditorPane(){
		return editorPane;
	}
	
	/* public static void main(String[] args) {
	
		JFrame frame=new JFrame();
		GUIWelcome welc = new GUIWelcome("welcomeFR.html");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		container.add(new JScrollPane(welc.editorPane),BorderLayout.CENTER);
		frame.setSize(600,400);
		//frame.pack();
		frame.setVisible(true);
		
	}
	*/

}
