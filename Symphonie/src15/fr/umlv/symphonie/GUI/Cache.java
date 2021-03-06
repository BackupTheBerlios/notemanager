package fr.umlv.symphonie.GUI;
/*
 * Created on 14 mars 2005
 *
 */
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DefaultSymphonieDatabaseRequest;
import fr.umlv.symphonie.database.DriverClassNotFoundException;
import fr.umlv.symphonie.database.SymphonieDatabaseRequest;

/**
 * @author jrichert
 *This class create an object compose with all necessary elements for views 
 */
public class Cache {

 private final SymphonieDatabaseRequest request = new DefaultSymphonieDatabaseRequest();

 private static boolean isInstance = false;
 private static Cache cache;
 private final List<String> listStudents ;
 private final List<String> listCourses;
 private final Map<String,Student> mapStudents;
 private final Map<String, Map<String,Integer> > mapCoursesIntitulates;
 
 /**
  * Create an object with Students' list, Courses' list, Intitulates' courses, students' comment
  * @throws SQLException
  * @throws DriverClassNotFoundException
  * @throws ConnectionFailException
  */
 private Cache() throws SQLException,DriverClassNotFoundException,ConnectionFailException
 {
     listStudents = request.getListStudents();
     listCourses = request.getListCourses();   
     mapCoursesIntitulates = fillMapCoursesIntitulates();     
     mapStudents = fillMapStudents();
  }
 
 /**
  * It's a static method for create an singleton's class
 */
 public static Cache newCache() throws SQLException, DriverClassNotFoundException, ConnectionFailException
 {
     if(!isInstance)
     {
         cache = new Cache();
         isInstance = true;
     }
     
     return cache;
 }
 
 
 /**
  * Fill a Map which contains keys' courses associate with a map where intitulates are coupled with coefficient 
  * @return map fill by method
  * @throws SQLException
  * @throws DriverClassNotFoundException
  * @throws ConnectionFailException
  */
 private Map<String,Map<String,Integer>> fillMapCoursesIntitulates() throws SQLException,DriverClassNotFoundException,ConnectionFailException{
     
     HashMap<String,Map<String,Integer>> map = new HashMap<String,Map<String,Integer>>();
     for(String s : listCourses)
     {
         map.put(s,request.getListIntitulatesFromCourse(s));
     }
     return map;          
 }
 
 /**
  * Fill a Map which contains an element associate with a number (line number)
  * @return the map fill in method
  * @throws ConnectionFailException 
  * @throws SQLException
  * @throws DriverClassNotFoundException
  */
 private Map<String,Student> fillMapStudents() throws ConnectionFailException, SQLException, DriverClassNotFoundException{
     HashMap<String,Student> map = new HashMap<String,Student>();
     for(String studentName : listStudents){ 	
     	String[] students =studentName.split(" ");
     	String name = students[0];
     	String firstName = students[1];
     	Student student = new Student(name,firstName,request.getCommentFromStudent(name,firstName),listCourses);
     	for(String course : listCourses){
     		Set<String> mapIntitulates = mapCoursesIntitulates.get(course).keySet();
            for(Iterator<String> it = mapIntitulates.iterator();it.hasNext();)
            {
                String intitulate = it.next();
                student.setNoteFromCourseAndIntitulate(course,intitulate,request.getStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate));           
            }     		     		     
     	}
        map.put(studentName,student);
     }   
     return map;     
 }  
 
 /**
  * Getter for an arrayList
  * @return listCourses
  */
 public List<String> getListCourses(){
     return listCourses;
 }
 
 /**
  * Getter for student's arrayList
  * @return listStudents
  */
 public List<String> getListStudents(){
     return listStudents;
 }
 
 /**
  *  Getter for the map which associates a number and a student
  * @return the mapStudents
  */
 public Map<String,Student> getMapStudent(){
     return mapStudents;
 }
 
 /**
  * Getter for the map which associate the course with intitulates and a coefficient
  * @return the mapCoursesIntitulates
  */
 public Map<String, Map<String,Integer> > getMapCoursesIntitulates(){
     return mapCoursesIntitulates;
 }

 
}