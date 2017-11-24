import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class p02_MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Deque<Integer> nums = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split(" ");

            if (commands[0].equals("1")){
                int num = Integer.parseInt(commands[1]);
                nums.push(num);
            }
            else if (commands[0].equals("2")){
                nums.pop();
            }
            else if (commands[0].equals("3")){

                int maxNum = Collections.max(nums);
                System.out.println(maxNum);
            }
        }
    }
}
