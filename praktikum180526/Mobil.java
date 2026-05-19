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
public class Mobil extends Transportasi {
    private boolean pakaiSupir; 

    public Mobil(String namaPenumpang, String tujuan, boolean pakaiSupir) {
        super(namaPenumpang, tujuan);
        this.pakaiSupir = pakaiSupir;
    }


    @Override
    public double hitungBiaya() {
        double sewaMobil = 250000;
        if (pakaiSupir == true) {
            return sewaMobil + 150000; 
        } else {
            return sewaMobil;
        }
    }


    @Override
    public void cetakTiket() {
        super.cetakTiket();
        
        String layanan;
        if (pakaiSupir == true) {
            layanan = "Dengan Supir";
        } else {
            layanan = "Lepas Kunci (Setir Sendiri)";
        }
        
        System.out.println("Jenis Kendaraan : Mobil Travel (" + layanan + ")");
        System.out.println("Total Biaya     : Rp" + hitungBiaya());
    }
}
