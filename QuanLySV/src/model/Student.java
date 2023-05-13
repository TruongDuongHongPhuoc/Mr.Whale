package Model;

import java.io.Serial;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class Student implements  Serializable{

    public static void remove(int chosenRow) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String ID;
    private String Name;
    private String Address;
     private String ClassStudent;
    private boolean Gender;
    private String Subject;
     
    public Student(String ID, String Name, String Address,String ClassStudent, boolean Gender,String Subject){
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.ClassStudent = ClassStudent;
        this.Gender = Gender;
        this.Subject = Subject;
        
    }

    public Student(String text, String text0, String toString, String text1, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getAddress(){
        return Address; 
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
        public String getClassStudent(){
        return ClassStudent; 
    }
    public void setClassStudent(String ClassStudent){
        this.ClassStudent = ClassStudent;
    }
    
    public boolean getGender(){
        return Gender;
    }
    public void setGender(boolean Gender){
        this.Gender = Gender;
    }
        public String getSubject(){
        return Subject; 
    }
    public void setSubject(String Subject){
        this.Subject = Subject;
    }
    
    
    public static void main(String[] args) {
        
    }
}