/*
 * Created on 7 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;
import fr.umlv.symphonie.database.request.GetCommentFromStudent;
import fr.umlv.symphonie.database.request.GetListStudentNoteFromCourseAndIntitulate;
import fr.umlv.symphonie.database.request.InsertStudentNoteFromCourseAndIntitulate;
import fr.umlv.symphonie.database.request.ListCourses;
import fr.umlv.symphonie.database.request.ListCoursesIntitulateFromCourse;
import fr.umlv.symphonie.database.request.ListStudent;
import fr.umlv.symphonie.database.request.SetCommentFromStudent;
import fr.umlv.symphonie.database.request.SetStudentNoteFromCourseAndIntitulate;
import fr.umlv.symphonie.database.request.StudentNoteFromCourseAndIntitulate;
import fr.umlv.symphonie.database.request.admin.ChangeCourseName;
import fr.umlv.symphonie.database.request.admin.ChangeIntitulateCoefficient;
import fr.umlv.symphonie.database.request.admin.ChangeIntitulateLabel;
import fr.umlv.symphonie.database.request.admin.ChangeStudentName;
import fr.umlv.symphonie.database.request.admin.DeleteCourse;
import fr.umlv.symphonie.database.request.admin.DeleteIntitulate;
import fr.umlv.symphonie.database.request.admin.DeleteStudent;
import fr.umlv.symphonie.database.request.admin.InsertCourse;
import fr.umlv.symphonie.database.request.admin.InsertIntitulate;
import fr.umlv.symphonie.database.request.admin.InsertStudent;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DefaultSymphonieDatabaseRequest implements SymphonieDatabaseRequest {
	
	
	/***************************************************
	 *                  BASIC REQUEST                  *
	 ***************************************************/
	public Map<String,String> getListStudents() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			return new ListStudent().getListStudents();		
	}
	
	public List<String> getListCourses() throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		
			return new ListCourses().getListCourses();		
	}
	public Map<String,Double> getListStudentNoteFromCourseAndIntitulate(String courseLabel,String intitulateLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException {
		return new GetListStudentNoteFromCourseAndIntitulate(courseLabel,intitulateLabel).getListNotes();
	}
	public Map<String,Integer> getListIntitulatesFromCourse(String course) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			return new ListCoursesIntitulateFromCourse(course).getListIntitulatesFromCourse();		
	}
	
	public double getStudentNoteFromCourseAndIntitulate(String name, String firstName, String course,String intitulate) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			return new StudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate).getStudentNoteFromCourseAndIntitulate();		
	}
	
	public String getCommentFromStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
		return new GetCommentFromStudent(name,firstName).getCommentFromStudent();		
	}
	
	public void setCommentFromStudent(String name, String firstName,String comment) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		
			SetCommentFromStudent s = new SetCommentFromStudent(name,firstName,comment);
			s.setComment();	
	}
	
	public void insertStudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate,double note) throws ConnectionFailException,SQLException,DriverClassNotFoundException 
	{
		
			InsertStudentNoteFromCourseAndIntitulate insert = new InsertStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate,note);
			insert.insertStudentNoteFromCourseAndIntitulate();	
	}
	
	public void updateStudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate,double note) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		
			SetStudentNoteFromCourseAndIntitulate s = new SetStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate,note);
			s.setStudentNoteFromCourseAndIntitulate();				
	}
	/***************************************************
	 *                  ADMIN REQUEST                  *
	 ***************************************************/
	
	/**
	 * 
	 * @param name
	 * @param firstName
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
	
			InsertStudent insert = new InsertStudent(name,firstName);
			insert.insertStudent();		
	}
	/**
	 * 
	 * @param name
	 * @param firstName
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeStudentNameAndFirstName(String name,String firstName,String newName,String newFirstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		
			ChangeStudentName change = new ChangeStudentName(name,firstName,newName,newFirstName);
			change.changeStudentName();					
	}
	/**
	 * 
	 * @param name
	 * @param firstName
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			DeleteStudent delete = new DeleteStudent(name,firstName);
			delete.deleteStudent();	
	}
	/**
	 * 
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertCourse(String courseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			InsertCourse insert = new InsertCourse(courseLabel);
			insert.insertCourse();	
	}
	/**
	 * 
	 * @param courseLabel
	 * @param newCourseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeCourseLabel(String courseLabel,String newCourseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{		
			ChangeCourseName change = new ChangeCourseName(courseLabel,newCourseLabel);
			change.changeCourseName();	
	}
	/**
	 * 
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteCourse(String courseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		
			DeleteCourse delete = new DeleteCourse(courseLabel);
			delete.deleteCourse();	
	}
	/**
	 * 
	 * @param intitulateLabel
	 * @param courseLabel
	 * @param coefficient
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertIntitulate(String intitulateLabel,String courseLabel,int coefficient) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		InsertIntitulate insert= new InsertIntitulate(courseLabel,intitulateLabel,coefficient);
		insert.insertIntitulate();
	}
	/**
	 * 
	 * @param intitulateLabel
	 * @param newIntitulateLabel
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeIntitulateLabel(String intitulateLabel,String newIntitulateLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		ChangeIntitulateLabel change = new ChangeIntitulateLabel(newIntitulateLabel,intitulateLabel);
		change.changeIntitulateLabel();
	}
	/**
	 * 
	 * @param intitulateLabel
	 * @param newCoefficient
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeIntitulateCoefficient(String intitulateLabel,int newCoefficient) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		ChangeIntitulateCoefficient change = new ChangeIntitulateCoefficient(intitulateLabel,newCoefficient);
		change.changeIntitulateCoefficient();
	}
	/**
	 * 
	 * @param intitulateLabel
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteIntitulate(String intitulateLabel,String courseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException
	{
		DeleteIntitulate delete = new DeleteIntitulate(intitulateLabel,courseLabel);
		delete.deleteIntitulate();
	}
	
	
	
	
}
