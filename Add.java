import java.util.Scanner;


public class Add {
  public static int a; // instance variable
  public static int b;
  public static int c;
	/**
	*  creating a simple program to add two ints
	**/
  public static void main(String [] args){
    System.out.println("Enter an Integer");
    Scanner uInput = new Scanner(System.in); //user input object
    a = uInput.nextInt(); // stores first int in a
    System.out.println("Enter another Integer");
    b = uInput.nextInt();
    c = a + b;
    //System.out.print("The sum is: ");
    //System.out.println(c);
    System.out.println("The sum is: " + c);



  }
}