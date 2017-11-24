import java.util.Scanner;

public class p05_TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();


        double price = 0;

        if (km < 20){
            if (time.equals("day")){
                price = 0.79 * km + 0.70;
            }
            else if (time.equals("night")){
                price = 0.90 * km + 0.70;
            }
        }
        else if (km >= 20){
            price = 0.09 * km;
        }
        else if (km >= 100){
            price = 0.06 * km;
        }


        System.out.printf("%.2f", price);
    }
}
