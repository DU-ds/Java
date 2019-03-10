/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonesearchmooc.Phones;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author DU-ds
 */
public class Reader 
{
    private Scanner scan;
    
    
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
    
    public String getFormattedStringFromStringList(List<String> list, String spaces)
    {
        StringBuilder buff = new StringBuilder(list.size() * 15);
//initial capacity of 14 chars per string plus a new line char.
        for(String str : list)
        {
            //String threespaces = "   "; //needed to conform to 3 spaces in example output
            buff.append(spaces);
            buff.append(str);
            buff.append(System.lineSeparator()); //new line for each string
        }
        return buff.toString();
    }
}

