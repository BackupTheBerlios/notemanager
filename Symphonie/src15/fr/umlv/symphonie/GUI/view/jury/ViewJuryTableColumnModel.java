/*
 * 
 *
 */
package fr.umlv.symphonie.GUI.view.jury;

import java.awt.Component;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;




/**
 * @author jrichert
 *
 */
public class ViewJuryTableColumnModel extends DefaultTableColumnModel {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    int newColumn=0;
    boolean newFormula=false;
    /**
    *Instance juryTableColumnModel with juryTableModel's  headername.
    *@param model is use for heder's name value. 
    */
   public ViewJuryTableColumnModel(ViewJuryTableModel model)
   {
   super(); 

   for(int i=0;i < model.getColumnCount();i++)
       {
       TableColumn column = new TableColumn(i);      
      //column.setHeaderValue(model.getColumnName(i));
   
       this.addColumn(column);
       }
   }  
   
   public void addColumn(int col){
     /*  this.newColumn = col;
       this.newFormula = true;
       TableColumn column = new TableColumn();
       column.setCellEditor(new DefaultCellEditor(null){

        private static final long serialVersionUID = 1L;

       }); 
       addColumn(column);
       */
   }
   
   public void addColumn(TableColumn aColumn) 
   {
      /*if(this.newFormula)
       {
       System.out.println("Ajout d'une colonne");
       System.out.println(aColumn.getModelIndex()+" "+newColumn);
       moveColumn(0,newColumn);
       this.newFormula = false;
       }
      */
   }
   
   
}
