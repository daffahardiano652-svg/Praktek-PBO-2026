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
public class Kereta extends Transportasi {
    private String kelasKereta; 

    public Kereta(String namaPenumpang, String tujuan, String kelasKereta) {
        super(namaPenumpang, tujuan); 
        this.kelasKereta = kelasKereta;
    }

   
    @Override
    public double hitungBiaya() {
        // Menggunakan .equals() dasar. Huruf besar/kecil harus sama persis!
        if (kelasKereta.equals("Eksekutif")) {
            return 350000;
        } else if (kelasKereta.equals("Bisnis")) {
            return 200000;
        } else {
            return 80000; 
        }
    }

    
    
    @Override
    public void cetakTiket() {
        super.cetakTiket(); 
        System.out.println("Jenis Kendaraan : Kereta Api (Kelas " + this.kelasKereta + ")");
        System.out.println("Total Biaya     : Rp" + hitungBiaya());
    }
}
