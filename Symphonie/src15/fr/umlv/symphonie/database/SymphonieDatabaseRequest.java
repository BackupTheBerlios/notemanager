/*
 * Created on 5 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.umlv.symphonie.database;

import java.sql.SQLException;

import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DriverClassNotFoundException;

import java.util.List;
import java.util.Map;
/**
 * @author jraselin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface SymphonieDatabaseRequest {
	
	/* BASIC Symphonie's request */
				
	/**
	 * OK
	 * @return student's list
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public List<String> getListStudents() throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @return
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public List<String> getListCourses() throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param course
	 * @return
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public Map<String,Integer> getListIntitulatesFromCourse(String course) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
/**
 * OK
 * @return
 * @param courseLabel
 * @param intitulateLabel
 * @throws ConnectionFailException
 * @throws SQLException
 * @throws DriverClassNotFoundException
 */
	public Map<String,Double> getListStudentNoteFromCourseAndIntitulate(String courseLabel,String intitulateLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @param course
	 * @param intitulate
	 * @return
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public double getStudentNoteFromCourseAndIntitulate(String name, String firstName, String course,String intitulate) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @return
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
		
	public String getCommentFromStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @param comment
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void setCommentFromStudent(String name, String firstName,String comment) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @param course
	 * @param intitulate
	 * @param note
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertStudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate,double note) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @param course
	 * @param intitulate
	 * @param note
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void updateStudentNoteFromCourseAndIntitulate(String name,String firstName, String course,String intitulate,double note) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	
	/* ADMINISTRATOR REQUEST */
	
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeStudentNameAndFirstName(String name,String firstName,String newName,String newFirstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param name
	 * @param firstName
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertCourse(String courseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param courseLabel
	 * @param newCourseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeCourseLabel(String courseLabel,String newCourseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteCourse(String courseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * check again
	 * @param intitulateLabel
	 * @param courseLabel
	 * @param coefficient
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void insertIntitulate(String intitulateLabel,String courseLabel,int coefficient) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param intitulateLabel
	 * @param newIntitulateLabel
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeIntitulateLabel(String intitulateLabel,String newIntitulateLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param intitulateLabel
	 * @param newCoefficient
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void changeIntitulateCoefficient(String intitulateLabel,int newCoefficient) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	/**
	 * OK
	 * @param intitulateLabel
	 * @param courseLabel
	 * @throws ConnectionFailException
	 * @throws SQLException
	 * @throws DriverClassNotFoundException
	 */
	public void deleteIntitulate(String intitulateLabel,String courseLabel) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
	
	
}
