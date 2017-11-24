import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p01_ReverseArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        Collections.reverse(Arrays.asList(array));


        for (String num: array) {
            System.out.print(num + " ");
        }

    }
}
