/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */

import java.util.Random;
public class NightSky 
{
    private double density;
    private int width;
    private int height;
    private int starsinLastPrint;
    
    public NightSky(double density)
    {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height)
    {
        this.density = 0.1;
        this.height = height;
        this.width = width;
    }
    
    public NightSky(double density, int width, int height)
    {
        this.density = density;
        this.height = height;
        this.width = width;
    }
    
    public void printLine()
    {
        Random rand = new Random();
        for(int i = 0; i < width; i++)
        {
            if (rand.nextDouble() < this.density)
            {
                System.out.print("*");
                this.starsinLastPrint++;
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();   //end of line
    }
    
    public void print()
    {
        this.starsinLastPrint = 0;
        for (int i = 0; i < height; i++)
        {
            this.printLine();
        }
    }
    
    public int starsInLastPrint()
    {
        return this.starsinLastPrint;
    }
    
    
}
