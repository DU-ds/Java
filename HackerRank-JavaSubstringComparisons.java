import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n = s.length();
        
        String[] subs = substringsK(s, k);
        // for(int i =0; i < subs.length; i++){
            // System.out.println(subs[i]);
        // }
        java.util.Arrays.sort(subs); //not allowed to import anything but scanner
        
        smallest =  subs[0];
        largest  = subs[subs.length -1];
        
        return smallest + "\n" + largest;
    }

    public static String[] substringsK(String s, int k){
        int n = s.length();
        String[] arr = new String[n - k + 1];
        
        for(int i = 0; i < n - k; i++){
            arr[i] = s.substring(i, i 
            + k);
            // System.out.println(arr[i]);
        }
        arr[n-k] = s.substring(n-k);

        return arr;
    }

