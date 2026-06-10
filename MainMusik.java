/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum250526;

/**
 *
 * @author acer
 */
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gitar gitar = new Gitar("Klasik","Petik",6);
       Keyboard keyboard = new Keyboard("Yamaha","Elektronik",true);
       
       System.out.println("\n Alat musik gitar");
       gitar.info();
       gitar.mainkan();
       gitar.stem();
       
       System.out.println("\n Alat Musik Keyboard");
       keyboard.info();
       keyboard.nyalakan();
       keyboard.mainkan();
       keyboard.stem();
       keyboard.matikan();
    }
    
}
