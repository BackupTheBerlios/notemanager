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
public class ViewJuryTableModel extends AbstractTableModel {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    private final Cache cache;
    
    private ArrayList<String> listCourses;
    private ArrayList<String> listIntitulates;
    private ArrayList<String> listCoeffs;
    private int nbFormula=0;
    
    
    public ViewJuryTableModel(Cache cache){
            
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
        int nbInt;
        for(Iterator it = cache.getListCourses().iterator(); it.hasNext();)
        {            
            String course = it.next().toString();
            Map<String,Integer> tmpIntCoeff = cache.getMapCoursesIntitulates().get(course);
            Set<String> tmpIntitul = tmpIntCoeff.keySet();
            listCourses.add(course);
            nbInt = 0;
            for(Iterator itInt = tmpIntitul.iterator(); itInt.hasNext();nbInt++)
            {
               String intitulate = itInt.next().toString();
               listIntitulates.add(intitulate);
               listCoeffs.add(tmpIntCoeff.get(intitulate).toString());
               listCourses.add("");
            }
            if(nbInt > 0)
                listCourses.remove(listCourses.size()-1);
          }
                  
        }
    
    public boolean isCellEditable(int row,int column){
        int lastColumn = listIntitulates.size()+3;
        
        if(row >= 3 && column == lastColumn-1)
            return true;
        
        return false;
    }
    
    public void setValueAt(Object aValue,int row,int column){
        int lastColumn = listIntitulates.size()+4;
        
        if(column == lastColumn - 2)    
            cache.getMapStudent().get(cache.getListStudents().get(row-3)).setComment(aValue.toString());
    }
   

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return cache.getListStudents().size()+3;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    public int getColumnCount() {
        return listIntitulates.size()+nbFormula+4;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        int lastColumn = listIntitulates.size()+4;
        String elt = new String();
        
        
      
        switch(rowIndex)
        {
        case 0:
        if(columnIndex == 1)
            return "Nom des matieres";
        
        if(columnIndex > 1 && columnIndex < lastColumn-2)
            return listCourses.get(columnIndex-2);
        return "";
        case 1:
  
            if(columnIndex == 0 || columnIndex == lastColumn-1)
            return "Nom des etudiants";
        
            
            if(columnIndex == lastColumn-2)
            return "Avis du Jury";
                               
 
            if(columnIndex == 1)
            return "Intitulés";
            else 
            if(columnIndex > 1 && columnIndex < lastColumn-2){
            
             return listIntitulates.get(columnIndex-2);
           
              }
            
        case 2:
            if(columnIndex == 1)
                return "Coefficient";
            else
            if(columnIndex > 1 && columnIndex < lastColumn-2){
             return listCoeffs.get(columnIndex-2);
            }
        
        default:
        
        
        if(rowIndex >= 3){
            
        
            if(columnIndex == 0 || columnIndex == lastColumn-1)
                return  cache.getListStudents().get(rowIndex-3);                
                
            if(columnIndex == lastColumn-2)
                return cache.getMapStudent().get(cache.getListStudents().get(rowIndex-3)).getComment();
        
          if(columnIndex > 1 && columnIndex < lastColumn-2){
              int indice = columnIndex-2;
              String course = listCourses.get(indice);
              while(course.equals(""))
              {
                  indice--;
                  course = listCourses.get(indice);
              }
             
              double note = cache.getMapStudent().get(cache.getListStudents().get(rowIndex-3)).getNoteFromCourseAndIntitulate(course,listIntitulates.get(columnIndex-2));
              
              if(note < 0)
                  return "";
              else
             return note;
            }
        
        
        }
        }
        return elt;        
    }
    
    
    
}
