/*
 * Created on 23 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;
 
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.table.AbstractTableModel;
import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.GUI.Student;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewStudentTableModel extends AbstractTableModel{
	
	
	
	private final List<String> listCourses = new ArrayList<String>();
	private final Map<String, Map<String,Integer> > mapCoursesIntitulates;
	/**
	 * 
	 * @param cache
	 */
	public ViewStudentTableModel(Cache cache){
		this.mapCoursesIntitulates = cache.getMapCoursesIntitulates();
	}
	
	
		
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;	
	
	/**
	 * 
	 * @param student
	 */
	public void fillModel(Cache cache){
		
		
		
	}
	
	private int getMaxIntitulate(){
		int max=0;
		
		
		return max;
	}
	
	
	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	public int getRowCount() {
		return listCourses.size()*5;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnName(int)
	 */
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#isCellEditable(int, int)
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
	 */
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}
}
