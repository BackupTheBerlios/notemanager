/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractRequest implements Request {

	private final String request;		
	/**
	 * default constructor
	 * @param request string representation of SQL request
	 */
	public AbstractRequest(String request) 
	{
		this.request= request;
	}
	
	public ResultSet getResultSet() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{	
			return RequestExecutor.getResultSet(request);		
	}
	
	
	
}
