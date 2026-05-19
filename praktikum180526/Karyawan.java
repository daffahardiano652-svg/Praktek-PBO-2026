/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum180526;

/**
 *
 * @author acer
 */
public class Karyawan {
    private String nama;

    public Karyawan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    
    public double hitungTotalGaji() {
        return 0; 
    }

    
    public void cetakGaji() {
        System.out.println("Nama Karyawan : " + this.nama);
    }
}
