
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
                ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        while(!word.equals("")){
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
        }
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for (String w : words) {
            System.out.println(w);
        }
        
    }
}
