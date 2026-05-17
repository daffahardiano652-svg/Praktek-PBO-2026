/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20042026;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Class Point ===");
        // Membuat objek Point
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        
        System.out.println("Titik 1: " + p1.toString());
        System.out.println("Titik 2: " + p2.toString());
        
        // Tes fungsi distance pada Point
        System.out.println("Jarak Titik 1 ke pusat (0,0): " + p1.distance());
        System.out.println("Jarak Titik 1 ke (6,8): " + p1.distance(6, 8));
        System.out.println("Jarak Titik 1 ke Titik 2: " + p1.distance(p2));

        System.out.println("\n=== Testing Class Line ===");
        // Membuat objek Line menggunakan 4 koordinat x,y
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println("Garis 1: " + l1.toString());
        System.out.println("Panjang Garis 1: " + l1.getLength());

        // Membuat objek Line menggunakan 2 objek Point
        Point pBegin = new Point(1, 1);
        Point pEnd = new Point(4, 5);
        Line l2 = new Line(pBegin, pEnd);
        System.out.println("\nGaris 2: " + l2.toString());
        System.out.println("Panjang Garis 2: " + l2.getLength());
        
        // Menguji method setter delegasi pada Line
        System.out.println("\nMengubah titik akhir Garis 2 menjadi (7, 9)...");
        l2.setEndXY(7, 9);
        System.out.println("Garis 2 sekarang: " + l2.toString());
        System.out.println("Panjang Garis 2 sekarang: " + l2.getLength());
    }
}
