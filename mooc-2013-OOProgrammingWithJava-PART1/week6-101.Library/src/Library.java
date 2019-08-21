/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> list = new ArrayList<Book>();
    public Library() {
    }
    public void addBook(Book newBook){
        list.add(newBook);
        
    }
    public void printBooks(){
        for (Book book : list) {
            System.out.println(book.toString());
            
        }
    }
    public ArrayList<Book> searchByTitle(String searched) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book tit : list) {
            if (StringUtils.included(tit.title(), searched))
            found.add(tit);
        }
        
        
        return found;
    }
    public ArrayList<Book> searchByPublisher(String searched) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book tit : list) {
            if (StringUtils.included(tit.publisher(), searched))
            found.add(tit);
        }
        
        
        return found;
    }
     public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book tit : list) {
            if (tit.year() == year)
            found.add(tit);
        }
        
        
        return found;
    }
    
    
    
}
