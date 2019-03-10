/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonesearchmooc.Phones;
import java.util.Scanner;

/**
 *
 * @author DU-ds
 */
public class UI 
{
    private String input;
    private int intInput;
    private Scanner scan;
    private Reader read;
    private PhoneSearch catalog;
    private String introMsg = "phone search\n" +
"available operations:\n" +
" 1 add a number\n" +
" 2 search for a number\n" +
" 3 search for a person by phone number\n" +
" 4 add an address\n" +
" 5 search for personal information\n" +
" 6 delete personal information\n" +
" 7 filtered listing\n" +
" x quit";
    
    public UI(Scanner scan)
    {
        this.scan = scan;
        this.read = new Reader(this.scan);
        catalog = new PhoneSearch(this.scan);
    }
    
    

        public void start()
    {
        
        System.out.println(introMsg);
        
        
        while(true)
        {
            
            System.out.println();
            System.out.print("command: ");
            input = read.getUserInput();
            
            
            if(input.equals("x")) //exit command
            {
                break;
            }
            
            
            intInput = read.getIntFromUserInput(input);
            
            
            switch(intInput)
            {
            
                case 0: break;
                
                
                case 1:
                    System.out.print("whose number: ");
                    String nameInput1 = read.getUserInput();
                    System.out.print("number: ");
                    String numberInput1 = read.getUserInput();
                    catalog.addANumber(nameInput1, numberInput1);
//calls PhoneSearch method to add a Person
                    break;
                
                    
                case 2: 
                    System.out.print("whose number: ");
                    String nameInput2 = read.getUserInput();
                    try
                    {
                        Person person2 = catalog.getPersonByName(nameInput2);
                        String string2 = read.getFormattedStringFromStringList(person2.getNumber(), " ");
                        System.out.println(  string2);
                    }
                    catch(Exception e)
                    {
                        System.out.println("  not found");
                    }
                    
                    break;
                    
                    
                case 3: 
                    System.out.print("whose number: ");
                    String numberInput3 = read.getUserInput();
                    try
                    {
                        Person person3 = catalog.getPersonByNumber(numberInput3);
                        System.out.println(" " + person3.getName());
                    }
                    catch(Exception e)
                    {
                        System.out.println(" not found");
                    }
                    break;
                    
                    
                case 4:
                    System.out.print("whose address: ");
                    String nameInput4 = read.getUserInput();
                    System.out.print("street: ");
                    String street4 = read.getUserInput();
                    System.out.print("city: ");
                    String city4 = read.getUserInput();
                    try
                    {
                        catalog.getPersonByName(nameInput4).addAddress(street4, city4);
                    }
                    catch(Exception e)
                    {
                        //does nothing if Person does not exist
                    }
                    break;
                    
                case 5:
                    System.out.print("whose information: ");
                    String nameInput5 = read.getUserInput();
                    
                    try // adress
                    {
                        Person person5 = catalog.getPersonByName(nameInput5);
                        
                        try
                        {
                            System.out.println("  address: " + person5.getStreet() + " " + person5.getCity());
                        }
                        catch(Exception e)
                        {
                            System.out.println("  address unknown");
                        }
                    }
                    
                    catch(Exception e)
                    {
                        System.out.println("  not found");
                        break;
                    }// end address
                    
                    try
                    {
                        Person person5 = catalog.getPersonByName(nameInput5);
                        String numbers5 = read.getFormattedStringFromStringList(person5.getNumber(), "   ");
                        System.out.println("  phone numbers:");
                        System.out.println( numbers5);
                    }
                    catch(Exception e)
                    {
                        System.out.println("  phone number not found");
                    }
                    break;
                    
                    
                case 6:
                    System.out.print("whose  information: ");
                    try
                    {
                        String nameInput6 = read.getUserInput();
                        catalog.removePerson(nameInput6);
                    }
                    catch(Exception e)
                    {
                        System.out.println("  not found");
                    }

            }
        }
    }
}
        
//Do try catch blocks at the top to catch exceptions which will be thrown by the other classes methods

 