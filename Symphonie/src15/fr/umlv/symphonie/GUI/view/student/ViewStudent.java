/*
 * Created on 24 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI.view.student;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import fr.umlv.symphonie.GUI.Cache;
import fr.umlv.symphonie.GUI.GUICache;


/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewStudent {

	
	private final JTable table;
	private final JTextField label = new JTextField();
	/**
	 * 
	 * @param cache
	 */
	public ViewStudent(Cache cache,GUICache gui){
		table = createTable(cache);		
		label.setEditable(false);
		JPanel selection = createSelectionPanel(cache);
		JScrollPane tablePane = new JScrollPane(table);
		JSplitPane splitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,selection,tablePane);	
		splitpane.setDividerSize(0);		
		gui.getViewMap().put("student",splitpane);
		
	}
	
	/**
	 * 
	 * @return
	 */
	public JTable getJTable(){
		return table;
	}
	
	/**
	 * 
	 * @param cache
	 */
	private void selectStudent(Cache cache){
		DialogSelectStudent d = new DialogSelectStudent();		
		if(d.isOK()){
			checkStudent(cache,d.getName());
		}
	}
	
	/**
	 * 
	 * @param cache
	 * @param button
	 */
	private void setActionToButton(final Cache cache,JButton button){
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
				selectStudent(cache);
				
			}					
		});
	}
	
	/**
	 * 
	 * @param cache
	 * @return
	 */
	private JPanel createSelectionPanel(Cache cache){
		JPanel panel = new JPanel(new BorderLayout());
		// button
		JButton button = new JButton("change student");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createRaisedBevelBorder());					
		setActionToButton(cache,button);
		
		// label
		label.setText("Please select student");
		label.setHorizontalAlignment(JTextField.CENTER);
		label.setBackground(Color.WHITE);
		
		// add to panel
		panel.add(button,BorderLayout.WEST);
		panel.add(label,BorderLayout.CENTER);		
		return panel;
	}
		
	/**
	 * 
	 * @param cache
	 * @param studentName
	 */
	private void checkStudent(Cache cache,String studentName){
		if(cache.getMapStudent().get(studentName) == null){
			showConfirmDialog(cache,studentName);					
		}
		else {
			fireTableChange(cache,studentName);
		}		
	}
	
	/**
	 * 
	 *
	 */
	private void showConfirmDialog(Cache cache,String name) {
		int choice = JOptionPane.showConfirmDialog(null,"Student : " + name +"not found\nShow student list ?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(choice == JOptionPane.YES_OPTION)
			showListStudent(cache);
	}
	/**
	 * 
	 * @param cache
	 */
	private void showListStudent(Cache cache){
		List<String> list = cache.getListStudents();
		// fill selection values
		Object[] values = new Object[list.size()];		
		for(int i = 0 ; i<values.length ; i++){
			values[i]=list.get(i);
		}
		String studentName = (String)JOptionPane.showInputDialog(null,"Please select student","",JOptionPane.QUESTION_MESSAGE,null,values,values[0]);		
		if(studentName!=null){
			fireTableChange(cache,studentName);
		}
	}
	/**
	 * 
	 * @param cache
	 * @param studentName
	 */
	private void fireTableChange(Cache cache, String studentName){
		String[] tmp = studentName.split(" ");
		label.setText("Name : " + tmp[0] + "         FirstName : " + tmp[1]);
		label.setHorizontalAlignment(JTextField.CENTER);
		ViewStudentTableModel model = (ViewStudentTableModel)table.getModel();
		model.fillModel(cache.getMapStudent().get(studentName));
		model.fireTableDataChanged();
	}
		
	
	/**
	 * 
	 *
	 */
	private void createShowOptionDialog(){
		
	}

	/**
	 * 
	 * @param cache
	 * @return
	 */
	private JTable createTable(Cache cache){
		ViewStudentTableModel model = new ViewStudentTableModel(cache);		
		JTable table = new JTable(model,new ViewStudentTableColumnModel(model));		
		table.setShowGrid(false);	
		table.setDefaultRenderer(Object.class,new ViewStudentTableCellRenderer());
		return table;
	}		
}
