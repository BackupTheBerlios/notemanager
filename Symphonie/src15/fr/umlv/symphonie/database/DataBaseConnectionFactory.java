/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
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
			Class.forName("org.postgresql.Driver");									
			return DriverManager.getConnection("jdbc:postgresql://sqletud/GenieLogiciel:","jraselin","555666");
			
		} catch (SQLException e) {			
			throw new ConnectionFailException(e.getMessage());	
			
		}catch (ClassNotFoundException ce){
			throw new DriverClassNotFoundException(ce.getMessage());		
		}		
	}
}
