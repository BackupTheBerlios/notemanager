
package fr.umlv.symphonie.GUI;
/*
 * Created on 14 mars 2005
 *
 */
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.umlv.symphonie.database.ConnectionFailException;
import fr.umlv.symphonie.database.DefaultSymphonieDatabaseRequest;
import fr.umlv.symphonie.database.DriverClassNotFoundException;
import fr.umlv.symphonie.database.SymphonieDatabaseRequest;

/**
 * @author jrichert
 *
 */
public class Cache {

 private final SymphonieDatabaseRequest request = new DefaultSymphonieDatabaseRequest();

 private static boolean isInstance = false;
 private static Cache cache;
 private final Map<String,String> listStudents ;
 private final List<String> listCourses;

 
 private final Map<String, Map<String,Integer> > mapCoursesIntitulates;
 
 private final Map<String,String> mapCommentFromStudents;
 
 //getCommentFromStudent(String name,String firstName) throws ConnectionFailException,SQLException,DriverClassNotFoundException;
 //public double getStudentNoteFromCourseAndIntitulate(String name, String firstName, String course,String intitulate) throws ConnectionFailException,SQLException,DriverClassNotFoundException;

 
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
     mapCommentFromStudents = fillMapCommentFromStudents();
 }
 
 
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
  * 
  * @return
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
 
 private Map<String,String> fillMapCommentFromStudents(){
HashMap<String,String> map = new HashMap<String,String>();
   
    
    
     return map;
 }
 
 protected Map<String,Map<String,Integer>> getMapCoursesIntitulates()
 {
     return mapCoursesIntitulates;
 }
 
protected List<String> getListCourses(){
    return listCourses;
}

 
 protected Map<String,String> getListStudents(){
    return listStudents;     
 }
 
 
}
