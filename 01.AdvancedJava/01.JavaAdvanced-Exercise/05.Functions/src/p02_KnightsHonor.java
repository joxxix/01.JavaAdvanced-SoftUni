import java.util.Scanner;

public class p02_KnightsHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        for (String name:input) {
            System.out.println("Sir " + name);
        }
    }
}