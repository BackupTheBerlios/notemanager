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
public class ChangeCourseName extends AbstractRequest{
	/**
	 * 
	 * @param newName
	 * @param oldName
	 */
	public ChangeCourseName(String oldLabel,String newLabel)
	{
	super("update courses set courselabel='" + newLabel + 
			"' where id_course = (select id_course from courses where courselabel='" + oldLabel + "')"					
			);
	}
	
	
	public void changeCourseName() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{	
			ResultSet resultSet = getResultSet();								
	}
	
	
	
}
