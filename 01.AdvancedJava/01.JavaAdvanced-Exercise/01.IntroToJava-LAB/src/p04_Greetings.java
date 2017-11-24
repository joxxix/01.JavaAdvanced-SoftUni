import java.util.Scanner;

public class p04_Greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String secondName = scan.nextLine();

        if (firstName.isEmpty()){
            firstName = "*****";
        }
        if (secondName.isEmpty()){
            secondName = "*****";
        }

        System.out.printf("Hello, "+ firstName + " "+ secondName+"!");

    }
}
