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
 *
 */
public class Cache {

 private final SymphonieDatabaseRequest request = new DefaultSymphonieDatabaseRequest();

 private static boolean isInstance = false;
 private static Cache cache;
 private final Map<String,String> listStudents ;
 private final List<String> listCourses;

 private final Map<Integer,Student> mapStudents;
 
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
 
 public List<String> getListCourses(){
     return listCourses;
 }
 
 public Map<Integer,Student> getMapStudent(){
     return mapStudents;
 }
 
}