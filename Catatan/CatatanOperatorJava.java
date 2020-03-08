/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catatan.operator.java;

import java.util.Scanner;
/**
 *
 * @author user
 * references from petanikode
 */
public class CatatanOperatorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// OPERATOR ARITMATIKA
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        System.out.println("");
        
        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        System.out.println("");
        
        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);

         System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        System.out.println("");
        
        // perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = " + hasil);


        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        System.out.println("");
        
        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        System.out.println("");
        
        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil = " + hasil);
        
        System.out.println("");
        
        // Menghitung Keliling Persegi Panjang
        double kll, p, l;
        
        p = 6.0;
        l = 3.0;
        
        kll = (2*p) + (2*l);
        
        System.out.println(kll);
        
        System.out.println("");
        
// OPERATOR PENUGASAN
        int a;
        int b;

        // Pengisian nilai
        a = 5;
        b = 10;
        
        // penambahan
        b += a;
        // sekarang b = 15
        System.out.println("Penambahan : " + b);

        System.out.println("");
        
        // pengurangan
        b -= a;
        // sekarang b = 10 (karena 15-5)
        System.out.println("Pengurangan : " + b);
        
        System.out.println("");
        
        // perkalian
        b *= a;
        
        // sekarang b = 50 (karena 10*5)
        System.out.println("Perkalian : " + b);

        System.out.println("");
        
        // Pembagian
        b /= a;
        
        // sekarang b=10
        System.out.println("Pembagian : " + b);
        
        System.out.println("");

        // Sisa bagi
        b %= a;
        
        // sekarang b=0
        System.out.println("Sisa Bagi: " + b);
        
        System.out.println("");
        
//OPERATOR PEMBANDING
        
        int nilaiA = 12;
        int nilaiB = 4;
        boolean result;

        // apakah A lebih besar dari B?
        result = nilaiA > nilaiB;
        System.out.println(result);

        // apakah A lebih kecil dari B?
        result = nilaiA < nilaiB;
        System.out.println(result);

        // apakah A lebih besar samadengan B?
        result = nilaiA >= nilaiB;
        System.out.println(result);

        // apakah A lebih kecil samadengan B?
        result = nilaiA <= nilaiB;
        System.out.println(result);

        // apakah nilai A sama dengan B?
        result = nilaiA == nilaiB;
        System.out.println(result);

        // apakah nilai A tidak samadengan B?
        result = nilaiA != nilaiB;
        System.out.println(result);
        
        System.out.println("");
        
// OPERATOR LOGIKA

        boolean m = true;
        boolean n = false;
        boolean o;
        
        //KONJUNGSI (DAN)
        o = m && n;
        System.out.println("true && false = " + o);
        
        //DISJUNGSI (ATAU)
        o = m || n;
        System.out.println("true || false = " + o);
        
        //NEGASI (BUKAN)
        System.out.println("Negasi, !true = " + !m);
        
        System.out.println("");
        
//OPERATOR TERNARY
        
        boolean suka = true;
        String jawaban;

        // menggunakan operator ternary
        jawaban = suka ? "iya" : "tidak";

        // menampilkan jawaban
        System.out.println(jawaban);
    }
}
