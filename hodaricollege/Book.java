/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodaricollege;

/**
 *
 * @author gagandeep gahir
 */
public class Book {
    public String genre;
    public String author;
    public int ISBN_number;
    public int version;
    public void Book(String genre,String author,int ISBN_number,int version){
        this.genre = genre;
        this.author = author;
        this.ISBN_number = ISBN_number;
        this.version =version;
         }
    public String getgenre(){
        return this.genre;
    }
    public String getauthor(){
        return this.author;
    }
    public int getISBN_number(){
        return this.ISBN_number;
    }
    public int getversion(){
        return this.version;
    }
    
    
}
