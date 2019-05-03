/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author gagandeep gahir
 */

public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={23,15,16,45,46,78,90,1000,20,962};
        int largest = array[0];
        
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
                
        }
       
        System.out.println("the largest number is: "+ largest);
           
    }
    
}
