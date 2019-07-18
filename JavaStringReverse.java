import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean b = isPalindrome(A);
        if(b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }


    /***
     * @input String s
     *
     * @return -- true iff s is a palindrome 
     */
    public static boolean isPalindrome(String s){
        if(s == null || s.isEmpty())
        {
            return false; //assumes an empty string is not a palindrome 
        }
        int n = s.length();
        if(n == 1) {
            return true; //base case 1
        }
        else if(n == 2){ //only a palindrome if 
            return s.charAt(0) == s.charAt(1); //base case 2
        }

        else { // reduce towards base case

            //check for equality of two outer chars of string
            if(s.charAt(0) == s.charAt(n-1)){
                String s2 = s.substring(1, n - 1); // string with 2 less elements
            return JavaStringReverse.isPalindrome(s2);
            }
            else return false;


            
        }
    }
}
// https://www.hackerrank.com/challenges/java-string-reverse/problem
