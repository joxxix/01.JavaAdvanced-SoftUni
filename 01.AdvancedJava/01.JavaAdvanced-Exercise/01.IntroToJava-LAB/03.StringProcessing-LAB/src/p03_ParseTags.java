import java.util.Scanner;

public class p03_ParseTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String upcaseStart = "<upcase>";
        String upcaseStop = "</upcase>";

        while (input.contains(upcaseStart)) {
            int startIndex = input.indexOf(upcaseStart);
            int endIndex = input.indexOf(upcaseStop);

            String reminder = input.substring(startIndex + 8, endIndex);
            String upReminder = reminder.toUpperCase();

            input = input.replaceFirst(reminder, upReminder);
            input = input.replaceFirst(upcaseStart, "");
            input = input.replaceFirst(upcaseStop, "");
        }
        System.out.println(input);
    }
}
