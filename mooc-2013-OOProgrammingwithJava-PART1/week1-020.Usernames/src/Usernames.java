
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String user = reader.nextLine();
        System.out.print("Type your password: ");
        String pw = reader.nextLine();
        if (user.equals("alex") && pw.equals("mightyducks"))
        {
            System.out.println("You are now logged into the system!");
        }
        else if (user.equals("emily") && pw.equals("cat") )
        {
            System.out.println("You are now logged into the system!");
        }
        else 
        {
            System.out.println("Your username or password was invalid!");
        }
    }
}
