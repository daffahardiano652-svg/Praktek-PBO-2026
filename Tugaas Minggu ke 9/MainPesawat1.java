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
public class MainPesawat1 {
    public static void main(String[] args) {
        // buat objek pada class Pesawat
        Pesawat p = new Pesawat("Air asia", 2020, true, 130);
        
        System.out.println("Kondisi awal");
        p.cetak();
        
        System.out.println();
        
        System.out.println("Kondisi setelah reset");
        p.reset("Lion Air", 1998, false, 80);
        p.cetak();
    }
}
