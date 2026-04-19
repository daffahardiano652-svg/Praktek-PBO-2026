/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum06042026;

/**
 *
 * @author acer
 */
public class MainMahasiswa {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN KONSTRUKTOR 1 (KOSONG) ===");
        // Bikin objek kosong, lalu isi pakai Setter
        MahasiswaEnkapsulasi mhs1 = new MahasiswaEnkapsulasi();
        mhs1.setNama("Daffa");
        mhs1.setNim("2211523001");
        mhs1.setJurusan("Teknik Komputer");
        mhs1.setUmur(20);
        mhs1.setIpk(3.85);
        mhs1.tampilkanInfo();
        System.out.println("----------------------------------------\n");

        System.out.println("=== PENGUJIAN KONSTRUKTOR 2 (SEBAGIAN) ===");
        // Bikin objek dengan Nama & NIM langsung, sisanya disusul pakai Setter
        MahasiswaEnkapsulasi mhs2 = new MahasiswaEnkapsulasi("Andi Saputra", "2211523002");
        mhs2.setJurusan("Sistem Informasi");
        mhs2.setUmur(21);
        mhs2.setIpk(2.75);
        mhs2.tampilkanInfo();
        System.out.println("----------------------------------------\n");

        System.out.println("=== PENGUJIAN KONSTRUKTOR 3 (LENGKAP) ===");
        // Bikin objek langsung jadi (semua data diisi di awal)
        MahasiswaEnkapsulasi mhs3 = new MahasiswaEnkapsulasi("Budi Santoso", "2211523003", "Teknik Informatika", 22, 3.20);
        mhs3.tampilkanInfo();
        System.out.println("----------------------------------------\n");
    }
}
