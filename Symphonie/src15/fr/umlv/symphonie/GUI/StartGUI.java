/*
 * Created on 17 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.umlv.symphonie.GUI.menu.MenuItemCache;
import fr.umlv.symphonie.GUI.menu.edit.ItemEdit;
import fr.umlv.symphonie.GUI.menu.edit.ItemEditCut;
import fr.umlv.symphonie.GUI.menu.edit.ItemEditDelete;
import fr.umlv.symphonie.GUI.menu.edit.ItemEditPaste;
import fr.umlv.symphonie.GUI.menu.edit.ItemEditRedo;
import fr.umlv.symphonie.GUI.menu.edit.ItemEditSelect;
import fr.umlv.symphonie.GUI.menu.edit.ItemEditUndo;
import fr.umlv.symphonie.GUI.menu.file.ItemFile;
import fr.umlv.symphonie.GUI.menu.file.ItemFileExit;
import fr.umlv.symphonie.GUI.menu.file.ItemFileExport;
import fr.umlv.symphonie.GUI.menu.file.ItemFileImport;
import fr.umlv.symphonie.GUI.menu.file.ItemFilePrint;
import fr.umlv.symphonie.GUI.menu.file.ItemFileSave;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StartGUI {

	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Symphonie");
		
		frame.setSize(640,400);
		
		
		JMenuBar menuBar = new JMenuBar();
		
		
		frame.setJMenuBar(menuBar);
		try {
		// cache pour les items
		MenuItemCache cache = new MenuItemCache();
		// add JMenu file to the menubar
		ItemFile itemFile = new ItemFile();		
		menuBar.add(itemFile.getJMenu());
		ItemFileExport export = new ItemFileExport();
		ItemFileImport im = new ItemFileImport();
		itemFile.getJMenu().add(new JSeparator());
		ItemFileSave save = new ItemFileSave();
		itemFile.getJMenu().add(new JSeparator());
		ItemFilePrint pr = new ItemFilePrint();
		itemFile.getJMenu().add(new JSeparator());
		ItemFileExit exit = new ItemFileExit();
		
		
		
		// add JMenul edit to the menubar
		ItemEdit itemEdit =new ItemEdit(); 
		
		menuBar.add(itemEdit.getJMenu());
		ItemEditUndo und = new ItemEditUndo();
		ItemEditRedo re = new ItemEditRedo();
		itemEdit.getJMenu().add(new JSeparator());
		ItemEditCut c = new ItemEditCut();					
		ItemEditPaste p = new ItemEditPaste();
		itemEdit.getJMenu().add(new JSeparator());
		ItemEditDelete d = new ItemEditDelete();
		itemEdit.getJMenu().add(new JSeparator());
		ItemEditSelect sel = new ItemEditSelect();
		
		
		
		}
		catch(SAXException s){
			
		}
		catch (ParserConfigurationException pce){
			
		}catch(IOException ioe){
			
		}
		finally{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
		
		
	}
}
