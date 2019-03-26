import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a;
        System.out.print("Type the first number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.println("");
        int b;
        System.out.print("Type the second number: ");
        b = Integer.parseInt(reader.nextLine());
        if (a == b)
        {
            System.out.println("The numbers are equal!");
        }
        else
        {
            int bigger = java.lang.Math.max(a, b);
            System.out.println("Greater number: " + bigger);
        }
    }
}
