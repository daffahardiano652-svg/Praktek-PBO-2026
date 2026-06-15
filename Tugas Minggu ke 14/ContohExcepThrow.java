/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum080626;

import java.util.Scanner;

class CekUmur extends Exception{
    
}
/**
 *
 * @author acer
 */
public class ContohExcepThrow {
    
    public static void cekNilai(int nilai)throws Exception{
        if(nilai<0){
            throw new Exception("Nilai tidak bolrh nrgatif");
        }
        else if(nilai>100){
            throw new Exception("Nilai maksimum 100");
        }
    }
            
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       try{
       System.out.print("Masukkan sebuah angka = ");
       int angka = input.nextInt();
       cekNilai(angka);
    }catch(Exception e){
        System.out.println("gagal : "+e.getMessage());
    }finally{
           System.out.println("Sistem berhasil");
       }
    }
    
}
