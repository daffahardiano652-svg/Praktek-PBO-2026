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
import java.util.Scanner;

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENGGAJIAN KARYAWAN ===");
        
        System.out.print("Masukkan nama karyawan       : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan gaji pokok bulanan  : Rp");
        double gaji = input.nextDouble();

        KaryawanTetap pegawai = new KaryawanTetap(nama, gaji);

        System.out.println("\n--- SLIP GAJI ---");
        System.out.println("Nama Karyawan : " + pegawai.getNama());
        System.out.println("Total Gaji    : Rp" + pegawai.hitungTotalGaji() + " (Termasuk Tunjangan 2.5%)");

        input.close();
    }
}
