/*
 * Created on 2 mars 2005
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
public class GetNumberOfColumn extends AbstractRequest{
		
	/**
	 * 
	 * @param name
	 * @param firstName
	 */
	public GetNumberOfColumn() {
		super("select * from intitulate_course");				
	}
		
	/**
	 * 
	 * @return
	 */
	public int getNumberofColumn() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();
			int columnNumber = 0;
			while(resultSet.next())
				columnNumber++;
			return columnNumber;						
	}
	
	
}
