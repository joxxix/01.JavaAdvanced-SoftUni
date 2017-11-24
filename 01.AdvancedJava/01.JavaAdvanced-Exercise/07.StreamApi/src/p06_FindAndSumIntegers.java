import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class p06_FindAndSumIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Optional<Integer> sumOfIntsGT20 = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(x -> isNumber(x))
                .map(Integer::valueOf)
                .reduce((x1, x2) -> x1 + x2);

        if (sumOfIntsGT20.isPresent()){
            System.out.println(sumOfIntsGT20.get());
        }
        else {
            System.out.println("No match");
        }

    }
    private static boolean isNumber(String str){
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
