import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        // write the guessing logic here
        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I promise you that I can guess the number you are thinking of with " + howManyTimesHalvable(upperLimit - lowerLimit) + " questions.");
        System.lineSeparator();
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.lineSeparator();
        boolean greaterThan;
        int mean;
        
        while(true)
        {
            if(lowerLimit == upperLimit)
            {
                System.out.println("The number you're thinking of is " + upperLimit + ".");
                break;
            }
            mean = average(lowerLimit, upperLimit);
            greaterThan = isGreaterThan(mean);
            
            if(greaterThan)
            {
                lowerLimit = mean + 1;
            }
            else
            {
                upperLimit = mean;// -1;
            }
        }

    }

    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value)
    {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String input = reader.nextLine();
        if(input.equals("y"))
        {
            return true;
        }
        return false;
    }
    
    public int average(int firstNumber, int secondNumber)
    {
        return (firstNumber + secondNumber)/2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
}
