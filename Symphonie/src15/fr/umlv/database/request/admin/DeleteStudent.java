/*
 * Created on 17 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database.request.admin;
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
public class DeleteStudent extends AbstractRequest{
/**
 * delete student and student's note
 * @param name
 * @param firstName
 */
	public DeleteStudent(String name,String firstName)
	{
		super("delete from notes where id_student= (select id_student from students where name ='" + name + "' and firstname ='"
				+ firstName + "'); " + "delete from students where name ='" + name + "' and firstname ='" + firstName + "'");
	}
	
	
	public void deleteStudent() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();					
	}
	
}
