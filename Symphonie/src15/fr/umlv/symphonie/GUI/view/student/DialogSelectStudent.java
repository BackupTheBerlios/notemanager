/*
 * Created on 25 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DialogSelectStudent {
	
	private final JTextField name = new JTextField();
	private final JTextField firstname =new JTextField(); 	
	private final JOptionPane select;
	
	
	public DialogSelectStudent(){					
		select = new JOptionPane(createDialogPanel(),JOptionPane.QUESTION_MESSAGE,JOptionPane.OK_CANCEL_OPTION);	
		select.createDialog(null,"selection").setVisible(true);				
	}
	/**
	 * 
	 * @return
	 */
	public JOptionPane getDialog(){
		return select;		
	}
	/**
	 * 
	 * @return
	 */
	public boolean isCancel(){
		return (Integer)select.getValue()==JOptionPane.CANCEL_OPTION;
	}
	public boolean isOK(){
		return !isCancel();
	}
		
	/**
	 * 
	 * @return
	 */
	public String getName(){		
		if(isOK())		
			return new String(name.getText() + " " + firstname.getText());
		else return "cancel";			
	}
	
	/**
	 * 
	 * @return
	 */
	private JPanel createDialogPanel(){
		JPanel dialog = new JPanel(new BorderLayout());
		dialog.add(createInfoPanel(),BorderLayout.NORTH);
		dialog.add(createInputPanel(),BorderLayout.SOUTH);		
		return dialog;
	}
	
	/**
	 * 
	 * @return
	 */
	private JPanel createInputPanel(){
		JPanel checkPanel = new JPanel(new GridLayout(2,2));
		checkPanel.add(new JLabel("name"));
		checkPanel.add(name);
		checkPanel.add(new JLabel("firstname"));
		checkPanel.add(firstname);	
		return checkPanel;
	}
	
	/**
	 * 
	 * @return
	 */
	private JPanel createInfoPanel(){
		JPanel infoPanel = new JPanel(new BorderLayout());
		infoPanel.add(new JLabel("Please enter student name and firstname"),BorderLayout.CENTER);
		return infoPanel;
	}
	
	
	
}
