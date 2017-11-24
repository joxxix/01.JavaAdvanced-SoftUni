import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class p06_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfGraduets = Integer.parseInt(scan.nextLine());

        TreeMap<String, Double> graduationList = new TreeMap<>();

        for (int i = 0; i < numOfGraduets; i++) {
            String name = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            double sum = 0;

            for (int j = 0; j < grades.length; j++) {
                sum += grades[j];
            }

            graduationList.put(name, sum / grades.length);
        }

        for (String key : graduationList.keySet() ) {
            System.out.printf("%s is graduated with %s\n", key, graduationList.get(key));
        }
    }
}
