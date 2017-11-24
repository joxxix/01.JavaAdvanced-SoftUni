import java.util.Scanner;

public class p03_BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nums = scan.nextLine().split(" ");
        String searchedNum = scan.nextLine();

        int found = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals(searchedNum)){
                System.out.println("0");
                found++;
            }
        }
    }
}
