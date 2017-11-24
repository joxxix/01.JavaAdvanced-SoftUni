import java.util.Scanner;

public class p01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);

        long[][] matrix = new long[n][n];

        if (input[1].equals("A")){
            getFillTheMatrixA(n, matrix);
        }
        else if (input[1].equals("B")){
            getFillTheMatrixB(n, matrix);
        }

        for (long[] longs : matrix) {
            for (long aLong : longs) {
                System.out.print(aLong + " ");
            }
            System.out.println();
        }


    }

    private static void getFillTheMatrixB(int n, long[][] matrix) {
        int count = 1;

        for (int col = 0; col < n; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = count;
                    count++;
                }
            }
            else{
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = count;
                    count++;
                }
            }
        }
    }

    private static void getFillTheMatrixA(int n, long[][] matrix) {
        int count = 1;

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = count;
                count++;
            }
        }
    }
}
