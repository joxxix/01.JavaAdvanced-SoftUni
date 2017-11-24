import java.util.Scanner;

public class p01_consumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputs = scan.nextLine().split(" ");

        for (String  input:inputs) {
            System.out.println(input);
        }
    }
}