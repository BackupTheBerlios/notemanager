/*
 * 
 *
 */
package fr.umlv.symphonie.GUI.view.jury;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.GUI.view.ViewSymphonie;


/**
 * @author jrichert
 *
 */
public class ViewJury implements ViewSymphonie {

   
    private JScrollPane component;
    private JTable table;
    private ViewJuryTableModel tableModel;
    private ViewJuryTableColumnModel juryTableNotesColumnModel;
    
    public ViewJury(Cache cache,GUICache gui)
    { 
      
      
        /*Create the main table*/
        this.table = new JTable();
        this.table.setVisible(true);  
        this.tableModel = new ViewJuryTableModel(cache);     
        juryTableNotesColumnModel = new ViewJuryTableColumnModel(tableModel);
        this.table.setTableHeader(null);
   
        this.table.setCellSelectionEnabled(true);
        this.table.setModel(tableModel) ;
        this.table.setDefaultRenderer(Object.class,new ViewJuryTableRenderer());
      
       
   
        this.component = new JScrollPane(table);
        gui.getViewMap().put("jury",this);
    }
    public JTable getTable(){
        return table;
    }
    
    public ViewJuryTableColumnModel getJuryTableColumnModel(){
    return juryTableNotesColumnModel;
}
    
public JComponent getComponent(){
    return component;
}

}
