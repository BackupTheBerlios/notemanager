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
public class ChangeIntitulateLabel extends AbstractRequest{
	/**
	 * 
	 * @param newName
	 * @param oldName
	 */
	public ChangeIntitulateLabel(String newLabel,String oldLabel)
	{
	super("update intitulates set intitulatelabel='"+newLabel   +
			"' where intitulatelabel='" + oldLabel + "'"					
			);
	}
	
	
	public void changeIntitulateLabel() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ResultSet resultSet = getResultSet();									
	}
	
	
	
}
