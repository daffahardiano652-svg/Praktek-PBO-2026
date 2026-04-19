/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum06042026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(20); 
        pp1.setLebar(10);   
        int luas = pp1.luas(); 
        
        System.out.println("Objek Persegi Panjang Pertama");
        System.out.println("Panjang  = " + pp1.getPanjang()); 
        System.out.println("Lebar    = " + pp1.getLebar());   
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + pp1.keliling());   

        System.out.println(); 

        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(10, 5);
        luas = pp2.luas();
        
        System.out.println("Objek Persegi Panjang Kedua");
        System.out.println("Panjang  = " + pp2.getPanjang());
        System.out.println("Lebar    = " + pp2.getLebar());
        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + pp2.keliling());

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Objek Persegi Panjang Ketiga");
        
        System.out.print("Panjang  = ");
        int pj = input.nextInt();
        System.out.print("Lebar    = ");
        int lb = input.nextInt();
        
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(pj, lb);
        
        System.out.println("Luas     = " + pp3.luas());
        System.out.println("Keliling = " + pp3.keliling());
    }
}
