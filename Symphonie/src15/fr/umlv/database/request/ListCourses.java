/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database.request;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.umlv.database.AbstractRequest;
import fr.umlv.database.ConnectionFailException;
import fr.umlv.database.DriverClassNotFoundException;
import fr.umlv.database.Request;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ListCourses extends AbstractRequest {
		
	/**
	 * 
	 */
	public ListCourses() {
		super ("select * from courses");
	// TODO Auto-generated constructor stub
	}
	
	
	
	public List<String> getListCourses() throws ConnectionFailException,SQLException,DriverClassNotFoundException{
			
			ResultSet resultSet = getResultSet();
			ArrayList<String> listCourses = new ArrayList<String>();
			while(resultSet.next())
			{
				String name = (String)resultSet.getObject("courselabel");
				listCourses.add(name);
			}			
			return listCourses;				
	}	

}
