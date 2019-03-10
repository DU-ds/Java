/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonesearchmooc.Phones;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author DU-ds
 */
public class Person 
{
    private String name;
    //String number;
    private List<String> number;
    private String city;
    private String street;
    
    
    public Person(String name, String number)
    {
        this.name = name;
        this.number = new ArrayList<String>();
        this.number.add(number);
    }
    
    
    public String getName()
    {
        return this.name;
    }
    
    public List<String> getNumber()
    {
        return this.number;
    }
    
    public void addAddress(String street, String city)
    {
        this.street = street;
        this.city = city;
    }
    
    public String getStreet() throws Exception
    {
        if(this.street != null)
        {
            return this.street;
        }
        throw new Exception();
    }
    
    public String getCity() throws Exception
    {
        if(this.city != null)
        {
            return this.city;
        }
        throw new Exception();
    }
    
    public void addNumber(String number)  //assume it's only called on an instance of person w/a number already
    {
        
        this.number.add(number);
        
    }
    
}