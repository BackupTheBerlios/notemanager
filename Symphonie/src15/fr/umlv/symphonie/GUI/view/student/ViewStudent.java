/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import fr.umlv.symphonie.GUI.Cache;


/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewStudent {

	private final JTable table;
	private final JScrollPane pane;// = new JScrollPane();
	/**
	 * 
	 * @param cache
	 */
	public ViewStudent(Cache cache){
		
		ViewStudentTableModel model = new ViewStudentTableModel(cache);
		
		table = new JTable(model,new ViewStudentTableColumnModel(model));		
		table.setShowGrid(false);		
		pane = new JScrollPane(table);							
	}
	
	/**
	 * 
	 * @return
	 */
	public JScrollPane getScrollPane(){
		return pane;
	}
	
}
