import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class p03_StudentsByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       List<String> studnets = new ArrayList<>();

        for (int i = 0;; i++) {
            String[] names = scan.nextLine().split(" ");

            if (names[0].equals("END")){
                break;
            }
            else {
                studnets.add(names[0] + " " + names[1] + " " + names[2]);
            }
        }

        studnets.sort(Comparator.reverseOrder());

        for (String name:studnets) {
            System.out.println(name);
        }
    }
}
