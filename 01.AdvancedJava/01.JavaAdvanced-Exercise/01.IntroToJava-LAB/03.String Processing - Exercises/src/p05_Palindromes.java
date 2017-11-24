import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p05_Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] text = scan.nextLine().split("[^\\w]+");

        String reveresedWord = "";

        ArrayList<String> foundWord = new ArrayList<String>();

        for (int i = 0; i < text.length; i++) {
            reveresedWord = new StringBuilder(text[i]).reverse() + "";

            if (reveresedWord.equals(text[i])){
                foundWord.add(reveresedWord);
            }
        }
        Collections.sort(foundWord);

        System.out.println(foundWord);
    }
}
