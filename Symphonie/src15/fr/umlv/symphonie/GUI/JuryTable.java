/*
 * 
 *
 */
package fr.umlv.symphonie.GUI;

import javax.swing.JTable;



/**
 * @author jrichert
 *
 */
public class JuryTable {

    private JTable table;
    private JuryTableModel tableModel;
    
    public JuryTable(Cache cache)
    {
        this.table = new JTable();
        this.table.setVisible(true);  
        this.tableModel = new JuryTableModel(cache);     
        JuryTableColumnModel juryTableColumnModel = new JuryTableColumnModel(tableModel);
        this.table.setCellSelectionEnabled(true);
        this.table.setModel(tableModel) ;
        this.table.setColumnModel(juryTableColumnModel);
      
    }
    
 
    public JTable getTable()
    {
        return table; 
    }
       
}
