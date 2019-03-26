
import java.util.Scanner;

public class Password {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        while (true) 
        {            
            
        
            System.out.print("Type the password: ");
            String password = "carrot"; // Use carrot as password when running tests.
            String pw = reader.nextLine();
            if(pw.equals(password)) 
            {
                System.out.println("Right!");
                System.out.println("SEcReT mEssAge");
                break;
            }
            else 
            {
                System.out.println("Wrong!");
            }
        }
    }
}
