/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author gagandeep gahir
 */
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        
        int sum=0;
        System.out.println("please enter 5 integers: ");
       
        int gagan[]=new int[10];
        
        for(int i=0;i<5;i++){
           gagan[i]=sc.nextInt();
            sum=sum+gagan[i];
        }
        System.out.println("the sum of the numbers you entered is: "+sum);
    }
    
}
