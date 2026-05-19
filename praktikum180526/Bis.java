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
public class Bis extends Transportasi {
    private boolean dapatMakan; 

    public Bis(String namaPenumpang, String tujuan, boolean dapatMakan) {
        super(namaPenumpang, tujuan);
        this.dapatMakan = dapatMakan;
    }


    @Override
    public double hitungBiaya() {
        double tarifDasar = 100000;
        if (dapatMakan == true) {
            return tarifDasar + 50000; 
        } else {
            return tarifDasar;
        }
    }

    
    @Override
    public void cetakTiket() {
        super.cetakTiket();
        
        String fasilitas;
        if (dapatMakan == true) {
            fasilitas = "Plus Servis Makan";
        } else {
            fasilitas = "Tanpa Servis Makan";
        }
        
        System.out.println("Jenis Kendaraan : Bis Antar Kota (" + fasilitas + ")");
        System.out.println("Total Biaya     : Rp" + hitungBiaya());
    }
}
