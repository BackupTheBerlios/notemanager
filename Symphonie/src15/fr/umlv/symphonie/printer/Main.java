/*
 * Created on 10 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.printer;

import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Main {

	public static void main(String[] args) {
		ViewTable view_model = new ViewTable(new File("."));
		JButton button = new JButton("Print");
		
		JTable table=new JTable(view_model);
		JScrollPane pane=new JScrollPane(table);
		
		final SymphoniePrinter sp = new SymphoniePrinter(pane);
		
		JFrame frame=new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.add(button,BorderLayout.SOUTH);
		c.add(pane,BorderLayout.NORTH);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sp.printIt();
			}
		});
		
		frame.setSize(400,300);
		frame.setVisible(true);
	}
}
