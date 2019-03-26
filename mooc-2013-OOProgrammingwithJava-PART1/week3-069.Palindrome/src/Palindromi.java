import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        return text.equals(reverse(text));
    }
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
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
