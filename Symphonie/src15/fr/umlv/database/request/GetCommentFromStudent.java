/*
 * Created on 2 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database.request;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.umlv.database.AbstractRequest;
import fr.umlv.database.ConnectionFailException;
import fr.umlv.database.DriverClassNotFoundException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GetCommentFromStudent extends AbstractRequest{
		
	/**
	 * 
	 * @param name
	 * @param firstName
	 */
	public GetCommentFromStudent(String name,String firstName) {
		super("select comment " +
				"from students " +
				"where name='" + name + "' " +
				"and firstname='" + firstName + "'");		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getCommentFromStudent() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();
			if(resultSet.next())
				return (String)resultSet.getObject("comment");
			else return new String("no comment");				
	}
	
	
}
