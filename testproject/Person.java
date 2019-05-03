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
public class Person {
    public String Firstname;
    public String Lastname;
    public int Age;
    
    public Person(){
    
    }
       
      public Person(String Firstname,String Lastname,int Age){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.Age=Age;
    
    }
            
    public void setFirstname(String Firstname) {
    this.Firstname = Firstname;
    } 
    public void setLastname(String Lastname){
    this.Lastname = Lastname;
    
    }
    public void setage(int age){
    this.Age = age;
    }
    public String getFirstname(){
    return this.Firstname;
    }
    public String getLastname(){
    return this.Lastname;
    }
    public String getFullname(){
    return this.Firstname+" "+this.Lastname;
    }
    public int getage(){
    return this.Age;
    }
            
            
            
            
            
            
            
            
            
            
}
