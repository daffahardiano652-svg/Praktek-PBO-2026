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
public class PembayaranEWallet extends Pembayaran {
    private String namaEWallet;

    public PembayaranEWallet(String namaEWallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }
    
    

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("E-Wallet: " + namaEWallet );
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar: Rp" + jumlahBayar);
    }
    
    
}
