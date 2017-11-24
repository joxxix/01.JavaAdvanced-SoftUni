import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p02_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayList<String> names = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();

            names.add(name);
        }

        Collections.sort(names);

        for(String name: names)
        {
            System.out.println(name);
        }
    }
}
