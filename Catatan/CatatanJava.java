/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catatanjava;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class CatatanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    Catatan Java dari Powerpoint - sama persis

//Data Type
String hello = "Hello";
int number = 7;
boolean question = true;
double comma = 23.3;

        System.out.println(hello);
        System.out.println(number);
        System.out.println(question);
        System.out.println(comma);
        
        System.out.println("");

//Scanner

        System.out.println("Input your message: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Your input text is " + input);
        
        System.out.println("");
        
//if else if

        int time = 17;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if  (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        
        System.out.println("");
        
//switch case

        System.out.println("Masukkan teks: ");
        Scanner inputan = new Scanner(System.in);
        String hasil = inputan.nextLine();
        
        switch(hasil){
            case "1":
                System.out.println("Hello World");
                break;
            case "2":
                System.out.println("Christian is Adorable");
                break;
            case "3":
                System.out.println("No Option!");
                break;
        }
        
        System.out.println("");
        
//for
        int max = 100;
        for(int i = 0; i < max; i++){
            System.out.println(i);
        }
        
        System.out.println("");

//foreach
        int arr[] = {3, 1, 2, 5, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("");
        
//while do
        int maks = 10;
        int i = 0;
        while (i < maks){
            System.out.println("Hello World");
            i++;
        }
        
        System.out.println("");
        
//do while

        int maksimum = 10;
        int x = 0;
        do{
            System.out.println("Hello World");
            x++;
        }while(x < maksimum);
        }
}
