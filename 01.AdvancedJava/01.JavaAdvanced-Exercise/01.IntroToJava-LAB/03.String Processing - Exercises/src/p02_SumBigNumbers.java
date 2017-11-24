import java.math.BigInteger;
import java.util.Scanner;

public class p02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger n = scan.nextBigInteger();
        BigInteger m = scan.nextBigInteger();

        BigInteger result = n.add(m);
        System.out.println(result);
    }
}
