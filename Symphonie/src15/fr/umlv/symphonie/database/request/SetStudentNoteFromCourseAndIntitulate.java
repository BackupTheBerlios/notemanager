/*
 * Created on 1 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database.request;

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
public class SetStudentNoteFromCourseAndIntitulate extends AbstractRequest{	
/**
 * 
 * @param course
 * @param intitulate
 */
	public SetStudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate,double note)
	{	
	super("update notes " +
			"set note='" + note + "' " +
			"where id_student = ( select id_student from students where name ='" + name + "' and firstname ='" + firstName +"') " +
		"and id_course =(select id_course from courses where courselabel='" + course +	"') " +
		"and id_intitulate = (select id_intitulate from intitulates where intitulatelabel ='" + intitulate + "')");		
	}
	
	/**
	 * 
	 * @return note -1 if student have no note defined
	 */
	public void setStudentNoteFromCourseAndIntitulate() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();							
	}
	
}
