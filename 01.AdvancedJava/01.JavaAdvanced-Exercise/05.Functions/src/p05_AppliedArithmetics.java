import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p05_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true){
            String command = scan.nextLine();
            if (command.equals("end")){
                break;
            }
            else if (command.equals("add")){
                addOneToNums(nums);
            }
            else if (command.equals("multiply")){
                multiplyTwoToNums(nums);
            }
            else if (command.equals("subtract")){
                subtractOneFromNums(nums);
            }
            else if (command.equals("print")){
                for (int num:nums) {
                    System.out.print(num + " ");
                }
            }

        }
    }
    public static int[] addOneToNums(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] += 1;
        }
        return nums;
    }
    public static int[] multiplyTwoToNums(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
        return nums;

    }
    public static int[] subtractOneFromNums(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= 1;
        }
        return nums;
    }
}
