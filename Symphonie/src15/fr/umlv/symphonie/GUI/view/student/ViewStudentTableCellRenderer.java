/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;


/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewStudentTableCellRenderer implements TableCellRenderer {

	private final Map<Integer,StudentCellRenderer> map;
	
	
	public ViewStudentTableCellRenderer(){
		map = new HashMap<Integer,StudentCellRenderer>();
		
		
	}
	
	
	/* (non-Javadoc)
	 * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
	 */
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// TODO Auto-generated method stub
		JTextField component = new JTextField();		
		if(column==1)			
			component.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		return component;
	}

}
