/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Christian Frans
 * 7/3/2020
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//         Tanpa Array
            String car1 = "Volvo";
            String car2 = "BMW";
            String car3 = "Ford";
            String car4 = "Mazda";
            
            System.out.println("");
            
//         Menggunakan Array
            String[] car = {"Volvo","BMW","Ford","Mazda"};
            
            System.out.println(car[0]);
            
            System.out.println("");
            
//         Mengubah Element Array
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            cars[0] = "Opel";
            System.out.println(cars[0]);
            
            System.out.println("");

//         Cek banyaknya Array
            System.out.println(cars.length);
            
            System.out.println("");
            
//          Multi-dimensional Array
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            int x = myNumbers[1][2];
            System.out.println(x);
    }
}
