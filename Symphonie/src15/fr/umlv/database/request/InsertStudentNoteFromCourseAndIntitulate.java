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
public class InsertStudentNoteFromCourseAndIntitulate extends AbstractRequest{	
/**
 * 
 * @param course
 * @param intitulate
 */
	public InsertStudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate,double note)
	{	
	super("insert into notes values (" +
			"(select id_intitulate from intitulates where intitulatelabel ='" + intitulate + "'),"+
			"(select id_course from courses where courselabel='" + course +	"')," +
			"(select id_student from students where name ='" + name + "' and firstname ='" + firstName +"')," +
			note + ")"
		);		
	}
	
	/**
	 * 
	 * @return note -1 if student have no note defined
	 */
	public void insertStudentNoteFromCourseAndIntitulate() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();					
	}
	
}
