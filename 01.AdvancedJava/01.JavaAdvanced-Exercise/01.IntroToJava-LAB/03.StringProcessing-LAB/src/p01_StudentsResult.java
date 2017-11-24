import java.util.Scanner;

public class p01_StudentsResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {
            String name = scan.next();
            double jadv = scan.nextDouble();


            System.out.println(jadv);
        }

    }
}
