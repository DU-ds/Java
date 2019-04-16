/*answer to 
https://www.hackerrank.com/challenges/java-2d-array/problem?h_r=next-challenge&h_v=zen
*/
//change file name to compile!!!


/*
promt:
You are given a 6 * 6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly
lines, each containing integers seperated by spaces. Each integer will be between and

inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19

Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();


        int max = ;
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                if(isValidHourglassIndex(i,j))
                {
                    int[] h = getHourglass(arr, i, j);
                    int sum = sumOfHourglass(h);


                    if(sum > max)
                    {
                        max = sum;
                    }
                }
            }
        }


        System.out.println(max);
    }

    /*
    need to get an hourglass, sum the elements, save the sum. find the max of all sums.
    */

    /*
    @param i - column index
    @param j - row index
    @return - true iff i and j are the lowest integer indexes of a valid three by three array in the six by six array (arr).
    */
    static boolean isValidHourglassIndex(int indexi, int indexj)
    {
        if(indexi < 0 || indexj < 0)
        {
            return false; //no negative indexes
        }

        return indexi < 4 && indexj < 4;//0,1,2,3 are valid indexes
    }


    /* int sumOfHourglass(int[] a)
    @param  - 1d array containing hourglass elements
    @return - sum the hourglass
    */

    static int sumOfHourglass(int[] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++ )
        {
            sum += a[i];
        }
        return sum;
    }


    /* int[] getHourglass(int[][] array, int indexi, int indexj)
    get hourglass starting from indexi and index j where 
    @param indexi,indexj - i and j are the lowest integer indexes of a valid hourglass in the 2d array.
        Note: i indexes columns, j indexes rows.
    @return - returns an int array containing the elements of the hourglass
    */

    static int[] getHourglass(int [][] array, int indexi, int indexj)
    {
        int[] a = new int[7];
        int ai = 0;

       int[][] threebythree = getThreebythree(array, indexi, indexj);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(j == 1) //middle row
                {
                    if(j == i)//for j = 1 should only add i=j (e.g. middle int in middle row)
                    {
                        a[ai] = array[j][i];
                        ai++;
                    }
                    //dont increase ai b/c no element to add
                }

                else
                {
                    a[ai] = array[j][i];
                    ai++;
                }
            }
            
        }
        return a;
    }

    /* int[][] getThreebythree(int[6][6] array, int indexi, int indexj)

        get 3 x 3 array - indexi and indexj are the lowest index elements of array in return

        @param indexi,indexj - row and column index of corner of return

        @return 3 x 3 array from array
    */
    static int[][] getThreebythree(int[][] array, int indexi, int indexj)
    {
        int[][] a = new int[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                a[i][j] = array[indexj + j][indexi + i];
            }
        }

        return a;
    }
}