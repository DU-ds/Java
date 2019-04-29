/// https://www.hackerrank.com/challenges/java-1d-array/problem
import java.util.*;

public class Solution {


/**
 * public static boolean canWin(int leap, int[] game)
 * 
 * takes game, checks if it is possible to naviagate 
 * beyond the end of the array folllowing the rules of the game
 * 
 * @param game --  game[0] == 0
 * @param leap --  0 <= leap <= 100
 * @param leap -- 2 <= leap.length() <= 100  
 * 
 * @return -- returns true iff the game can be won for a given leap
 * rules of the game:
 * !. Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
 * 2. Move Forward: 
 *     if cell i + 1 contains  a zero, you can walk to cell i + 1
 *     
 *     If cell i + leap contains a zero, you can jump to cell i + leap.
 *     
 *     If you're standing in cell n - 1 or the value of i + leap >= leap.length() 
 */



    public static boolean canWin(int leap, int[] game) {
        int max = getMax(game);
        if(max > leap){
            return true;
        }
        return false;
    }

    private static int getMax(int[] game){
        int max = 0; //max number of consecutive nonzero elements
        int latestIndex = 0;//last index of a nonzero element
        List<Integer> maxes = new ArrayList<Integer>();

        for(int i = 0; i < game.length; i++){
            if(game[i] != 0 ){

                if(i-1 == latestIndex){
                    max++;
                }

                
                latestIndex = i;
            }

            else {
                maxes.add(max);
                max = 0;
            }
        }
            
        max = 0;
        for(Integer i : maxes){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
