/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum20042026;

/**
 *
 * @author LAB-SI-PC
 */
public class MainBook {
    public static void main(String[] args){
        // Membuat objek Author
        Author Rin = new Author("Rinaldi Munir", "rinaldi@gmail.com", 'm');
        System.out.println(Rin); // Akan memanggil method toString() pada kelas Author
        
        // Membuat objek Book
        Book dummyBook = new Book("Algoritma dan pemograman", Rin, 98000, 99);
        System.out.println(dummyBook); // Akan memanggil method toString() pada kelas Book
        
        System.out.println("-----------------------------------");
        
        // Mengubah harga dan kuantitas buku
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        
        // Menampilkan data
        System.out.println("name is : " + dummyBook.getName());
        System.out.println("price is : " + dummyBook.getPrice());
        System.out.println("qty is : " + dummyBook.getQty());
        System.out.println("author is : " + dummyBook.getAuthor()); // Akan memanggil toString() dari Author
        System.out.println("Author's name is : " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is : " + dummyBook.getAuthor().getEmail());
        System.out.println("Author's gender is : " + dummyBook.getAuthor().getGender());
    }
}
