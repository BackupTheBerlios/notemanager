/*
 * Created on 1 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database.request;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import fr.umlv.database.AbstractRequest;
import fr.umlv.database.ConnectionFailException;
import fr.umlv.database.DriverClassNotFoundException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GetListStudentNoteFromCourseAndIntitulate extends AbstractRequest{	
/**
 * 
 * @param course
 * @param intitulate
 */
	public GetListStudentNoteFromCourseAndIntitulate(String course,String intitulate)
	{	
	super("select note,name,firstname " +
		  "from notes,students " +
		  "where notes.id_student=students.id_student and " +
		  "id_course =(select id_course from courses where courselabel='" + course +	"') " +
			"and id_intitulate = (select id_intitulate from intitulates where intitulatelabel ='" + intitulate + "')");		
	
	}
	
	/**
	 * 
	 * @return note -1 if student have no note defined
	 */
	public Map<String,Double> getListNotes() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();
			Map<String,Double> map = new HashMap<String,Double>();
			while(resultSet.next()){
				 Double note = (Double)resultSet.getObject("note");
				 String name = (String)resultSet.getObject("name");
				 String firstname = (String)resultSet.getObject("firstname");
				 map.put(name+" "+firstname,note);
			}
			return map;			
	}
	
}
