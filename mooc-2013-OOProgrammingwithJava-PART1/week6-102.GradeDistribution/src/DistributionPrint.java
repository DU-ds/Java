/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class DistributionPrint {
    
    
    public static void distributionPrint (Distribution dist)
    {
        System.out.println("Grade distribution:");
        int i = 5;
        while (i >= 0)
        {
            System.out.println(i + ": " + distOfStars(i, dist));
            i--;
        }
        System.out.println("Acceptance percentage: " + dist.getAcceptancePercentage());
    }
    
    public static String distOfStars(int level, Distribution dist)
    {
        return starsString(dist.getDist(level));
    }
    
    public static String starsString(int amount) 
    {
        int i = 0;
        String s = "";
        while (i < amount) 
        {            
            s += "*";  
            i++;
        }
        return s;
    }
    
}
