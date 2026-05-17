/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum20042026;

/**
 *
 * @author LAB-SI-PC
 */
public class Point {
    // Atribut private
    private int x = 0;
    private int y = 0;

    // Constructor tanpa parameter (default)
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor dengan parameter
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter dan Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Mengubah objek menjadi String
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // Menghitung jarak ke titik (x, y) tertentu
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Menghitung jarak ke objek Point lain
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    // Menghitung jarak ke titik pusat (0, 0)
    public double distance() {
        return distance(0, 0);
    }
}
