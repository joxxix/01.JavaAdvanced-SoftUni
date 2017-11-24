import java.util.Scanner;

public class p04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();


        double f1Sqrt = Math.abs((a+b+c)/Math.sqrt(c));
        double f1a = Math.abs(a*a + b*b) / (a*a - b*b);
        double f1 = Math.pow((f1a), f1Sqrt);

        double f2 = Math.pow((a*a + b*b - Math.pow(c, 3)),a-b);

        double avgABC = Math.abs((a + b + c)/3);
        double avgF1F2 = Math.abs((f1 + f2)/2);
        double avg = Math.abs(avgABC - avgF1F2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,avg);
    }
}
