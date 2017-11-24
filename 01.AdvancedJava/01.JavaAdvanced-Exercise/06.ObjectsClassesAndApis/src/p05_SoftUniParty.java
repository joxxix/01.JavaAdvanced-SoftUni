import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class p05_SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> vip = new ArrayList<>();
        List<String> normalGuest = new ArrayList<>();

        for (int i = 0;; i++) {
            String guest = scan.nextLine();

            if (guest.equals("PARTY")){
                break;
            }

            if (Character.isDigit(guest.charAt(0))){
                vip.add(guest);
            }
            else {
                normalGuest.add(guest);
            }
        }

        for (int i = 0;; i++) {
            String guest = scan.nextLine();

            if (guest.equals("END")){
                break;
            }

            if (vip.contains(guest)){
                vip.remove(guest);
            }
            else if (normalGuest.contains(guest)){
                normalGuest.remove(guest);
            }
        }

        int numberOfGuest = vip.size() + normalGuest.size();

        System.out.println(numberOfGuest);

        Collections.sort(vip);
        Collections.sort(normalGuest);


        for (String guest:vip ) {
            System.out.println(guest);
        }
        for (String guest : normalGuest) {
            System.out.println(guest);
        }
    }
}
