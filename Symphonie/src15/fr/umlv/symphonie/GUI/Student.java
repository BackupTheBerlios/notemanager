/*
 * 
 *
 */
package fr.umlv.symphonie.GUI;

import java.util.List;
import java.util.HashMap;

/**
 * @author jrichert
 *This class is used by cache. Every object has a name, a firstName, a HasMap with notes and a comment
 */
public class Student {
    private String name;
    private String firstName;
    private final HashMap<String,HashMap<String,Double>> notesMap;
    private String comment;
    
    /**
     *Create an object student. An student has notesn and a comment associate. 
     * @param name
     * @param firstName
     */
    public Student(String name,String firstName,String comment,List<String> listCourses){
        this.name = name; 
        this.firstName = firstName;
        this.comment = comment;        
        this.notesMap = fillNotesMap(listCourses);
    }
    
    /**
     * Instance a new HashMap and fill it with courses' list
     * @return
     */
    private HashMap<String, HashMap<String, Double>> fillNotesMap(List<String> listCourses){
       HashMap<String,HashMap<String,Double>> notesMap = new HashMap<String,HashMap<String,Double>>();
        for(String course : listCourses)
        notesMap.put(course,new HashMap<String,Double>());
        return notesMap;
    }

    /**
     * 
     * @param course
     * @param intitulate
     * @param note
     */
    public void setNoteFromCourseAndIntitulate(String course,String intitulate,double note){
       notesMap.get(course).put(intitulate,note);
             
    }
    
    /**
     * This method return a student's note for a course and an intitulate
     * @param course is the key for the first HashMap
     * @param intitulate is the key for he second HashMap
     * @return note
     */
    public double getNoteFromCourseAndIntitulate(String course,String intitulate){
        return notesMap.get(course).get(intitulate);
    }
    
    /**
     * This method return student's note
     * @return name of student
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method return student's firstName
     * @return firstName of student
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * This method return student's comment
     * @return comment of student
     */
    public String getComment(){
        return comment;
    }
}
