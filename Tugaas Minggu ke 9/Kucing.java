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
public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama + "\tberkata Meong!!!");
    }
}
