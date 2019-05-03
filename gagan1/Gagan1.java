/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gagan1;

/**
 *
 * @author gagandeep gahir
 */
import java.util.*;
public class Gagan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Students p1 = new Students("gagan");
        UndergraduateStudent p2 = new UndergraduateStudent("gagan");
        GraduateStudents p3 = new GraduateStudents("gagan");
        
        
        System.out.println("please enter your name: ");
        String name = input.nextLine();
        p1.setName(name);
        System.out.println("enter whether you are a undergraduateStudent or GraduateStudent: ");
        String Choice = input.nextLine();
        System.out.println("if you are a "+ Choice+" then your grades are: ");
        p1.getCourseGrade();
        
        
        
        
        
        
        
        
      
    }
    
}
