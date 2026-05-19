/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum20042026;

/**
 *
 * 
 */
public class Author {
    private final String name;
    private String email;
    private final char gender;
    
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }  
    
    public String getName(){
            return name;
        }
    public String getEmail(){
            return email;
    }
    
    public void setEmail(){
            this.email = email;
    }
    
    public String toString(){
        return name +"("+gender+")at"+email;
    }

    public char getGender() {
        return gender; //To change body of generated methods, choose Tools | Templates.
    }
}
