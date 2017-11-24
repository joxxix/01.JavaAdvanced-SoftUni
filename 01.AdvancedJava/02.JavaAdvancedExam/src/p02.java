import java.util.ArrayDeque;
import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rocks = scan.nextLine().split(" ");

        ArrayDeque<Integer> rocksToGold = new ArrayDeque<>();

        for (int i = 0; i < rocks.length ; i++) {
            int rock = Integer.parseInt(rocks[i]);

            rocksToGold.addLast(rock);
        }

        int goldPiece = 0;


        for (int i = 0; ; i++) {
            String[] operations = scan.nextLine().split(" ");

            if (operations[0].equals("Revision")){
                break;
            }
            if (operations[0].equals("Apply")){
                try {
                    int numOfRocksChange = Integer.parseInt(operations[2]);

                    for (int j = 0; j < numOfRocksChange; j++) {
                        int rock = rocksToGold.pollFirst();
                        rock -= 1;
                        if (rock != 0) {
                            rocksToGold.addLast(rock);
                        } else {
                            goldPiece++;
                            continue;
                        }
                    }
                }catch (Exception ex){
                    continue;
                }
            }else  if (operations[0].equals("Air")){
                int rockTrunedInto = Integer.parseInt(operations[2]);

                if (goldPiece == 0){
                    continue;
                }else {
                    goldPiece--;
                    rocksToGold.addLast(rockTrunedInto);
                }
            }
        }

        System.out.println(rocksToGold.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));

        System.out.println(goldPiece);

    }
}
