/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

package fr.umlv.symphonie.database.request;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import fr.umlv.symphonie.database.AbstractRequest;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ListCoursesIntitulateFromCourse extends AbstractRequest{

	
	public ListCoursesIntitulateFromCourse(String course) 
	{
		super("select intitulatelabel,coeff " +
				"from courses,intitulates,intitulate_course " +
				"where courses.courselabel='" + course + "' " + 
				"and intitulate_course.id_course = courses.id_course " + 
				"and intitulate_course.id_intitulate = intitulates.id_intitulate");
	}
	
	public HashMap<String,Integer> getListIntitulatesFromCourse() throws ConnectionFailException,SQLException, DriverClassNotFoundException{
		
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			ResultSet resultSet = getResultSet();
			while(resultSet.next())
			{
				String name = (String)resultSet.getObject("intitulatelabel");							
				Integer coeff = (Integer)resultSet.getObject("coeff"); 				
				map.put(name,coeff);
			}
			return map;				
	}	

}
