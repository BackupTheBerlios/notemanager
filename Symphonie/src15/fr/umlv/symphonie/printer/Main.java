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
		System.out.println("Test ...");
		ViewTable view_model = new ViewTable(new File("."));
		JButton button = new JButton("Print");
		
		JTable table=new JTable(view_model);
		JScrollPane pane=new JScrollPane(table);
		
		BarChartDemo1 demo = new BarChartDemo1("Bar Chart Demo");	
		
		JFrame frame=new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		
		container.add(button,BorderLayout.EAST);
		container.add(demo.getChartChanel(),BorderLayout.WEST);
		container.add(pane,BorderLayout.CENTER);
		
		final SymphoniePrinter sp = new SymphoniePrinter(container);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sp.printIt();
			}
		});
		
		frame.setSize(600,400);
		frame.setVisible(true);
	}
}
