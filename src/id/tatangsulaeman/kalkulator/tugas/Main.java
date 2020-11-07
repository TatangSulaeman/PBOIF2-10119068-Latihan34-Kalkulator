/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.kalkulator.tugas;

import java.util.Scanner;
/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan hitung kalkulator
 */
public class Main {
    public static void main(String[] args){
        System.out.println("----------Aplikasi kalkulator Bilangan----------");
        Kalkulator data = new Kalkulator();
        Scanner inputKeyboard = new Scanner(System.in);
        
        System.out.print("Masukan Angka Ke-1\t : ");
        data.value1 = inputKeyboard.nextDouble();
        
        System.out.print("Masukan Angka Ke-2\t : ");
        data.value2 = inputKeyboard.nextDouble();
        
        String outputText = 
                "Hasil Pertambahan\t : " + data.tambahBilangan() + "\n" +
                "Hasil Pengurangan\t : " + data.kurangBilangan() + "\n" +
                "Hasil Perkalian\t\t : " + data.kaliBilangan() + "\n" +
                "Hasil Pembagian\t\t : " + data.bagiBilangan() + "\n" +
                "Hasil Sisa\t\t : " + data.sisaBilangan() + "\n" +
                "";
        System.out.println(outputText);
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
                
    }
}
