
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length() -1;
        String tmp = "";
        while (i >= 0) {            
            tmp += (text.charAt(i));
            i--;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
