/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.teacher;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TeacherTableColumnModel extends DefaultTableColumnModel {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	
	   /**
	    * creates the TeacherTableColumnModel with the tableModel.
	    *
	    */
	public TeacherTableColumnModel(TeacherTableModel tabModel){
		
		super();

		for (int count = tabModel.getColumnCount(), i = 0; i < count; i++)
			{
				TableColumn c = new TableColumn(i);	
				//c.setHeaderValue(tabModel.getColumnName(i));
				this.addColumn(c);
		    }
		}

}
