/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodaricollege;

/**
 *
 * @author gagandeep gahir
 */
public class Student {
   public String firstname;
   public String lastname;
   public String email;
   public String password;
   public String type;
   public int student_number;
   public void Student(String firstname,String lastname,int student_number,String email,String password,String type){
       this.firstname=firstname;
       this.lastname=lastname;
       this.email=email;
       this.password=password;
       this.type=type;
       
   }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public int getStudent_number() {
        return student_number;
    }
   
  
   }
    

