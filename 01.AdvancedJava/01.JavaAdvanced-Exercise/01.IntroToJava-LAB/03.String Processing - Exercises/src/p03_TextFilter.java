import java.util.Scanner;

public class p03_TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String input = scan.nextLine();

        for (int i = 0; i < bannedWords.length ; i++) {
            String current = bannedWords[i];

            while (input.contains(current)) {
                input = input.replace(current , draw(current.length()));
            }
        }

        System.out.println(input);
    }
    public static StringBuilder draw(int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("*");
        }
        return sb;
    }
}

