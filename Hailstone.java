import java.util.Scanner;
import java.util.ArrayList;

public class Hailstone {
  public ArrayList<Integer> list1;
  public Integer n1;
  public Integer n2;

    /**
     * computing a hailstone sequence. 
     * assumption / requirement n > 0, hailstone sequence starts with n, ends with 1
    **/
  public static void main (String[] args) {
   
    Scanner uInput = new Scanner(System.in); // Setting up for user input
    System.out.println("Enter a positive integer specifying the n");  // prints, new line at end
    Integer n1 = uInput.nextInt(); // stores the user inputted int in n
    ArrayList<Integer> list1  = new ArrayList <Integer> ();
    //Integer n = 7 // Note to future self; question asks where this (n = 7) sequence ends (MIT OCW 6.005 S'16)
    /**
     * Maybe put the "ArrayList...", the while loop creating the list with the hailstone
     * ints, and the print statement in the for loop into one... method? statement? 
     * kinda like 
     * public Hailstone{
     *   arguments  
     * }
    */ 

    while (n1 != 1){     //https://ocw.mit.edu/ans7870/6/6.005/s16/classes/01-static-checking/
      list1.add (n1);
      if (n1 % 2 == 0) {
        n1 /= 2;
      }
      else {
            n1 = 3 * n1 + 1;
      }
    }


    list1.add(n1); // adds the last number to the list; otherwise the list would leave out the one after the loop ends!    
    int n2 = list1.size(); // so size isn't supposed to wrap the paranthesis around the object lol. Like python methods! 
    for ( int i : list1  ){
      System.out.println(i); // took me a while to realize I'm not iterating over the index, I'm iterating over the elements XD
    } //needs to be recomplied for this print statemnt. Might still need debugging. IDK lol


  } 
}