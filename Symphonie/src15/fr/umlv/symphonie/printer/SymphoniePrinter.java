/*
 * Created on 10 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.printer;

import java.awt.print.*;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Printable;

/**
 * @author vraharin
 * Instances of this classe is called to print page's graphics.
 * Main method in this class is the <i>printIt<i> method, it calls the print method
 * overriden by implementing Printable interface. 
 * 
 */

public class SymphoniePrinter implements Printable {

	private Component toBePrinted;
	//private boolean needScale = false;
	
	/**
	 * A SymphoniePrinter should be created with the graphic component to be printed.
	 * @param c the compononent to be printed
	 */
	public SymphoniePrinter(Component c){
		this.toBePrinted = c;
	}
	
	private boolean needScale(PageFormat format){
		
		
		return false;
	}
	
	/**
	 * Call this method to begin job printing.
	 * The method print is called by the PrinterJob.
	 */
	public void printIt(){
	
		PrinterJob	printJob = PrinterJob.getPrinterJob();
		PageFormat format = printJob.defaultPage();
		format.setOrientation(PageFormat.PORTRAIT);
		printJob.setPrintable(this,format);
		
		if(printJob.printDialog()){
			try{
				printJob.print();
				/*if(p == Printable.NO_SUCH_PAGE)
					System.out.println("NO_SUCH_PAGE");
				else System.out.println("PAGE_EXISTS");*/
				
			}catch(PrinterException pe){ 
					pe.printStackTrace();
			}
		}
	}
	/**
	 * Prints the page at the specified index into the specified Graphics context in the specified format. 
	 * A PrinterJob calls the Printable interface to request that a page be rendered into the context specified by graphics. 
	 * The format of the page to be drawn is specified by pageFormat. 
	 * The zero based index of the requested page is specified by pageIndex.
	 *  
	 * */
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex){
	
		if( pageIndex > 0){
			System.out.println("NO_SUCH_PAGE");
			System.out.println("pageIndex : "+pageIndex);
			return Printable.NO_SUCH_PAGE;
		}
		
		Graphics2D graphics2D = (Graphics2D)graphics;
	
		//graphics2D.scale(0.7,1.0);
		
		graphics2D.translate((int)pageFormat.getImageableX(),(int)pageFormat.getImageableY());
		toBePrinted.paint(graphics);
		
		System.out.println("PAGE_EXISTS");
		System.out.println("pageIndex : "+pageIndex);
		return Printable.PAGE_EXISTS;
	}
}
