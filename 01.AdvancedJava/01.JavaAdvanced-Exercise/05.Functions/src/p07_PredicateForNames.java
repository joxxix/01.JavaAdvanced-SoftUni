import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p07_PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenghtOfNames = Integer.parseInt(scan.nextLine());

        String[] names = scan.nextLine().split("\\s+");

        List<String> goodNames = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() <= lenghtOfNames){
                goodNames.add(names[i]);
            }
        }

        for (String goodName : goodNames) {
            System.out.println(goodName);
        }
    }
}
