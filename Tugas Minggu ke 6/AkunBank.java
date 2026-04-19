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
public class AkunBank {
    private String norek;
    private String nama;
    private double saldo;

    // Konstruktor untuk inisialisasi awal
    public AkunBank(String norek, String nama, double saldoAwal) {
        this.norek = norek;
        this.nama = nama;
        this.saldo = saldoAwal;
    }

    // Method untuk menampilkan identitas dan saldo awal
    public void tampilkanInfoAwal() {
        System.out.println("No. Rekening : " + this.norek);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Saldo Awal   : Rp " + this.saldo);
    }

    // Method untuk menabung (deposit)
    public void deposit(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Saldo setelah deposit  : Rp " + this.saldo);
    }

    // Method untuk mengambil uang (withdraw)
    public void withdraw(double jumlah) {
        if (jumlah > this.saldo) {
            System.out.println("saldo tidak cukup!");
        } else {
            this.saldo -= jumlah;
            System.out.println("Saldo setelah withdraw : Rp " + this.saldo);
        }
    }
}
