/*
 * 
 *
 */
package fr.umlv.symphonie.GUI;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jrichert
 *
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

    public void setNoteFromCourseAndIntitulate(String course,String intitulate,double note){
       notesMap.get(course).put(intitulate,note);
             
    }
    
    public double getNoteFromCourseAndIntitulate(String course,String intitulate){
        return notesMap.get(course).get(intitulate);
    }
    
    public String getName(){
        return name;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public Map<String,HashMap<String,Double>> getNotesMap(){
    	return notesMap;
    }
    
    public String getComment(){
        return comment;
    }
}
