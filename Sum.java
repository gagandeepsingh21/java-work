/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author gagandeep gahir
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input[]={1,2,3,4,4,5,5,5,6,6,7};
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum+=i;
        }
        System.out.println("the sum is: "+sum);
    }
    
}
