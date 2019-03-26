
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 1;
        System.out.println("Up to what number? ");
        int upToWhat = Integer.parseInt( reader.nextLine());
        while(i <= upToWhat){
            System.out.println(i);
            i++;
        }
    }
}
