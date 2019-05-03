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
public class Students {
    public String Name;
    public String CourseGrade;
    public Double Test;
    public Double Coursework;
    public Double Exammark;

    public Students(String Name) {
        this.Name = Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCourseGrade(String CourseGrade) {
        this.CourseGrade = CourseGrade;
    }

    public void setTest(Double Test) {
        this.Test = Test;
    }

    public void setCoursework(Double Coursework) {
        this.Coursework = Coursework;
    }

    public void setExammark(Double Exammark) {
        this.Exammark = Exammark;
    }

    public String getName() {
        return Name;
    }

    public String getCourseGrade() {
        if(Exammark==80){
        return "A";}
        else if(Exammark==70){
        return "B";
        }else if(Exammark==60){
            return "C";
        }else if(Exammark==50){
            return "D";
        }else if(Exammark<50){
            return "You have failed your exams!!";
        }
        
        
        return CourseGrade;
    }

    public Double getTest() {
        return Test;
    }

    public Double getCoursework() {
        return Coursework;
    }

    public Double getExammark() {
        return Exammark;
    }
    
    
    
}
