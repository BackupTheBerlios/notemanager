/*
 * Created on 23 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;
 
import java.util.HashMap;
import java.util.Iterator;
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
	private final Map<String, List<IntitulateCoefficient>> mapCoursesIntitulates = new HashMap<String, List<IntitulateCoefficient>>();
	private final Cache cache;
	/**
	 * 
	 * @param cache
	 */
	public ViewStudentTableModel(Cache cache){
		this.cache=cache;	
	}
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	private List<IntitulateCoefficient> fillListIntitulateCoefficient(Map<String,Integer> map){
		Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
		List<IntitulateCoefficient> list = new ArrayList<IntitulateCoefficient>();
		// fill list
		while(it.hasNext()){			
			Map.Entry<String,Integer> tmp = it.next();
			fillList(tmp.getKey(),tmp.getValue(),list);										
		}
		return list;
	}
	/**
	 * 
	 * @param intitulate
	 * @param coefficient
	 * @param list
	 */
	private void fillList(final String intitulate,final int coefficient,List<IntitulateCoefficient> list){
		list.add(new IntitulateCoefficient(){
			public String getIntitulate(){
				return intitulate; 
			}
			public int getCoefficient(){
				return coefficient;
			}
		});
	}
		
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;	
	
	/**
	 * 
	 * @param student
	 */
	public void fillModel(Cache cache,String studentName){
		Map<String,Map<String,Integer>> map= cache.getMapCoursesIntitulates();
		Iterator<Map.Entry<String,Map<String,Integer>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Map<String,Integer>> pairs = (Map.Entry<String,Map<String,Integer>>)it.next();
			// add course to the list
			listCourses.add(pairs.getKey());
			// fill list intitulatecoefficient to map
			fillListIntitulateCoefficient(pairs.getValue());									
			}				
	}
	
	private int getMaxIntitulate(){
		int max=0;
		for(String course : listCourses)
		{
			int size = mapCoursesIntitulates.get(course).size();
			if(size>max)
				max=size;			
		}
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
		return getMaxIntitulate() + 1;		
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
		
		if(rowIndex%5==1)
		 return listCourses.get(rowIndex/5);
		// for intitulates row
		else if(rowIndex%5==2)
		{
			
			
		}
		
		
		
		
	
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
	 */
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
		
		
		
		
		
		
		
		
		

	}
}
