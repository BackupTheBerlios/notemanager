/*
 * 
 *
 */
package fr.umlv.symphonie.GUI.view.jury;

import java.sql.SQLException;

import javax.swing.JFrame;

import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;


/**
 * @author jrichert
 *
 */
public class Main {

    public static void main(String[] args) throws SQLException, DriverClassNotFoundException, ConnectionFailException{
        JFrame frame = new JFrame("JTable");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Cache cache = Cache.newCache();  
        JuryTable table = new JuryTable(cache);
        
        frame.add(table.getTable());
        frame.setVisible(true);
        
    }
    
}
