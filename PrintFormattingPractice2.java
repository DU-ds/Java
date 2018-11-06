import java.util.Scanner;
import static java.util.Math;

public class PrintFormattingPractice2 {


//decalre instance vars
// first 3 digits
// two middle digits
// last 4 digits
// all put together
    
    
    
   

   public static void main(String[] args) {

      Scanner uInput =  new Scanner(System.in);
      System.out.println("What's your first name?");
      String static firstName = uInput.next();
      System.out.println("What's your last name?");
      String static lastName = uInput.next();
      System.out.println("What are the first 3 digits of your Social Security Number?");
      Integer static SSNumber1 = uInput.nextInt();
      System.out.println("What are the middle 2 digits of your Social Security Number?");
      Integer static SSNumber2 = uInput.nextInt();
      System.out.println("What are the last 4 digits of your Social Security Number?");
      Integer static SSNumber3 = uInput.nextInt();

      static Integer num3 = 1;                        // doesn't need to be changed
      static Integer num2 = Math.pow(10 , 4);         //4 is the number of digits in SSNumber3 three      
      static Integer num1 =  num2 * Math.pow(10 , 2); //2 is the number of digits in SSNumber 2
      SSNumber = (SSNumber3 * num3 ) + (SSNumber2 * num2) + (SSNumber1 * num1);
      System.out.format("Welcome, %s %s. Your Social Security number is %d%n.");

   }
}