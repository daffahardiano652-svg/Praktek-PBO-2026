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
public class Motor extends Transportasi {
    private int jumlahHelm; 

    public Motor(String namaPenumpang, String tujuan, int jumlahHelm) {
        super(namaPenumpang, tujuan);
        this.jumlahHelm = jumlahHelm;
    }


    @Override
    public double hitungBiaya() {
        double sewaDasar = 50000;
        double biayaHelm = jumlahHelm * 10000; 
        return sewaDasar + biayaHelm;
    }


    @Override
    public void cetakTiket() {
        super.cetakTiket();
        System.out.println("Jenis Kendaraan : Sewa Motor (Tambah " + this.jumlahHelm + " Helm)");
        System.out.println("Total Biaya     : Rp" + hitungBiaya());
    }
}
