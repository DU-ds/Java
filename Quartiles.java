import java.io.*;
import java.util.*;
//from:
//https://www.hackerrank.com/challenges/s10-quartiles/problem
public class Quartiles {
    //testcase2 : input: 10 3 7 8 5 12 14 21 15 18 14 output: 7 13 15
// 3 5 7 8 10 
//12
// 14 14 15 18 21
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();
        
        int[] L;
        int[] U;
        if(n % 2 == 0) //does this work for even and odd b/c of int rounding?
        {
            L = new int[n/2];
            L = Arrays.copyOfRange(a, 0, n/2);
            U = new int[n/2];
            U = Arrays.copyOfRange(a, n/2, n);
        }
        else
        {
            L = new int[(n-1)/2];
            L = Arrays.copyOfRange(a, 0, (n-1)/2);
            U = new int[(n-1)/2];
            U = Arrays.copyOfRange(a, (n+1)/2, n);
        }

        int q2 = (int) median(a);
        int q1 = (int) median(L);
        int q3 = (int) median(U);
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }


    static double median(int[] arr)
    {
        Arrays.sort(arr);
        int n = arr.length;
        if(n % 2 == 0)
        {
            return ((double)arr[(n/2)] + (double) arr[(n/2 -1)])/2.0;
        }
        else
        {
            return (double) arr[(n/2)];
        }
    }
}

