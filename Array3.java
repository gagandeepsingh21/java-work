/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author gagandeep gahir
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[][]={{1,2,3,4},{1,2,3,4}};
        int array1[][]={{1,2,2,4,5},{1,2,2,4,5}};
        System.out.println("array");
        display(array);
        System.out.println("array1");
        display(array1);
        
    }
    public static void display(int array[][]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    
}
