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
	private final Map<String, List<IntitulateCoefficientNote>> mapCoursesIntitulates = new HashMap<String, List<IntitulateCoefficientNote>>();
	private Student student;
	/**
	 * 
	 * @param cache
	 */
	public ViewStudentTableModel(Cache cache){
		fillField(cache);
		fillModel(cache.getMapStudent().get("PAPI JOJO"));
	//	debug();
	}
	
	
	
	private void debug(){
		for(String course : listCourses)
		{
			List<IntitulateCoefficientNote> list = mapCoursesIntitulates.get(course);
			System.out.println(course + ":");
			for(IntitulateCoefficientNote o : list){				
				System.out.println(o.getIntitulate());											
			}					
			System.out.println("");
		}			
	}
	
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	private List<IntitulateCoefficientNote> fillListIntitulateCoefficient(Map<String,Integer> map){
		Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
		List<IntitulateCoefficientNote> list = new ArrayList<IntitulateCoefficientNote>();
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
	private void fillList(final String intitulate,final int coefficient,List<IntitulateCoefficientNote> list){
		list.add(new IntitulateCoefficientNote(){
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
	public void fillField(Cache cache){
		
		Map<String,Map<String,Integer>> map= cache.getMapCoursesIntitulates();
		Iterator<Map.Entry<String,Map<String,Integer>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Map<String,Integer>> pairs = (Map.Entry<String,Map<String,Integer>>)it.next();
			// add course to the list
			listCourses.add(pairs.getKey());
			// fill list intitulatecoefficient to map
			mapCoursesIntitulates.put(pairs.getKey(),fillListIntitulateCoefficient(pairs.getValue()));									
			}				
	}
	/**
	 * 
	 * @param student
	 */
	public void fillModel(Student student){		
		this.student=student;
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
		if(columnIndex==1){
			return "java";
		}
		else return Integer.toString(columnIndex+1);
		
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
		
		// for course row
		if(rowIndex%5 ==0  && columnIndex==0){			
			return listCourses.get(rowIndex/5);
			
		}		 
		// for intitulates row
		else if(rowIndex%5==1 && columnIndex >= 1)
		{
			List<IntitulateCoefficientNote> list = mapCoursesIntitulates.get(listCourses.get(rowIndex/5));
			int size = columnIndex-1;
			System.out.println(size);
			//IntitulateCoefficientNote tmp = list.get(columnIndex-1);
			
			return null;
			//return mapCoursesIntitulates.get(listCourses.get(rowIndex/5)).get(columnIndex).getIntitulate();			
		}
		// for coefficient row
		else if(rowIndex%5==2 && columnIndex >= 1)
		{
			return null;
			//return mapCoursesIntitulates.get(listCourses.get(rowIndex/5)).get(columnIndex).getCoefficient();			
		}
		// for note row
		else if(rowIndex%5==3 && columnIndex >= 1){
			//String course=listCourses.get(rowIndex/5);
			//String intitulate = mapCoursesIntitulates.get(listCourses.get(rowIndex/5)).get(columnIndex).getIntitulate();			
			//return student.getNoteFromCourseAndIntitulate(course,intitulate);
			return "0";
		}
		else return null;
		
		
		 
	}
}
