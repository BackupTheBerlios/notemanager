/*
 * Created on 17 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;


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
import fr.umlv.symphonie.GUI.menu.formula.ItemFormula;
import fr.umlv.symphonie.GUI.menu.formula.ItemFormulaAdd;
import fr.umlv.symphonie.GUI.menu.formula.ItemFormulaDelete;
import fr.umlv.symphonie.GUI.menu.formula.ItemFormulaEdit;
import fr.umlv.symphonie.GUI.menu.formula.ItemFormulaPlugin;
import fr.umlv.symphonie.GUI.menu.formula.ItemFormulaPluginAdd;
import fr.umlv.symphonie.GUI.menu.formula.ItemFormulaPluginRemove;
import fr.umlv.symphonie.GUI.menu.tools.AdminDeleteCourse;
import fr.umlv.symphonie.GUI.menu.tools.AdminInsertCourse;
import fr.umlv.symphonie.GUI.menu.tools.AdminInsertStudent;
import fr.umlv.symphonie.GUI.menu.tools.AdmindeleteStudent;
import fr.umlv.symphonie.GUI.menu.tools.ItemTools;
import fr.umlv.symphonie.GUI.menu.tools.ItemToolsAdmin;
import fr.umlv.symphonie.GUI.menu.tools.ItemToolsConnection;
import fr.umlv.symphonie.GUI.menu.tools.ItemToolsStats;
import fr.umlv.symphonie.GUI.menu.view.ItemView;
import fr.umlv.symphonie.GUI.menu.view.ItemViewJury;
import fr.umlv.symphonie.GUI.menu.view.ItemViewStudent;
import fr.umlv.symphonie.GUI.menu.view.ItemViewTeacher;
import fr.umlv.symphonie.GUI.toolbar.ItemToolAdminMode;
import fr.umlv.symphonie.GUI.toolbar.ItemToolFormula;
import fr.umlv.symphonie.GUI.toolbar.ItemToolPrint;
import fr.umlv.symphonie.GUI.toolbar.ItemToolRedo;
import fr.umlv.symphonie.GUI.toolbar.ItemToolSave;
import fr.umlv.symphonie.GUI.toolbar.ItemToolTools;
import fr.umlv.symphonie.GUI.toolbar.ItemToolUndo;
import fr.umlv.symphonie.GUI.toolbar.ItemToolViewJury;
import fr.umlv.symphonie.GUI.toolbar.ItemToolViewStudent;
import fr.umlv.symphonie.GUI.toolbar.ItemToolViewTeacher;
import fr.umlv.symphonie.GUI.welcome.GUIWelcome;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StartGUI {

	
	
	
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Symphonie");
		
		frame.setSize(1000,860);
		  
		int inset = 20;
	        
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setBounds(inset, inset,screenSize.width  - inset*2,screenSize.height - inset*2);
		
	    //JDesktopPane desktop = new JDesktopPane();
		//frame.add(toolBar,BorderLayout.NORTH);
				
				
		try {
		// cache pour les items
		final GUICache cache = GUICache.newInstance();
		frame.setJMenuBar(cache.getMenuBar());
			
		Container contentPane = frame.getContentPane();
				
		contentPane.add(cache.getToolBar(),BorderLayout.NORTH);
		
	
		// add JMenu file to the menubar
		ItemFile itemFile = new ItemFile(cache);		
		//menuBar.add(itemFile.getItem());
		ItemFileExport export = new ItemFileExport(cache);
		ItemFileImport im = new ItemFileImport(cache);
		itemFile.getItem().add(new JSeparator());
		ItemFileSave save = new ItemFileSave(cache);
		itemFile.getItem().add(new JSeparator());
		ItemFilePrint pr = new ItemFilePrint(cache);
		itemFile.getItem().add(new JSeparator());
		ItemFileExit exit = new ItemFileExit(cache);
		
		
		
		// add JMenul edit to the menubar
		ItemEdit itemEdit =new ItemEdit(cache); 
		
		//menuBar.add(itemEdit.getItem());
		ItemEditUndo und = new ItemEditUndo(cache);
		ItemEditRedo re = new ItemEditRedo(cache);
		itemEdit.getItem().add(new JSeparator());
		ItemEditCut c = new ItemEditCut(cache);					
		ItemEditPaste p = new ItemEditPaste(cache);
		itemEdit.getItem().add(new JSeparator());
		ItemEditDelete d = new ItemEditDelete(cache);
		itemEdit.getItem().add(new JSeparator());
		ItemEditSelect sel = new ItemEditSelect(cache);
		
//		 add JMenul edit to the menubar
		ItemView itemView = new ItemView(cache);
		ItemViewJury jury = new ItemViewJury(cache);
		ItemViewStudent j = new ItemViewStudent(cache);
		ItemViewTeacher ju = new ItemViewTeacher(cache);
		
		ItemFormula formula = new ItemFormula(cache);
		ItemFormulaAdd fo = new ItemFormulaAdd(cache);
		ItemFormulaDelete fofd = new ItemFormulaDelete(cache);
		ItemFormulaEdit fdo = new ItemFormulaEdit(cache);
		ItemFormulaPlugin foss = new ItemFormulaPlugin(cache);
		ItemFormulaPluginAdd fossm = new ItemFormulaPluginAdd(cache);
		ItemFormulaPluginRemove fodss = new ItemFormulaPluginRemove(cache);
		
		
		ItemToolAdminMode toooofhjfjhfjh = new ItemToolAdminMode(cache);
		ItemToolFormula gjkgkj = new ItemToolFormula(cache);
		ItemToolPrint poig = new ItemToolPrint(cache);
		ItemToolRedo ghkf = new ItemToolRedo(cache);
		ItemToolSave gjkg = new ItemToolSave(cache);
		ItemToolTools jkgjk = new ItemToolTools(cache);
		ItemToolUndo undojktg = new ItemToolUndo(cache);
		ItemToolViewJury fsd = new ItemToolViewJury(cache);
		ItemToolViewStudent fezgza = new ItemToolViewStudent(cache);
		ItemToolViewTeacher rfzefz = new ItemToolViewTeacher(cache);
		
		ItemTools tools = new ItemTools(cache);
		ItemToolsConnection toolsc = new ItemToolsConnection(cache);
		ItemToolsStats toolss = new ItemToolsStats(cache);
		ItemToolsAdmin toolsa = new ItemToolsAdmin(cache);
		AdminDeleteCourse admdc = new AdminDeleteCourse(cache);
		AdminInsertCourse adminc =  new AdminInsertCourse(cache);
		AdminInsertStudent admins = new AdminInsertStudent(cache);
		AdmindeleteStudent admds = new AdmindeleteStudent(cache);
		
				
		/*************************************************************
		 * Creation of symphonie welcome page
		 **************************************************************/
		
		GUIWelcome guiWelcome = new GUIWelcome(cache,"welcomeFR.html");
		contentPane.add(new JScrollPane(guiWelcome.getEditorPane()),BorderLayout.CENTER); 
		
		
		
		/*
		JButton button = new JButton("changer la langue");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{				
				cache.setLangage("menu_EN.xml");								
				}
				catch(SAXException s){
					System.out.println(s.getMessage());
				}
				catch (ParserConfigurationException pce){
					System.out.println(pce.getMessage());
				}catch(IOException ioe){
					System.out.println(ioe.getMessage());
				}				
			}
		});
		frame.add(button);
		*/
		
		}
		catch(SAXException s){
			System.out.println(s.getMessage());
		}
		catch (ParserConfigurationException pce){
			System.out.println(pce.getMessage());
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
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
