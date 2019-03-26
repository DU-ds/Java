/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class StringUtils {

    
    
    public static boolean included(String word, String searched)
    {
        if (word == null || searched == null)
        {
            return false;
        }
        String tempWord = word.trim();
        tempWord = tempWord.toUpperCase();
        String tempSearched = searched.trim();
        tempSearched = tempSearched.toUpperCase();
       
        return tempWord.contains(tempSearched);
    }

}
