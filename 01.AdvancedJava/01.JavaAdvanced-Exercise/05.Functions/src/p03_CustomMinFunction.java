import java.util.Arrays;
import java.util.Scanner;

public class p03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        System.out.println(minNum(nums));

    }
    public static int minNum(int[] num){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < num.length ; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}
