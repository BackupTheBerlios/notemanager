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
import java.io.IOException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.umlv.symphonie.printer.SymphoniePrinter;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GUIWelcome {
	
	private final JEditorPane editorPane;
	private final String fileLangPage; 
	
	public GUIWelcome(String file){
		fileLangPage = file;
		editorPane = new JEditorPane();
		editorPane.setEditable(false);
		URL welcomePage = GUIWelcome.class.getResource(fileLangPage);
		if(welcomePage != null){
			try{
				editorPane.setPage(welcomePage);
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			editorPane.addHyperlinkListener(new HyperActiveSymphonie());
		}
		else{
			System.err.println("File not found "+fileLangPage);
		}
	}
	
	
	
	public static void main(String[] args) {
	
		JFrame frame=new JFrame();
		GUIWelcome welc = new GUIWelcome("welcomeFR.html");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		container.add(new JScrollPane(welc.editorPane),BorderLayout.CENTER);
		frame.setSize(600,400);
		//frame.pack();
		frame.setVisible(true);
		
	}

}
