import java.util.*;

public class p01_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int[] nsx = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> nums = new ArrayDeque<>();

        int n = nsx[0];
        int s = nsx[1];
        int x = nsx[2];

        for (int i = 0; i < n; i++) {
            //  nums.add(numbers[i]);
            nums.push(numbers[i]);
        }

        for (int i = 0; i < s ; i++) {
            nums.pollLast();
        }

        if (nums.contains(x)){
            System.out.println("true");
        }
        else {
            int minElement = Integer.MAX_VALUE;
            if (nums.size() == 0){
                System.out.println("0");
                return;
            }
            while (nums.size() > 0){
                int currnum = nums.pop();
                if(currnum < minElement){
                    minElement = currnum;
                }
            }
            System.out.println(minElement);
        }

    }
}
