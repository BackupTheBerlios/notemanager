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
import java.util.HashMap;
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
	public Map<String,String> getListStudents() throws ConnectionFailException,SQLException,DriverClassNotFoundException {	
			
			ResultSet resultSet = getResultSet();
			Map<String,String> listStudents = new HashMap<String,String>();	
			while(resultSet.next())
			{
				String name = (String)resultSet.getObject("name");
				String firstName = 	(String)resultSet.getObject("firstname");
				listStudents.put(name,firstName);
			}			
			return listStudents;	
	}	
}
