/*
 * Created on 28 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import fr.umlv.database.ConnectionFailException;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RequestExecutor {
	
	/**
	 *
	 * @param request String representation of the SQL request
	 * @return an instance of java.sql.ResultSet 
	 */
	public static ResultSet getResultSet(String request) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		try {
			PreparedStatement ps = DataBaseConnectionFactory.getConnection().prepareStatement(request);
			return ps.executeQuery();		
		}				
		catch (SQLException e) {
			//System.out.println("SQLState : " + e.getErrorCode());
			
			/* if request dont return a result SQLState is 02000 */
			if(!"02000".equalsIgnoreCase(e.getSQLState()))
				throw new SQLException(e.getMessage());
			/* resultSet is null in this case */
			else return null;
		}		
	}

}
