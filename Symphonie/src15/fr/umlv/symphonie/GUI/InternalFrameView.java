/*
 * Created on 25 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.GUI;

import java.awt.BorderLayout;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InternalFrameView {

	private final JInternalFrame internalFrameView;
	private final JComponent viewComponent;
	private final String viewName;
	static private final Map<String,Boolean> isInstanciedMap = new HashMap<String,Boolean>();
    static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;
    private static InternalFrameView instance;
    
    static {
    	String[] views = {"Jury","Teacher","Student","welcome"};
    	for(String view : views){
    		isInstanciedMap.put(view,new Boolean(false));	
    	}
    }
    
    public static InternalFrameView newInstance(String viewName,JComponent viewComponent){
    
    	if(!isInstanciedMap.get(viewName)){
    		instance = new InternalFrameView(viewName,viewComponent);
    		isInstanciedMap.put(viewName,Boolean.valueOf("true"));
    	}
    
    	return instance;
    }
    
    private InternalFrameView(String viewName,JComponent viewComponent) {
    	this.viewName = viewName;
    	this.viewComponent = viewComponent; 
    	this.internalFrameView = new JInternalFrame("View : "+viewName, 
    			true, //resizable
                true, //closable
                true, //maximizable
                true);//iconifiable);
    	
    	//add the current component selected (the table view)
    	internalFrameView.add(viewComponent,BorderLayout.CENTER);    	
    	
	
    	try {
	     		UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
	    	} catch (Exception e) { }
	
        
	//...Create the GUI and put it in the window...

        //...Then set the window size or call pack...
        internalFrameView.setSize(300,300);

        //Set the window's location.
        try{
        	internalFrameView.setMaximum(true);
        }catch(PropertyVetoException pve){
        	pve.printStackTrace();
        }
    }
    
    public JInternalFrame getInternalFrameView(){
    	return internalFrameView;
    }
}
