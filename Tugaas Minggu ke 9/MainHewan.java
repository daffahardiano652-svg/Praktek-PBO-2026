/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum27042026;

/**
 *
 * @author acer
 */
public class MainHewan {
    
    public static void main(String[] args){
        //Pembuatan Objek
        Hewan hewanku=new Hewan("Makhluk Hidup");
        Kucing kucingku=new Kucing("Zikri");
        Anjing anjingku=new Anjing("SIgma");
        
        //mengakses super class
        System.out.println("\nTampilan akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        //mengakses sub calss kucing
        System.out.println("\nTampilkan akses sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
    }
}

