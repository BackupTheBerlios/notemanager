/*
 * Created on 19 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.menu.formula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import fr.umlv.symphonie.GUI.GUICache;
import fr.umlv.symphonie.GUI.menu.AbstractGUIMenuItem;

/**
 * @author everybody
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemFormulaPluginAdd extends AbstractGUIMenuItem  {

	public ItemFormulaPluginAdd(GUICache cache) {
		super(cache,"formulaPluginAdd","formulaPlugin",false);
	}	
	
	/* (non-Javadoc)
	 * @see fr.umlv.symphonie.GUI.menu.MenuItem#setAction()
	 */
	public void setAction() {
		// TODO Auto-generated method stub
        JFrame frame = new JFrame("Add Plugin");
        frame.setSize(300,125);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel panel = new JPanel(false);
        JLabel labelName = new JLabel("Nom de la formule : ");
        JLabel labelFormule = new JLabel("Formule : ");
        
        JButton button = new JButton("Add");
        
        button.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
            }
           
        });
        frame.add(panel);
        
        File file = new File("");
        
        if(!file.exists())
        {
            JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
        
        }
        else {
            
        }
        
        
	}

}
