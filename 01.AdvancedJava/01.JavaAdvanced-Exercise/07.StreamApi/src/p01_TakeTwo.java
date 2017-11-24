import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p01_TakeTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> tokens = Arrays.asList(scan.nextLine().split("\\s+"));

        List<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            numbers.add(Integer.valueOf(token));
        }

        numbers.stream().filter(n -> 10 <= n && n <= 20)
                .distinct()
                .limit(2)
                .forEach(n -> System.out.print(n + " "));
    }
}
