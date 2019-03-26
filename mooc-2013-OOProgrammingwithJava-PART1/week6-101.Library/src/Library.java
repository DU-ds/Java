/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author DU-ds
 */
public class Library 
{
    private ArrayList<Book> catalogue = new ArrayList<Book>();
    
    
    public Library()
    {
        this.catalogue = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook)
    {
        catalogue.add(newBook);
    }

    public void printBooks()
    {
        for (Book book : catalogue) {
            System.out.println(book.toString());
        }
    }
    
    //ex 101.3
    
    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : catalogue) {
            if (StringUtils.included(book.title(), title))
            {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : catalogue) {
            if(StringUtils.included(book.publisher(), publisher))
            {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : catalogue) {
            if(book.year() == year)
            {
                found.add(book);
            }
        }
        return found;
    }
    

    
    
    
    
}
