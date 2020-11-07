/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.kalkulator.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan proses hitung kalkulator
 */
public class Kalkulator {
    Double value1, value2 ;
    
    public double tambahBilangan(){
        double hasilTambah = value1 + value2;
        return hasilTambah;
    }
    
    public double kurangBilangan(){
        double hasilKurang = value1 - value2;
        return hasilKurang;
    }
    
    public double kaliBilangan(){
        double hasilKali = value1 * value2;
        return hasilKali;
    }
    
    public double bagiBilangan(){
        double hasilBagi = value1 / value2;
        return hasilBagi;
    }
    
    public double sisaBilangan(){
        double hasilSisa = value1 % value2;
        return hasilSisa;
    }

}

