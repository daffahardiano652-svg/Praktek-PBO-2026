/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum06042026;

/**
 *
 * @author LAB-SI-PC
 */
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
public PersegiPanjangEnkapsulasi(){
    jumlahObjek++;
}

public PersegiPanjangEnkapsulasi(int panjangBaru,int lebarBaru){
    this.panjang = panjangBaru;
    this.lebar = lebarBaru;
    jumlahObjek++;
}

public void setPanjang(int panjangBaru){
    panjang = panjangBaru;
}

public int getPanjang(){
    return panjang;
}

public void setLebar(int lebar){
    this.lebar = lebar;
}

public int getLebar(){
    return lebar;
}

public static int getJumlahObjek(){
    return jumlahObjek;
}

public int luas(){
    return (panjang*lebar);
}

 public int keliling(){
     return (2*panjang+2*lebar);
}
}
