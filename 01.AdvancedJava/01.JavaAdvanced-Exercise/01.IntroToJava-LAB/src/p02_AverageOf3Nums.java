import java.util.Scanner;

public class p02_AverageOf3Nums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double fistNum = scan.nextDouble();
        double secondNum = scan.nextDouble();
        double thirdNum = scan.nextDouble();

        double average = fistNum + secondNum + thirdNum / 3;

        System.out.printf("%.2f", average);
    }
}
