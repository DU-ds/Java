/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator3;
import java.util.Scanner;
/**
 *
 * @author Kenneth Collins
 */
public class MyCalculator3 
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
            System.out.println("Enter the first integer");
            int A = userInput.nextInt();
            System.out.println("Enter the second integer");
            int B = userInput.nextInt();
            
            switch (operation)
            {
                case 1 :
                int C = add(A, B);
                System.out.println("The sum is: " + C);
                break;
            case 2 :
                C = subtract(A, B);
                System.out.println("The difference is: " + C);
                break;
            case 3 : 
                C = multiply(A, B);
                System.out.println("The product is: " + C);
                break;
            case 4 :
                C = divide(A, B);
                System.out.println(A + "/" + B + " = " + C);
                break;
            default :
                System.out.println("Not a valid operation. Try again.");
            }
        }
        while(!(operation == 1 || operation == 2 || operation == 3 || operation == 4 ));
        
        
    }
    
}
