/*
 * 
 *
 */
package fr.umlv.symphonie.GUI.view.jury;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.GUI.Student;

/**
 * @author jrichert
 *
 */
public class JuryTableModel extends AbstractTableModel {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    private final Cache cache;
    
    private ArrayList<String> listCourses;
    private ArrayList<String> listIntitulates;
    private ArrayList<String> listCoeffs;
    
    public JuryTableModel(Cache cache){
            
        this.cache = cache;
        this.fillIntitulatesCoeff();
       }
    
    
    /**
     * 
     *
     */
    public void fillIntitulatesCoeff(){
      listIntitulates = new ArrayList<String>();
      listCoeffs = new ArrayList<String>();
      listCourses = new ArrayList<String>();
        
        for(Iterator it = cache.getListCourses().iterator(); it.hasNext();)
        {            
            String course = it.next().toString();
            Map<String,Integer> tmpIntCoeff = cache.getMapCoursesIntitulates().get(course);
            Set<String> tmpIntitul = tmpIntCoeff.keySet();
            listCourses.add(course);
            for(Iterator itInt = tmpIntitul.iterator(); itInt.hasNext();)
            {
               String intitulate = itInt.next().toString();
               listIntitulates.add(intitulate);
               listCoeffs.add(tmpIntCoeff.get(intitulate).toString());
               listCourses.add("");
               listCourses.remove(listCourses.size()-1);
            }
            
          }
           
        }
    
    
    
    
   

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return cache.getListStudents().size()+2;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    public int getColumnCount() {
        return listIntitulates.size()+3;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        int lastColumn = listIntitulates.size()+3;
        String elt = new String();
        
        
      
        switch(rowIndex)
        {
        case 0:
        if(columnIndex == 0)
            return "Nom des matieres";
        return listCourses.get(columnIndex-1);
        case 1:
  
            if(columnIndex == 0 || columnIndex == lastColumn)
            return "Nom des etudiants";
        
            
            if(columnIndex == lastColumn-1)
            return "Avis du Jury";
                    
           
                    
           
 
            if(columnIndex == 1)
            return "Intitulé";
            else 
            if(columnIndex > 1 && columnIndex < lastColumn-1){
            
             return listIntitulates.get(columnIndex-2);
           
              }
            
        case 2:
            if(columnIndex == 1)
                return "Coefficient";
            else
            if(columnIndex > 1 && columnIndex < lastColumn-1){
             return listCoeffs.get(columnIndex-2);
            }
        
        default:
        
        
        if(rowIndex >= 3){
            
        
            if(columnIndex == 0 || columnIndex == lastColumn)
                return  cache.getListStudents().get(rowIndex-2);                
                
            if(columnIndex == lastColumn-1)
                return cache.getMapStudent().get(cache.getListStudents().get(rowIndex-2)).getComment();
        
          if(columnIndex > 1 && columnIndex < lastColumn-1){
              double note = cache.getMapStudent().get(cache.getListStudents().get(rowIndex-2)).getNoteFromCourseAndIntitulate(cache.getListCourses().get(0),listIntitulates.get(columnIndex-2));
              if(note < 0)
                  return 0;
              else
             return note;
            }
        
        
        }
        }
        return elt;        
    }
    
    
    
}
