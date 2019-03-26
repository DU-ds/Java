import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random rand = new Random();
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        int num;
        while (i < 7)
        {
            num = rand.nextInt(39) +1 ;
            if (this.containsNumber(num)){
                
            }
            else {
                this.numbers.add(num);
                i++;
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)){
        return true;
        }
        else {
            return false;
        }
    }
    
}
