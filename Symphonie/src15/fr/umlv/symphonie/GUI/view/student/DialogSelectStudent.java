/*
 * Created on 25 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.umlv.symphonie.GUI.Cache;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DialogSelectStudent {

	private final JInternalFrame dialog ;
	private final JButton submit = new JButton("Submit");
	private final JButton cancel = new JButton("Cancel");
	private final JTextField name = new JTextField();
	private final JTextField firstname = new JTextField();	
	
	public DialogSelectStudent(JFrame frame){
		
		dialog = new JInternalFrame("enter student name ",false,true);
		
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		addButtonCancel(pane,gbc);
		addButtonSubmit(pane,gbc);
		addTextFieldFirstName(pane,gbc);
		addTextFieldName(pane,gbc);
		
		dialog.add(pane);
		dialog.pack();
		dialog.setVisible(true);
		frame.add(dialog);
		//pane.add(new JLabel("Nom :"));
		//pane.add(new JLabel("PreNom :"));
		
		
	}
	private void addLabelName(JPanel pane,GridBagConstraints gbc){
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		pane.add(new JLabel("Name : "),gbc);		
	}
	private void addLabelFirstName(JPanel pane,GridBagConstraints gbc){
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		pane.add(new JLabel("Name : "),gbc);
	}
	
	private void addTextFieldName(JPanel pane,GridBagConstraints gbc){
		gbc.gridx=gbc.RELATIVE;
		gbc.gridy=gbc.RELATIVE;
		gbc.gridwidth = 5;
		gbc.gridheight = 1;
		pane.add(name,gbc);
	}
	private void addTextFieldFirstName(JPanel pane,GridBagConstraints gbc){
		gbc.gridx=gbc.RELATIVE;
		gbc.gridy=gbc.RELATIVE;
		//gbc.gridx=5;
		//gbc.gridy=2;
		gbc.gridwidth = 5;
		gbc.gridheight = 1;
		pane.add(firstname,gbc);
	}
	
	private void addButtonSubmit(JPanel pane,GridBagConstraints gbc){
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		pane.add(submit,gbc);
	}
	private void addButtonCancel(JPanel pane,GridBagConstraints gbc){
		gbc.gridx=5;
		gbc.gridy=4;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		pane.add(cancel,gbc);
	}
	
	
	
}
