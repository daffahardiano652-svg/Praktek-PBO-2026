/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum180526;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MainPembayaran {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Deklarasi variabel objek denga inisiasi nilai awal
        Pembayaran pembayaran = null;
        
        System.out.println("-----Sistem Pembayaran Toko Online ----");
        System.out.println("Masukkan ID transaksi = ");
        String id = scanner.nextLine();
        
        System.out.print("Masukkan jumlah bayar : ");
        double jumlah = scanner.nextDouble();
        
        System.out.print("Pilih metode pembayaran : ");
        System.out.print("1. Transfer Bank");
        System.out.print("2. Kartu kredit");
        System.out.print("3. E-Wallet");
        System.out.print("Pilihan metode pembayaran anda (1/2/3) : ");
        int pilihan =scanner.nextInt();
        scanner.nextLine();///Buffer clear
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.print("Masukkan nama bank tujuan = ");
                     String bank=scanner.nextLine();
                     pembayaran = new PembayaranTransfer(bank,jumlah,id);
                     break;
            case 2 : System.out.println("MEtode Kartu Kredit");
                     System.out.print("Masukkan nomor kartu kredit = ");
                     String no = scanner.nextLine();
                     pembayaran = new PembayaranKartuKredit(no,jumlah,id);
                     break;        
            case 3 : System.out.println("Metode E-Wallet");
                     System.out.println("Masukkan nama E-Wallet (OVO,Shopeepay, Dana, dll) = ");
                     String nama = scanner.nextLine();
                     pembayaran = new PembayaranEWallet(nama,jumlah,id);
                     break;
        }
        System.out.println("\n==Konfirmasi Bukti Pembayaran ===");
        pembayaran.prosesPembayaran();
        
        
    }
}
