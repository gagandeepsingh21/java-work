/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author gagandeep gahir
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
     int gagan[][]={{5,5,8,8,7,9,4},{5,8,5,7,5,1,7}};
     int gagan1[][]={{5,8,5,8,1,8},{5,5,0,5,5,5},{2,3,3,4,4,4,5}};
     System.out.println("gagan");
     display(gagan);
     System.out.println("gagan1");
     display(gagan1);
     
    }
    public static void display(int x[][]){
        for(int i=0;i<x.length;i++){
            int x_i = x[i].length;
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+"\t");
                //System.out.println("Row \t"+row+" Column "+column+" XROW"+x_row);
                
            }
            System.out.println();
            
        }
        
    }
}