/*
 * Created on 1 mars 2005
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
public class StudentNoteFromCourseAndIntitulate extends AbstractRequest{	
/**
 * 
 * @param course
 * @param intitulate
 */
	public StudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate)
	{	
	super("select note " +
		  "from notes " +
		  "where id_student = ( select id_student from students where name ='" + name + "' and firstname ='" + firstName +"') " +
			"and id_course =(select id_course from courses where courselabel='" + course +	"') " +
			"and id_intitulate = (select id_intitulate from intitulates where intitulatelabel ='" + intitulate + "')");		  		  		  
	}
	
	/**
	 * 
	 * @return note -1 if student have no note defined
	 */
	public double getStudentNoteFromCourseAndIntitulate() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();
			if(resultSet.next())			
				return (Double)resultSet.getObject("note");
			else return -1.0;		
	}
	
}
