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

public class MainTransportasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PEMESANAN TRANSPORTASI ===");
        
        System.out.print("Masukkan nama penumpang: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan kota tujuan   : ");
        String tujuan = input.nextLine();

        System.out.println("\nPilih Jenis Kendaraan:");
        System.out.println("1. Kereta Api");
        System.out.println("2. Bis Antar Kota");
        System.out.println("3. Mobil Travel");
        System.out.println("4. Sewa Motor");
        System.out.print("Masukkan pilihan (1-4) : ");
        int pilihan = input.nextInt();
        input.nextLine(); 
        Transportasi kendaraan = null;

        
        if (pilihan == 1) {
            System.out.print("Masukkan kelas (Eksekutif/Bisnis/Ekonomi): ");
            String kelas = input.nextLine();
            kendaraan = new Kereta(nama, tujuan, kelas);
            
        } else if (pilihan == 2) {
            System.out.print("Apakah ingin servis makan? (Y/T): ");
            String makan = input.nextLine();
            
            boolean dapatMakan = false;
            if (makan.equals("Y") || makan.equals("y")) {
                dapatMakan = true;
            }
            kendaraan = new Bis(nama, tujuan, dapatMakan);
            
        } else if (pilihan == 3) {
            System.out.print("Apakah ingin pakai supir? (Y/T): ");
            String supir = input.nextLine();
            
            boolean pakaiSupir = false;
            if (supir.equals("Y") || supir.equals("y")) {
                pakaiSupir = true;
            }
            kendaraan = new Mobil(nama, tujuan, pakaiSupir);
            
        } else if (pilihan == 4) {
            System.out.print("Berapa jumlah helm tambahan yang dipinjam? ");
            int helm = input.nextInt();
            kendaraan = new Motor(nama, tujuan, helm);
            
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        
        System.out.println("\n--- TIKET ANDA ---");
        if (kendaraan != null) {
            kendaraan.cetakTiket();
        }

        input.close(); 
    }
}
