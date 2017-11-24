import java.util.*;

public class p04_ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> carsInside = new HashSet<>();

        for (int i = 0;; i++) {
            String[] car = scan.nextLine().split(", ");

            if (car[0].equals("END")){
                break;
            }

            if (car[0].equals("IN")){
                carsInside.add(car[1]);
            }
            else if (car[0].equals("OUT")){
                carsInside.remove(car[1]);
            }
        }
        if (carsInside.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else {
            for (String cars : carsInside) {
                System.out.println(cars);
            }
        }
    }
}
    