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
 private final Map<String,String> listStudents ;
 private final List<String> listCourses;

 private final Map<Integer,Student> mapStudents;
 
 private final Map<String, Map<String,Integer> > mapCoursesIntitulates;

 private final int numberColumns;

 
 
 
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
     numberColumns = request.getNumberOfColumn();
 }
 
 /**
  * It's a static method for create an singleton's class
  * @return Cache is object represent the class
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
 private Map<Integer,Student> fillMapStudents() throws ConnectionFailException, SQLException, DriverClassNotFoundException{
     HashMap<Integer,Student> map = new HashMap<Integer,Student>();
     Set<String> setNameStudent = listStudents.keySet();
     int row = 0;
   for(Iterator<String> i = setNameStudent.iterator(); i.hasNext();){
       String name = i.next();
       String firstName = listStudents.get(name);
       Student student = new Student(name,firstName,request.getCommentFromStudent(name,firstName),listCourses);
      
       for(String course : listCourses)
       {
           Set<String> mapIntitulates = mapCoursesIntitulates.get(course).keySet();
           for(Iterator<String> it = mapIntitulates.iterator();it.hasNext();)
           {
               String intitulate = it.next();
               student.setNoteFromCourseAndIntitulate(course,intitulate,request.getStudentNoteFromCourseAndIntitulate(name,firstName,course,intitulate));           
           }
       }
        map.put(row++,student);     
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
  *  Getter for the map which associates a number and a student
  * @return the mapStudents
  */
 public Map<Integer,Student> getMapStudent(){
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