
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 2000; //not in range of drawNumber()
        int numOfGuesses = 0;
        while (guess != numberDrawn)
        {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            numOfGuesses++;
            if (guess == numberDrawn)
            {
                System.out.println("Congratulations, your guess is correct!");
            }
            else if (guess > numberDrawn)
            {
                System.out.println("The number is lesser, guesses made: " + numOfGuesses);
            }
            else 
            {
                System.out.println("The number is greater, guesses made: " + numOfGuesses);
            }
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
