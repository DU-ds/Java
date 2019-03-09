/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonesearchmooc.Phones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DU-ds
 */
public class PhoneSearch 
{
    Scanner scan;
    List<Person> catalog;
    Reader read;
    String notFoundMsg = "  not found";
    
    public PhoneSearch(Scanner scan)
    {
        this.scan = scan;
        this.catalog = new ArrayList<Person>();
        read = new Reader(scan);
    }
    
    
    public void addPerson(Person person)
    {
        this.catalog.add(person);
    }
    
    public Person getPersonByName(String name) throws Exception
    {
        for (Person p : this.catalog)
        {
            if(p.getName().equals(name))
            {
                return p;
            }
        }
        //return new Person("","");
        throw new Exception();
    }

    public Person getPersonByNumber(String number) throws Exception
    {
        for (Person p : this.catalog)
        {
            if(p.getNumber().equals(number))
            {
                return p;
            }
        }
        //return new Person("","");
        throw new Exception();
        //throw new IllegalArgumentException()
    }

    public void removePerson(String name) throws Exception
    {
        
        this.catalog.remove(getPersonByName(name));
    }
    
    
    
    
    
    
    
}