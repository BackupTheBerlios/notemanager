/*
 * 
 *
 */
package fr.umlv.symphonie.GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;



/**
 * @author jrichert
 *
 */
public class Main {

    public static void main(String[] args) {
        
       Cache cache;
    try {
        
        JFrame frame=new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         frame.setSize(600,600);
        
        cache = Cache.newCache();
        JuryTable table = new JuryTable(cache);
    
      
       frame.add(new JScrollPane(table.getTable()));
    
    
    
    frame.setVisible(true);
    
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (DriverClassNotFoundException e) {
        e.printStackTrace();
    } catch (ConnectionFailException e) {
        e.printStackTrace();
    } 
   
        
        
    }
}
