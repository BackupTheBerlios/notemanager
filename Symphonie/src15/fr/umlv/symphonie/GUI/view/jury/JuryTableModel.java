/*
 * 
 *
 */
package fr.umlv.symphonie.GUI.view.jury;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

import fr.umlv.symphonie.GUI.Cache;

/**
 * @author jrichert
 *
 */
public class JuryTableModel extends AbstractTableModel {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    private final HashMap<String,String> mapStudents;
    private final ArrayList<String> listCourses;
    private final HashMap<String, Map<String,Integer> > mapCoursesIntitulates;  
    private final Cache cache;

    
    public JuryTableModel(Cache cache){
        this.cache = cache;
        this.mapStudents = (HashMap<String,String>) cache.getMapStudent();
        this.listCourses = (ArrayList<String>) cache.getListCourses();
        this.mapCoursesIntitulates = (HashMap<String, Map<String,Integer>>)cache.getMapCoursesIntitulates();

    }
    
    
    
    
    
    
   

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return 0;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    public int getColumnCount() {
        return 0;
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        int lastColumn = listCourses.size()+3;
        String elt = new String();
        
        
       
        switch(rowIndex)
        {
        case 0:
        if(columnIndex == 0 || columnIndex == lastColumn)
            return "Nom des etudiants";

        if(columnIndex == 1)
            return "Matiere";
        if(columnIndex == lastColumn-1)
            return "Avis du Jury";
      
      
        elt = listCourses.get(columnIndex-2);
      
        return elt;
                    
           
        case 1:
            if(columnIndex == 1)
            return "Intitulé";
                
            
        case 2:
            if(columnIndex == 1)
                return "Coefficient";
        
        default:
        
        
        if(rowIndex >= 3){
            
        
            if(columnIndex == 0 || columnIndex == lastColumn)
                {
             //  elt = listStudents.get(rowIndex-3);
                }

         
            
           
        }
        }
    
        return elt;        
    }
    
    
    
}
