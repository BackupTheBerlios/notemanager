/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import java.awt.Container;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestTable {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Symphonie");
		
		frame.setSize(300,300);
		
		try {
			//GUICache guicache = GUICache.newInstance();
			//Cache cache = Cache.newCache();
			Cache cache = null;
			ViewStudent view = new ViewStudent(cache);					
			Container cont = frame.getContentPane();
			cont.add(view.getScrollPane());
			
			DialogSelectStudent dialog = new DialogSelectStudent(frame);
					
		}
		/*
		catch(SAXException s){
			System.out.println(s.getMessage());
		}
		catch (ParserConfigurationException pce){
			System.out.println(pce.getMessage());
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
		catch (ConnectionFailException e){
			System.out.println(e.getMessage());
		}
		catch(DriverClassNotFoundException e){
			System.out.println(e.getMessage());			
		}*/
		finally{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
		
		
	}
}
