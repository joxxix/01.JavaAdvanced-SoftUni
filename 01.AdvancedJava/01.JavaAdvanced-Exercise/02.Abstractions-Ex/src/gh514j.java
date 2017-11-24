import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gh514j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lengts = scan.nextLine().split(", ");

        int n = Integer.parseInt(lengts[0]);
        int m = Integer.parseInt(lengts[1]);

        int[][] matrix = new int[n][m];

        int sum =  0;

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");

            for (int j = 0; j < m ; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
                sum += matrix[i][j];
            }
        }
        System.out.println(n);
        System.out.println(m);
        System.out.println(sum);
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
    }
}
