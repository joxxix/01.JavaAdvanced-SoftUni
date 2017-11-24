import java.util.Scanner;

public class p03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        double b = Double.parseDouble(scan.next());
        double c = Double.parseDouble(scan.next());


        String hexa = Integer.toHexString(a).toUpperCase();
        String binara = Integer.toBinaryString(a).replace(' ', '0');

        String roundedB = String.format("%.2f", b);
        String roundedC = String.format("%.3f", c);


        String paddedhexa = String.format("%-10s", hexa);
        String paddedbinara = String.format("%10s", binara).replace(' ', '0');
        String paddedB = String.format("%10s", roundedB);
        String paddedC = String.format("%-10s", roundedC);

        System.out.println("|" + paddedhexa + "|" + paddedbinara + "|" + paddedB + "|" + paddedC + "|");
    }
}
