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
        // Tunjangan 2.5% dari gaji bulanan (2.5 / 100 = 0.025)
        double tunjangan = gajiBulanan * 0.025;
        return gajiBulanan + tunjangan;
    }
}
