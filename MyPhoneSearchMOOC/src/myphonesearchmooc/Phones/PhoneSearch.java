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
    private Scanner scan;
    private List<Person> catalog;
    private Reader read;
    //String notFoundMsg = "  not found";
    
    public PhoneSearch(Scanner scan)
    {
        this.scan = scan;
        this.catalog = new ArrayList<Person>();
        read = new Reader(scan);
    }
    
    
    public void addANumber(String name, String number)
    {
        boolean containsPerson = false;
        for(Person p : this.catalog)
        {
            if(p.getName().equals(name))
            {
                p.addNumber(number);
                containsPerson = true;
            }
        }
        
        if(containsPerson)
        {//already done
        }
        else
        {
            Person person = new Person(name, number);
            this.catalog.add(person);
        }
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
            if(p.getNumber().contains(number))
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