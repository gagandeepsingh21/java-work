/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author gagandeep gahir
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<20;i++){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
            
        }
        
    }
    
}
