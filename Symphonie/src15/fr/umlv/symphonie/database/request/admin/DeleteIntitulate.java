/*
 * Created on 17 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database.request.admin;
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
public class DeleteIntitulate extends AbstractRequest{
	/**
	 * 
	 * @param intitulateLabel
	 * @param courseLabel
	 */
	public DeleteIntitulate(String intitulateLabel,String courseLabel)
	{
		super("delete from intitulate_course where id_intitulate = (" +
				"select id_intitulate from intitulates where intitulatelabel ='" + intitulateLabel + "') "+
				"and id_course=(" + 
				"select id_course from courses where courselabel='" + courseLabel				
				+ "'); " + "delete from intitulates where intitulatelabel ='" + intitulateLabel + "'");
	}
	
	/**
	 * 
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteIntitulate() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();					
	}
	
}
