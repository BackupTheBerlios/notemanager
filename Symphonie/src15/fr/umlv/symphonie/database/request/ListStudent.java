/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

package fr.umlv.symphonie.database.request;

import fr.umlv.symphonie.database.AbstractRequest;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ListStudent extends AbstractRequest {
	
	/**
	 * default constructor 
	 * get a ResultSet with this request : select * from students
	 */
	public ListStudent()
	{
		super("select * from students");
	}
	
	/**
	 *  get listStudents
	 *  @return an ArrayList of students 
	 */
	public List<String> getListStudents() throws ConnectionFailException,SQLException,DriverClassNotFoundException {	
			
			ResultSet resultSet = getResultSet();
			List<String> listStudents = new ArrayList<String>();	
			while(resultSet.next())
			{
				String name = (String)resultSet.getObject("name");
				String firstName = 	(String)resultSet.getObject("firstname");
				listStudents.add(name + " " + firstName);
			}			
			return listStudents;	
	}	
}
