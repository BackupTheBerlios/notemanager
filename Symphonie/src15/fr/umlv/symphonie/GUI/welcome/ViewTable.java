/*
 * Created on 10 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.welcome;

import java.io.File;
import javax.swing.table.AbstractTableModel;
import java.util.Date;
import java.util.HashMap;
/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewTable extends AbstractTableModel { 
	
		private final File[] files; 
		private final static String[] columnNames={ "Name","Length","Last modification","Name","Length","Last modification"};
				
		public ViewTable(File directory) { 
			files=directory.listFiles();
		}
		
		public int getColumnCount() { 
			return 3;
		} 
		
		public int getRowCount() {
			return files.length;
		}
		
		public String getColumnName(int column) { 
			return columnNames[column]; 	
		} 
		
		public Object getValueAt(int row, int column) {
			File file=files[row]; 
			switch(column) { 
				case 0: return file.getName(); 
				case 1: return file.length(); // boxing 
				case 2: return new Date(file.lastModified()); 
				case 3: return file.getName(); 
				case 4: return file.length(); // boxing 
				case 5: return new Date(file.lastModified()); 
			} 
			throw new AssertionError( "invalid column ("+row+','+column+')');
		}
}
