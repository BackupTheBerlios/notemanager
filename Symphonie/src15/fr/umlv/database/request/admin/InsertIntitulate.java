/*
 * Created on 17 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.database.request.admin;
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
public class InsertIntitulate extends AbstractRequest{
	
	/**
	 * 
	 * @param courseLabel
	 * @param intitulateLabel
	 * @param coeff
	 */
	public InsertIntitulate(String courseLabel,String intitulateLabel,int coeff)
	{
	super("insert into intitulates values(nextval('intitulates_id_intitulate_seq'),'" + intitulateLabel + 
		"'," + coeff + "); " + 
		"insert into intitulate_course values( (select id_intitulate from intitulates where intitulatelabel='" + intitulateLabel + "')" + 
		",(select id_course from courses where courselabel='" + courseLabel + "'))"
		);			
	}
	/**
	 * 
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertIntitulate() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();							
	}	
}
