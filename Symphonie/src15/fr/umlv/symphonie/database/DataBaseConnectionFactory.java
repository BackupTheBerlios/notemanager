/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DataBaseConnectionFactory {
	
	
	
	
	/**
	 * try to connect to the database : sqletud
	 * 
	 * @return an object Connection (@see java.sql.Connection)
	 */
	public static Connection getConnection() throws ConnectionFailException,DriverClassNotFoundException{
		try {		
			Properties props = new Properties();
			props.load(new FileInputStream("DatabaseConfig"));							
			Class.forName(props.getProperty("driver"));
			String connection = "jdbc:" + props.getProperty("DbSystem") + ":" + props.getProperty("database"); 										
			return DriverManager.getConnection(connection,props.getProperty("user"),props.getProperty("password"));
			
		} 
		catch (FileNotFoundException fne){
			throw new ConnectionFailException("File config file not found : " + fne.getMessage());	
		}
		catch(InvalidPropertiesFormatException ie){
			throw new ConnectionFailException(ie.getMessage());
		}
		catch (IOException ioe){
			throw new ConnectionFailException(ioe.getMessage());
		}
		catch (SQLException e) {			
			throw new ConnectionFailException(e.getMessage());	
			
		}catch (ClassNotFoundException ce){
			throw new DriverClassNotFoundException( ce.getMessage());		
		}		
	}
}
