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
import java.awt.print.Printable;

/**
 * @author vraharin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class SymphoniePrinter implements Printable {

private Component toBePrinted;
	
	public SymphoniePrinter(Component c){
		this.toBePrinted = c;
	}
	
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
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex){
	
		if( pageIndex > 0){
			System.out.println("NO_SUCH_PAGE");
			System.out.println("pageIndex : "+pageIndex);
			return Printable.NO_SUCH_PAGE;
		}
		
		graphics.translate((int)pageFormat.getImageableX(),(int)pageFormat.getImageableY());
		toBePrinted.paint(graphics);
		
		System.out.println("PAGE_EXISTS");
		System.out.println("pageIndex : "+pageIndex);
		return Printable.PAGE_EXISTS;
	}
}
