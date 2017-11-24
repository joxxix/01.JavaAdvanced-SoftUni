import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05_VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(input);

        int count = 0;

        while (matcher.find()){
            count++;
        }

        System.out.println("Vowels: " + count);
    }
}
