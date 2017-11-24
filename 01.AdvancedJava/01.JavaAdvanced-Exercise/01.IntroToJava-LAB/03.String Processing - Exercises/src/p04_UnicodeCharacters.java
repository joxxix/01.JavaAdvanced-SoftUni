import java.util.Scanner;

public class p04_UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        char[] mixed =  input.toCharArray();

        for (int i = 0; i < mixed.length; i++) {
            System.out.print( "\\u" + Integer.toHexString(mixed[i] | 0x10000).substring(1) );
        }
    }
}
