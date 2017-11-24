import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p02_UpperString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.asList(scan.nextLine().split("\\s+"));

        input.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + " "));
    }
}
