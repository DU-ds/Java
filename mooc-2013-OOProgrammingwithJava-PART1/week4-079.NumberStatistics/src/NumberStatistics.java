
public class NumberStatistics 
{
    private int amountOfNumbers;
    private int sum = 0;

    
    public NumberStatistics()
    {
        amountOfNumbers = 0;
    }
    public void addNumber(int number)
    {
        amountOfNumbers++;
        sum += number;
    }
    public int amountOfNumbers()
    {
        return amountOfNumbers;
    }
    public int sum()
    {
        return this.sum;
    }
    public double average()
    {
        if (amountOfNumbers != 0)
        {
            return ((double) this.sum / (double) this.amountOfNumbers);
            
        }
        else 
        {
            return 0;
        }
    }
    
    
    
    
}
