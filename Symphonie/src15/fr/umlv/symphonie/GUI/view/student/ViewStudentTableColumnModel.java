/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewStudentTableColumnModel extends DefaultTableColumnModel {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public ViewStudentTableColumnModel(ViewStudentTableModel model){
		super();
		
		for(int index=0;index<model.getColumnCount();index++){
			
			TableColumn column = new TableColumn(index);
			this.addColumn(column);		
		}
		
	
		
	}
	
	
	
}
