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
public class KaryawanKontrak extends Karyawan {
    private double gajiPerJam;
    private int totalJam;

    public KaryawanKontrak(String nama, double gajiPerJam, int totalJam) {
        super(nama); 
        this.gajiPerJam = gajiPerJam;
        this.totalJam = totalJam;
    }

    @Override
    public double hitungTotalGaji() {
        return totalJam * gajiPerJam;
    }

    @Override
    public void cetakGaji() {
        super.cetakGaji(); 
        
        System.out.println("Status        : Karyawan Kontrak");
        System.out.println("Total Jam     : " + this.totalJam + " jam");
        System.out.println("Gaji per Jam  : Rp" + this.gajiPerJam);
        
        
        System.out.println("Total Gaji    : Rp" + hitungTotalGaji() + " (Dari: Total Jam x Gaji per Jam)");
    }
}
