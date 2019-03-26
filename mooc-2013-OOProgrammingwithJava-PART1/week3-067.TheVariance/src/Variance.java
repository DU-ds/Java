import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (Integer i : list) {
            total += i;
        }
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum =  sum(list);
        double mean = (double) sum / (double) list.size();
        return mean;
    }

    public static double variance(ArrayList<Integer> list) 
    {
        double mean = average(list);
        double SSD = 0;
        for (Integer i : list) 
        {
            SSD += ((double) i - mean)*((double)i - mean);
        }
        double var = SSD / (double) (list.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
