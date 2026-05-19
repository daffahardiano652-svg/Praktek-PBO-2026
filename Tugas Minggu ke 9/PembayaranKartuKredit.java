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
public class PembayaranKartuKredit extends Pembayaran {
    private String nomorKartu;

    public PembayaranKartuKredit(String nomorKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNoKartu() {
        return nomorKartu;
    }

    public void setNoKartu(String noKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("Nomor Kartu Kredit : " + nomorKartu );
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar: Rp" + jumlahBayar);
    }
    
    
    
}
