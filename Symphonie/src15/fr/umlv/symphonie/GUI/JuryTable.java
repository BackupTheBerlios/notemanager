package fr.umlv.symphonie.GUI;

/*
 * 
 *
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;



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
        //JuryTableColumnModel juryTableColumnModel = new JuryTableColumnModel(tableModel);
        this.table.setTableHeader(null);
        this.table.setCellSelectionEnabled(true);
        this.table.setModel(tableModel) ;
        this.table.setDefaultRenderer(Object.class,new DefaultTableCellRenderer(){
           /**
             * Comment for <code>serialVersionUID</code>
             */
            private static final long serialVersionUID = 1L;

        public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)
           {
           
          
          setHorizontalAlignment(SwingConstants.CENTER);           
          setVerticalAlignment(SwingConstants.CENTER); 
          table.setGridColor(Color.BLACK);
          
            if(row<=2)              
            {               
                setBackground(Color.LIGHT_GRAY);                         
                table.setFont(new Font(null,Font.BOLD,14));
            }
            else {
                setBackground(Color.WHITE);
                table.setFont(new Font(null,Font.CENTER_BASELINE,10));
            }
               
            
               return super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
           }
        });
        //this.table.setColumnModel(juryTableColumnModel);      
    }
    
 
    public JTable getTable()
    {
        return table; 
    }
       
}
