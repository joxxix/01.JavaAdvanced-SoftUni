import java.util.Scanner;
import java.util.TreeSet;

public class p01_StudentsGroup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> namesFrom2 = new TreeSet<>();

        for (int i = 0; ; i++) {
            String[] names = scan.nextLine().split(" ");

            if (names[0].equals("END")){
                break;
            }

            if (names[2].equals("2")){
                namesFrom2.add(names[0]+" "+ names[1]);
            }
        }
        for (String s : namesFrom2) {
            System.out.println(s);
        }
    }
}
