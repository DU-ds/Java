import java.util.Scanner;
import java.util.Math;

public class PrintFormattingPractice3 {

   //decalre instance vars
   String  firstName;
   String  lastName;
   Integer  SSNumber1;      // first 3 digits
   Integer  SSNumber2;      // two middle digits
   Integer  SSNumber3;      // last 4 digits
   Integer  SSNumber;       // all put together
   Integer  num3 ; 
   Integer  num2 ; 
   Integer  num1 ; 
   

   public void main(String[] args) {

      Scanner uInput =  new Scanner(System.in);
      System.out.println("What's your first name?");
      firstName = uInput.next();
      System.out.println("What's your last name?");
      lastName = uInput.next();
      System.out.println("What are the first 3 digits of your Social Security Number?");
      SSNumber1 = uInput.nextInt();
      System.out.println("What are the middle 2 digits of your Social Security Number?");
      SSNumber2 = uInput.nextInt();
      System.out.println("What are the last 4 digits of your Social Security Number?");
      SSNumber3 = uInput.nextInt();

      num3 = 1;                         // doesn't need to be changed
      num2 = (int) Math.pow(10 , 4);   //4 is the number of digits in SSNumber3 three      
      num1 =  (int) Math.pow(10 , 2); //2 is the number of digits in SSNumber2
      num1 *= num2                   //because num1 needs to beshifted over two digits from num2
      SSNumber = (SSNumber3 * num3 ) + (SSNumber2 * num2) + (SSNumber1 * num1);
      System.out.format("Welcome, %s %s. Your Social Security number is %d%n.");


   }
}