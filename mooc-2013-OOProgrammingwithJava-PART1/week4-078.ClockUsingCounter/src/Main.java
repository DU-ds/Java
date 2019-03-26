
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        BoundedCounter counter = new BoundedCounter(4);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 10) 
        {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("seconds: ");
        int s = Integer.parseInt(scan.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(scan.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(scan.nextLine());
        
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        
        i = 0;
        while ( i < 121 ) 
        {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if (seconds.getValue() == 0)
            {
                minutes.next();
            
                if(minutes.getValue() == 0)
                {
                    hours.next();
                }
            }
            i++;
        }
        
        
        
        
    }
}
