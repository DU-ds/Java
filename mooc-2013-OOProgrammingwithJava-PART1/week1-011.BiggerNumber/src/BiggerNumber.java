
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int input1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int input2 = Integer.parseInt(reader.nextLine());
        int biggerInt = java.lang.Math.max(input1, input2);
        System.out.println("The bigger number of the two numbers given was: " +  biggerInt);
    }
}
