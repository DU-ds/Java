/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonesearchmooc.Phones;

/**
 *
 * @author DU-ds
 */
public class Person 
{
    String name;
    String number;
    String city;
    String street;
    
    
    public Person(String name, String number)
    {
        this.name = name;
        this.number = number;
    }
    
    
    public String getName()
    {
        return this.name;
    }
    
    public String getNumber()
    {
        return this.number;
    }
    
    public void addAddress(String street, String city)
    {
        this.street = street;
        this.city = city;
    }
    
    public String getStreet()
    {
        return this.street;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    
    
}