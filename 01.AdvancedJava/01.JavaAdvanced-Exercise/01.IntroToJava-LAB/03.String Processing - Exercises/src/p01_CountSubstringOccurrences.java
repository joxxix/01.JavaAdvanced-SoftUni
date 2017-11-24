import java.util.Scanner;

public class p01_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();

        String word = scan.nextLine().toLowerCase();

        int doneWords = 0;

        for (int i = 0; i < text.length() - word.length(); i++) {
            String currentWord = text.charAt(i) + "";

            for (int j = 1; j < word.length(); j++) {
                currentWord += text.charAt(i + j);
            }
            if (currentWord.equals(word)){
                doneWords++;
            }
        }

        System.out.println(doneWords);

    }
}
