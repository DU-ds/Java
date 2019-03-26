/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author DU-ds
 */
public class Team {
    private String teamName;
    private ArrayList<Player> team = new ArrayList<Player>();
    private int maxSize;
    
    public Team(String team1)
    {
        this.teamName = team1;
        this.maxSize = 16;
    }
    
    public String getName()
    {
        return this.teamName;
    }
    
    @Override
    public String toString()
    {
        return "Team: " + this.getName();
    }
    
    public void addPlayer(Player player)
    {
        if(team.size() < this.maxSize )
        {
            this.team.add(player);
        }
    }
    
    public void printPlayers()
    {
        for (Player player : this.team)
        {
            System.out.println(player.getName() + ", goals "+ player.goals());
        }
    }
    
    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }
    
    public int size()
    {
        return team.size();
    }
    
    public int goals()
    {
        int sum = 0;
        for (Player player : team) 
        {
            sum += player.goals();
        }
        return sum;
    }
    
}
