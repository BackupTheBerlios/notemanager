/*
 * 
 *
 */
package fr.umlv.symphonie.GUI.view.jury;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

/**
 * @author jrichert
 *
 */
public class ViewJuryTableRenderer implements TableCellRenderer {

    private Cache cache;
    
    public ViewJuryTableRenderer()
    {
        try {
            this.cache = Cache.newCache();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (DriverClassNotFoundException e) {
            e.printStackTrace();
        } catch (ConnectionFailException e) {
            e.printStackTrace();
        }
    }
    
    /* (non-Javadoc)
     * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
     */
       
        public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)
        {
        
         
       JTextField cell = new JTextField(value.toString());
       
       cell.setHorizontalAlignment(JTextField.CENTER);           
      cell.setBorder(BorderFactory.createEmptyBorder());
      
      if(row == 0 && value.toString().equals(""))
          cell.setBackground(Color.WHITE);
      else if(row<3)              
         {               
             cell.setBackground(Color.LIGHT_GRAY);                         
             cell.setFont(new Font(null,Font.BOLD,14));
         }
         else {
             cell.setBackground(Color.WHITE);
             cell.setFont(new Font(null,Font.CENTER_BASELINE,10));
         }
           
         
            return cell;
         }

}
