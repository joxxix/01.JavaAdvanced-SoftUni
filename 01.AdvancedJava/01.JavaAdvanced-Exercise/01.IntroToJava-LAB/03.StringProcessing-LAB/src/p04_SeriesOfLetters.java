import java.util.Scanner;

public class p04_SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String lastLetter = String.valueOf(input.charAt(0));

        String sb = lastLetter;

        for (int i = 1; i < input.length(); i++) {
            String currentLetter = String.valueOf(input.charAt(i));
            if (!currentLetter.equals(lastLetter)){
                sb+=currentLetter;
            }
            lastLetter = currentLetter;
        }

        System.out.println(sb);
    }
}
