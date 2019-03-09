/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonesearchmooc;
import java.util.Scanner;
import myphonesearchmooc.Phones.UI;
//import myphonesearchmooc.MyPhoneSearchMOOC;

/**
 *
 * @author DU-ds
 */
public class MyPhoneSearchMOOC 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        UI ui = new UI(scan);
        
        ui.start();
    }
    
}


/***
 * based on Exercise 26: Phone Search from:
 * https://materiaalit.github.io/2013-oo-programming/part2/week-9/
*/