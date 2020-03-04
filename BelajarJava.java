/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

import java.util.Scanner;
/**
 *
 * @author Christian Frans
 */
public class BelajarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Project Java Kemarin
    //1
        String Name = "Christian Frans";
        int NIM = 1920010040;
        boolean question = true;
        double ip = 3.3;
        
        System.out.println(Name);
        System.out.println(NIM);
        System.out.println(question);
        System.out.println(ip);
     System.out.println("");
    //2
        System.out.println("Input your message: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Your input text is " + input);
     System.out.println("");
    //3
        int nilai = 85;
        if (nilai < 74) {
            System.out.println("Nilai kamu kurang dari KKM");
        } else if (nilai >= 85){
            System.out.println("Nilai kamu cukup bagus");
        } else {
            System.out.println("Nilai kamu sangat bagus");
        }
        System.out.println("");
    //4
        System.out.println("Masukkan Angka :");
        Scanner inputan = new Scanner (System.in);
        int result = inputan.nextInt();
        
        if(result < 10){
            System.out.println("Under 10!");
        }
        else if (result <= 31) {
            System.out.println("Above 10 and Under 30");
        }
        else {
            System.out.println("Above 31");
        }
        
        
        
    }
    
}
