/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class Person {
    
    private String name;
    private String number;
    
    public Person(String name, String phoneNumber)
    {
        this.name = name;
        this.number = phoneNumber;
    }
    
    @Override
    public String toString()
    {
        return this.name + "  number: " + this.number;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getNumber()
    {
        return this.number;
    }
    
    public void changeNumber(String newNumber)
    {
        this.number = newNumber;
    }
}
