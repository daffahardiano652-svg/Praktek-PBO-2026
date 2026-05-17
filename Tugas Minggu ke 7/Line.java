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
public class Line {
    // Atribut berupa objek Point (Komposisi)
    private Point begin;
    private Point end;

    // Constructor menggunakan koordinat tunggal
    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // Constructor menggunakan objek Point
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter dan Setter untuk Point
    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Getter dan Setter delegasi untuk koordinat begin
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Getter dan Setter delegasi untuk koordinat end
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Mengubah objek menjadi String
    public String toString() {
        return "Line[begin=" + begin.toString() + ", end=" + end.toString() + "]";
    }

    // Menghitung panjang garis (jarak antara begin dan end)
    public double getLength() {
        return begin.distance(end);
    }
}
