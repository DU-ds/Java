/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class Distribution {
    
    private int zeros;
    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    
    public Distribution()
    {
        this.zeros = 0;
        this.ones = 0;
        this.twos = 0;
        this.threes = 0;
        this.fours = 0;
        this.fives = 0;
    }
    
    public void update(int latest)
    {
        switch(latest)
        {
            case 0: this.zeros++;
            break;
            
            case 1: this.ones++;
            break;
            
            case 2: this.twos++;
            break;
            
            case 3: this.threes++;
            break;
            
            case 4: this.fours++;
            break;
            
            case 5: this.fives++;
            break;
            
            default: break;
        }
    }
    
    public int getDist(int level)
    {
        switch (level)
        {
            case 0: return this.zeros;
            
            case 1: return this.ones;
            
            case 2: return this.twos;
            
            case 3: return this.threes;
            
            case 4: return this.fours;
            
            case 5: return this.fives;
            
            default: break;
        }
        return -1;  //should never be reached if assumptions are met
    }
    
    public double getAcceptancePercentage()
    {
        int accepted = this.fives + this.fours + this.threes + this.twos + this.ones;
        int total = accepted + this.zeros;
        return 100.0 * (double) accepted / (double) total;
    }
    
    public int getZeros()
    {
        return this.zeros;
    }
    
    public int getOnes()
    {
        return this.ones;
    }
    
    public int getTwos()
    {
        return this.twos;
    }
    
    
    
}
