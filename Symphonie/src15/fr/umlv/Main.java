/*
 * Created on 28 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Iterator;


import fr.umlv.database.ConnectionFailException;
import fr.umlv.database.DefaultSymphonieDatabaseRequest;
import fr.umlv.database.DriverClassNotFoundException;



/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Main {

	public static void main(String[] args) {
		try {
			/*
		ArrayList<String> list = RequestFactory.getListCourses();	
		HashMap<String,Integer> map = RequestFactory.getListIntitulatesFromCourse("Java");
		
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " a pour coeff " + pairs.getValue());
			}
							
		for(String s : list)
		{
			System.out.println(s);
		}			
		*/
		String name = "RASELINARY";
		String firstName = "Johan";
		String course = "C++";
		String intitulate = "Exam";
		/*
		double note = RequestFactory.getStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate);
		System.out.println("" + name +" " +firstName + " a eu " + note +" en " + intitulate + " de " + course);
		
		*/
		/*
		SetStudentNoteFromCourseAndIntitulate set= new SetStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate,17.5);
		set.setStudentNoteFromCourseAndIntitulate();
		double note = RequestFactory.getStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate);
		System.out.println("" + name +" " +firstName + " a eu " + note +" en " + intitulate + " de " + course);
		
		
		
		
		//System.out.println("BEFORE update " + RequestFactory.getCommentFromStudent(name,firstName));
		RequestFactory.setCommentFromStudent(name,firstName,"Bien sur!");
		//System.out.println("AFTER update " + RequestFactory.getCommentFromStudent(name,firstName));
		*/
		
		//InsertStudentNoteFromCourseAndIntitulate insert = new InsertStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate,18.5);
		//insert.insertStudentNoteFromCourseAndIntitulate();
		//double note = RequestFactory.getStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate);
		//System.out.println("" + name +" " +firstName + " a eu " + note +" en " + intitulate + " de " + course);
		
		
		DefaultSymphonieDatabaseRequest request = new DefaultSymphonieDatabaseRequest();
		//request.deleteStudent("RICHERT","Julien");
		//request.insertStudent("RICHERT","Julien");
		//request.changeStudentNameAndFirstName("RASELINARY","Johan","RAPIERA","Cedric");
		//request.insertCourse("Test");
		//Map<String,Double> map = request.getListStudentNoteFromCourseAndIntitulate("Java avancee","Exam");
		/*
		Map<String,Integer> map = request.getListIntitulatesFromCourse("Java avancee");
		
		
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " a  " + pairs.getValue() + " en Java avancee");
			}
		*/
		
		//System.out.println(request.getStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate));
		
		
		//request.setCommentFromStudent(name,firstName,"NOUVEAU COMMENT");
		
		//request.updateStudentNoteFromCourseAndIntitulate(name,firstName,"Economie","Exam",19.0);
		
		//request.insertStudent("PIPOO","JObert");
		//System.out.println(request.getCommentFromStudent(name,firstName));
		
		//request.changeStudentNameAndFirstName("mico","Jojo","HACHANI","Sabrina");
		//request.deleteStudent("mico","Jojo");
		//request.insertCourse("OpenGL");
		//request.changeCourseLabel("OpenGL","Open  GL");
		//request.deleteCourse("Open  GL");
		
		//request.changeIntitulateLabel("Exam2","Exam");
		
		//request.changeIntitulateCoefficient("Exam",12);
		
		request.deleteIntitulate("Exam","Java avancee");
		
		}
		catch (ConnectionFailException ce)
		{
			System.out.println("Connection fail : " + ce.getMessage());
		}
		catch (SQLException e) {			
				System.out.println("SQLEXception : " + e.getMessage());
		}	
		catch (DriverClassNotFoundException de)
		{
			System.out.println("Driver not found : " +  de.getMessage());
		}
		
		
		
		
		
		
	}
}
