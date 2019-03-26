import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers:");
        NumberStatistics stat = new NumberStatistics();
        NumberStatistics statEven = new NumberStatistics();
        NumberStatistics statOdd = new NumberStatistics();
        int number;
        while(true){
            number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            }
            else if (number % 2 == 0){
                statEven.addNumber(number);
            }
            else{
                statOdd.addNumber(number);
            }
            stat.addNumber(number);
            
            

        }
        System.out.println("sum: " + stat.sum());
        System.out.println("sum of even: " + statEven.sum());
        System.out.println("sum of odd: " + statOdd.sum());
        
        
    }
}
