/*
 * Created on 2 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database.request;
import java.sql.SQLException;
import java.sql.ResultSet;

import fr.umlv.symphonie.database.AbstractRequest;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SetCommentFromStudent extends AbstractRequest{

	/**
	 * 
	 * @param name
	 * @param firstName
	 */
	public SetCommentFromStudent(String name,String firstName,String comment) {
		super("update students " +
				"set comment='" +comment + "' " +
				"where name='" + name + "' " +
				"and firstname='" + firstName + "'");		
	}
	
	public void setComment() throws ConnectionFailException,SQLException,DriverClassNotFoundException {		
		ResultSet resultSet = getResultSet();		
	}
	
	
}
