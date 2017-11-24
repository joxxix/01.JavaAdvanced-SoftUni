import java.math.BigDecimal;
import java.util.Scanner;

public class p01_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int a = Integer.parseInt(scan.next());
        BigDecimal a = new BigDecimal(scan.next());
        BigDecimal b = new BigDecimal(scan.next());
        // int b = Integer.parseInt(scan.next());

        BigDecimal sum = a.multiply(b);

        System.out.printf("%.2f", sum);
    }
}
