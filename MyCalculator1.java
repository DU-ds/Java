/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator1;
import java.util.Scanner;
/**
 *
 * @author Kenneth Collins
 */
public class MyCalculator1 {
// fields
    int A, B, C;
    
    
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
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int A = userInput.nextInt();
        int B = userInput.nextInt();
        // int operation;
        // System.out.println("1: add, 2: subtract, 3: multiply, 4: divide")
        // operation = userInput.nextInt();
        // switchcase (operation)
        // case 1
        int C = add(A, B);
        System.out.println("The sum is: " + C);
        //case 2
        C = subtract(A, B);
        System.out.println("The difference is: " + C);
        //case 3
        C = multiply(A, B);
        System.out.println("The product is: " + C);
        //case 4
        C = divide(A, B);
        System.out.println(A + "/" + B + " = " + C);
        
    }
    
}
