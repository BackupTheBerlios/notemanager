/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface Request {
	/**
	 * execute request and return ResultSet
	 * ResultSet can be unsetted
	 * @return 
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public ResultSet getResultSet() throws ConnectionFailException,SQLException,DriverClassNotFoundException ;	
}
