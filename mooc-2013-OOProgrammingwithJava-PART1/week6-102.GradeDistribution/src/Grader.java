/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class Grader {
    
    
    public static int grader(int score)
    {
        if (score < 0)
        {
        }
        else if(score < 30)
        {
            return 0;
        }
        else if(score < 35)
        {
            return 1;
        }
        else if (score < 40)
        {
            return 2;
        }
        else if (score < 45)
        {
            return 3;
        }
        else if(score < 50)
        {
            return 4;
        }
        else if (score <= 60)
        {
            return 5;
        }
        return -100; //need to return an unused value
    }
    
    
}
