import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class p05_MinEvenNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Optional<Double> min = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(n -> !n.isEmpty())
                .map(Double::valueOf)
                .filter(n-> n % 2 == 0)
                .min(Double::compare);

        if (min.isPresent()){
            System.out.printf("%.2f", min.get());
        }
        else {
            System.out.println("No match");
        }


    }
}
