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
public class DeleteCourse extends AbstractRequest{
/**
 * delete course and course's intitulate
 * @param name
 * @param firstName
 */
	public DeleteCourse(String courseLabel)
	{
		super("delete from intitulate_course where id_course= (select id_course from courses where courselabel ='" + courseLabel
				+ "'); " + "delete from courses where courselabel ='" + courseLabel + "'");
	}
	
	
	public void deleteCourse() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();					
	}
	
}
