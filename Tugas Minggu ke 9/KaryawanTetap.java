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
public class KaryawanTetap extends Karyawan {
    private double gajiBulanan;

    public KaryawanTetap(String nama, double gajiBulanan) {
        super(nama);
        this.gajiBulanan = gajiBulanan;
    }


    @Override
    public double hitungTotalGaji() {
        // Rumus: Gaji + Tunjangan 2.5%
        double tunjangan = gajiBulanan * 0.025;
        return gajiBulanan + tunjangan;
    }


    @Override
    public void cetakGaji() {
        super.cetakGaji(); 
        
        double tunjangan = gajiBulanan * 0.025;
        System.out.println("Status        : Karyawan Tetap");
        System.out.println("Gaji Pokok    : Rp" + this.gajiBulanan);
        System.out.println("Tunjangan     : Rp" + tunjangan);
        
        
        System.out.println("Total Gaji    : Rp" + hitungTotalGaji() + " (Dari: Gaji + Tunjangan)");
    }
}
