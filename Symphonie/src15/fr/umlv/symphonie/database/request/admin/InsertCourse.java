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
public class InsertCourse extends AbstractRequest{
/**
 * 
 * @param name
 */	
	public InsertCourse(String courseLabel)
	{
		super("insert into courses values(nextval('courses_id_course_seq'),'" + courseLabel + "')");
	}
	
	
	public void insertCourse() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		ResultSet resultSet = getResultSet();					
	}
	
}
