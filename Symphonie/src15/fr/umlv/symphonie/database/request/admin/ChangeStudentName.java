/*
 * Created on 17 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database.request.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.umlv.symphonie.database.AbstractRequest;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ChangeStudentName extends AbstractRequest{
	/**
	 * 
	 * @param newName
	 * @param oldName
	 */
	public ChangeStudentName(String newName,String newFirstName,String oldName,String oldFirstName)
	{
	super("update students set name='"+newName + "',firstname='" + newFirstName + 
			"' where name='" + oldName + "' and firstname='" + oldFirstName+ "'"					
			);
	}
	
	
	public void changeStudentName() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();									
	}
	
	
	
}
