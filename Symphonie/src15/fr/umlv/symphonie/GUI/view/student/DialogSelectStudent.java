/*
 * Created on 25 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fr.umlv.symphonie.GUI.Cache;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DialogSelectStudent {

	private final JDialog pane = new JDialog();
	private final JButton submit = new JButton("OK");
	private final JButton cancel = new JButton("Cancel");
	private final JTextField name = new JTextField();
	private final JTextField firstname = new JTextField();
	
	
	public DialogSelectStudent(JFrame frame){
		pane.add(new JLabel("Nom :"));
		pane.add(new JLabel("PreNom :"));
		
		
	}
	
	
}
