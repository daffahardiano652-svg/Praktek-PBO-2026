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
public class MahasiswaEnkapsulasi {
    // === ATRIBUT (PRIVATE) ===
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;

    // === METHOD (PUBLIC) ===

    // 1. Konstruktor Kosong
    public MahasiswaEnkapsulasi() {
    }

    // 2. Konstruktor Sebagian (Nama & NIM)
    public MahasiswaEnkapsulasi(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // 3. Konstruktor Lengkap
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }

    // --- GETTER ---
    public String getNama() { return this.nama; }
    public String getNim() { return this.nim; }
    public String getJurusan() { return this.jurusan; }
    public int getUmur() { return this.umur; }
    public double getIpk() { return this.ipk; }

    // --- SETTER ---
    public void setNama(String nama) { this.nama = nama; }
    public void setNim(String nim) { this.nim = nim; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
    public void setUmur(int umur) { this.umur = umur; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    // --- METHOD TAMBAHAN ---
    
    // Method untuk menentukan status kelulusan (mengembalikan String)
    public String statusKelulusan() {
        if (this.ipk >= 3.5) {
            return "Cumlaude (Dengan Pujian)";
        } else if (this.ipk >= 3.0) {
            return "Sangat Memuaskan";
        } else if (this.ipk >= 2.0) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan Nilai";
        }
    }

    // Method untuk menampilkan semua informasi
    public void tampilkanInfo() {
        System.out.println("Nama             : " + this.nama);
        System.out.println("NIM              : " + this.nim);
        System.out.println("Jurusan          : " + this.jurusan);
        System.out.println("Umur             : " + this.umur + " Tahun");
        System.out.println("IPK              : " + this.ipk);
        System.out.println("Status Kelulusan : " + statusKelulusan());
    }
}
