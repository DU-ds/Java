/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;
    
    public Phonebook()
    {
        phonebook = new ArrayList<Person>();
    }
    
    public void add(String name, String number)
    {
        phonebook.add(new Person(name, number) );
    }
    
    public void printAll()
    {
        for(Person p : phonebook)
        {
            System.out.println(p.toString());
        }
    }
    
    public String searchNumber(String name)
    {
        for (Person p : phonebook)
        {
            if (p.getName().equals(name))
            {
                return p.getNumber();
            }
        }
        return "number not known";
    }
    
}
