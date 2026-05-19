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
        System.out.print("Masukkan nama karyawan : ");
        String nama = input.nextLine();

        System.out.println("\nPilih Status Karyawan:");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Masukkan pilihan (1/2) : ");
        int pilihan = input.nextInt();

        Karyawan pegawai = null; 
        if (pilihan == 1) {
            System.out.print("Masukkan gaji pokok bulanan : Rp");
            double gaji = input.nextDouble();
            pegawai = new KaryawanTetap(nama, gaji); 
            
        } else if (pilihan == 2) {
            System.out.print("Masukkan upah per jam       : Rp");
            double upah = input.nextDouble();
            
            System.out.print("Masukkan jumlah jam kerja   : ");
            int jam = input.nextInt();
            pegawai = new KaryawanKontrak(nama, upah, jam);
            
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        if (pegawai != null) {
            System.out.println("\n--- SLIP GAJI ---");
            pegawai.cetakGaji(); 
        }

        input.close();
    }
}
