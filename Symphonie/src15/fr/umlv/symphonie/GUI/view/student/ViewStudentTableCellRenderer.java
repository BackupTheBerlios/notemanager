/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;


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
		
	/* (non-Javadoc)
	 * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
	 */
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// TODO Auto-generated method stub
			if(value!=null){
				JTextField component = new JTextField(value.toString());			
				if(column==0 && row%5==0){
					component.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					component.setBackground(Color.GRAY);
					/*Font font = new Font("my font",Font.ITALIC|Font.BOLD,15);
					font.isBold();
					component.setFont(font);
					*/
				}
				else {
					component.setBorder(BorderFactory.createLineBorder(Color.BLACK));								
				}
				return component;
			}
			return null;
		}
}
