/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.printer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Main2 {

	public static void addComponentToPrint(Container c, Component comp){
		c.add(comp,BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		
		PieChartDemo1 camembert = new PieChartDemo1("lol");
		
		JFrame frame=new JFrame();
		JPanel printedPanel = new JPanel();
		JButton button = new JButton("Print");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		printedPanel.add(camembert.getContentPane());
		
		addComponentToPrint(container,printedPanel);
		container.add(button,BorderLayout.SOUTH);
		
		final SymphoniePrinter sp = new SymphoniePrinter(printedPanel);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sp.printIt();
			}
		});
		
		frame.setSize(600,400);
		frame.pack();
		frame.setVisible(true);
	}
}
