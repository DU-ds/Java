/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator4;
import java.util.Scanner;

/**
 *
 * @author Kenneth Collins
 */
public class MyCalculator4 
{
    int A, B, C;
    int operation;
    
    /**private static int add( int a, int b)
     * 
     * @param a
     * @param b
     * @return sum(a,b)
     */
    private static int add( int a, int b){
        int c = a + b;
        return c;
    }
    /** private static int subtract(int a, int b)
     * 
     * @param a
     * @param b
     * @return (a - b)
     */
    private static int subtract(int a, int b){
        int c = a - b;
        return c;
    }
    /** private static int multiply(int a, int b)
     * 
     * @param a
     * @param b
     * @return a * b
     */
    private static int multiply(int a, int b){
        int c = a * b;
        return c;
    }
    /** private static int divide(int a, int b)
     * 
     * @param a
     * @param b
     * @return (a/b)
     */
    private static int divide(int a, int b){
        int c = a / b;
        return c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        
        int operation;
        System.out.println("1: add, 2: subtract, 3: multiply, 4: divide");
        do 
        {
            operation = userInput.nextInt();
//            System.out.println("Enter the first integer");
//            int A = userInput.nextInt();
//            System.out.println("Enter the second integer");
//            int B = userInput.nextInt();
            
            switch (operation)
            {
            case 1 :
                System.out.print("Enter the first integer to add: ");
                int A1;
                A1 = userInput.nextInt();
                System.out.print("Enter the second integer to add: ");
                int B1;
                B1 = userInput.nextInt();
                int C1;
                C1 = add(A1, B1);
//                System.out.println("");
                System.out.println("The sum is: " + C1);
                break;
            case 2 :
                System.out.print("Enter the first number: ");
                int A2;
                A2 = userInput.nextInt();
                System.out.println("Enter the number to subtract from " + A2);
                int B2;
                B2 = userInput.nextInt();
                int C2;
                C2 = subtract(A2, B2);
                System.out.println("The difference is: " + C2);
                break;
            case 3 : 
                System.out.print("Enter the first number: ");
                int A3;
                A3 = userInput.nextInt();
                System.out.print("Enter the second number: ");
                int B3;
                B3 = userInput.nextInt();
                int C3;
                C3 = multiply(A3, B3);
                System.out.println("The product is: " + C3);
                break;
            case 4 :
                System.out.print("Enter the numerator: ");
                int A4;
                A4 = userInput.nextInt();
                System.out.print("Enter the denominator: ");
                int B4;
                B4 = userInput.nextInt();
                int C4;
                C4 = divide(A4, B4);
                System.out.println(A4 + "/" + B4 + " = " + C4);
                break;
            default :
                System.out.println("Not a valid operation. Try again.");
            }
        }
        while(!(operation == 1 || operation == 2 || operation == 3 || operation == 4 ));
        
        
    }
    
}
