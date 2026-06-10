/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum27042026;

/**
 *
 * @author acer
 */
public class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama);
    }
    
   
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+"\tberkata RARWWWWWW!!!");
    }
}

