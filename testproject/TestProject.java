/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author gagandeep gahir
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        
        p1.setFirstname("Gagandeep");
        p1.setLastname("Singh");
        p1.setage(19);
        
        System.out.println(p1.getFullname()+" "+p1.getage());
        
       
        
    }
    
}
