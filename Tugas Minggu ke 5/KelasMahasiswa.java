/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum30032026;

/**
 * Nama : Daffa Hardiano
 * Nim : 2501081009
 */
public class KelasMahasiswa {
    String NIM ;//attribut
    String Nama ;//attribut
    double tugas ;//attribut
    double uts ;//attribut
    double uas ;//attribut
 
    //konstruktor
    KelasMahasiswa(){
        
    }
    
    KelasMahasiswa(double a,double b, double c){
        tugas = a;
        uts = b;
        uas = c;   
    }
    
    //method
    double hitungNilaiAKhir(){
        return (tugas*0.25+uts*0.35+uas*0.40);
    }
    
}

    





   

   
