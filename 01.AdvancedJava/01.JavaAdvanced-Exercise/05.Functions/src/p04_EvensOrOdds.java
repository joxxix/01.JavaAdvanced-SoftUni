import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p04_EvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String evenOrOdd = scan.nextLine();


        if (evenOrOdd.equals("odd")){
            System.out.println(oddNumbers(nums));
        }
        else {
            System.out.println(evenNumbers(nums));
        }

    }
    public static String oddNumbers (int[] nums){
        List<Integer> oddNums = new ArrayList<>();

        for (int i = nums[0]; i < nums[1] + 1; i++) {
            if (i % 2 != 0){
                oddNums.add(i);
            }
        }

        return oddNums.toString().replace("[","").replace(",","").replace("]","");
    }
    public static String evenNumbers(int[] nums){
        List<Integer> evenNums = new ArrayList<>();

        for (int i = nums[0]; i < nums[1] + 1; i++) {
            if (i % 2 == 0){
                evenNums.add(i);
            }
        }

        return evenNums.toString().replace("[","").replace(",","").replace("]","");
    }
}
