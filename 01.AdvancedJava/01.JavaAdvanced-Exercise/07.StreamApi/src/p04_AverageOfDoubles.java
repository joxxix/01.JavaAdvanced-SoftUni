import java.util.*;

public class p04_AverageOfDoubles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nums = scan.nextLine().split("\\s+");

        OptionalDouble avarage = Arrays.stream(nums)
                .filter(x -> !x.isEmpty())
                .mapToDouble(Double::valueOf)
                .average();

        if (avarage.isPresent()){
            System.out.printf("%.2f", avarage.getAsDouble());
        }
        else {
            System.out.println("No Match");
        }
    }
}
