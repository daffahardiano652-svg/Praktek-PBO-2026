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
public class PembayaranTransfer extends Pembayaran {
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("Nama Bank: " + namaBank );
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar: Rp" + jumlahBayar);
    }
    
    

    
    
    
}
