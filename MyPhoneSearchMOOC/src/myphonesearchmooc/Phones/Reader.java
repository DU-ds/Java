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
public class Reader 
{
    Scanner scan;
    
    
    public Reader(Scanner scan)
    {
        this.scan = scan;
    }
     
    
    public String getUserInput()
    {
        String input;
        input = scan.nextLine();
        return input;
    }
    
    public int getIntFromUserInput(String userInput)
    {
        int intInput;
        try
        {
            intInput = Integer.parseInt(userInput);
        }
        catch(Exception e)
        {
            System.out.println("You haven't written a proper number.");
            intInput = 0;
        }
        return intInput;
    }
}
