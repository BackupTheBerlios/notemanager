/*
 * 
 *
 */
package fr.umlv.symphonie.GUI;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 * @author jrichert
 *
 */
public class JuryTableModel  extends AbstractTableModel {

    
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    
    private final ArrayList<String> listStudents;
    private final ArrayList<String> listCourses;
    private final Cache cache;
    
    public JuryTableModel(Cache cache)
    {
        this.cache = cache; 
        this.listStudents = (ArrayList<String>) cache.getListStudents();
        this.listCourses = (ArrayList<String>) cache.getListCourses();
    }
    
 

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return listStudents.size();
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    public int getColumnCount() {
       
        return listCourses.size()+3;
    }
    
    public String getColumnName(int column)
    {
        int lastColumn = listCourses.size()+2;
        
        if(column == 0 || column == lastColumn)
            return "Nom des etudiants";
      
        if(column == lastColumn-1)
            return "Commentaires";
      
   
        
    return listCourses.get(column-1);
    }

    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        int lastColumn = listCourses.size()+2;
        String elt = new String();
        if(rowIndex >=0){
            
        
            if(columnIndex == 0 || columnIndex == lastColumn)
                {
               elt = listStudents.get(rowIndex);
                }

         
            
           
        }
    
        return elt;
    }

}
