/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class Player 
{
    private String name;
    private int goals;
    
    public Player(String name)
    {
        this.goals = 0;
        this.name = name;
    }
    
    public Player(String name, int goals)
    {
        this.goals = goals;
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int goals()
    {
        return this.goals;
    }
    
    public String toString()
    {
        return "Player: " + this.getName() + ", goals " + this.goals();
    }
    
    
}
