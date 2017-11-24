import java.util.*;

public class P04_SortStudents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> students = new TreeMap<>();

        while (true){
            String[] names = scan.nextLine().split(" ");

            if (names[0].equals("END")){
                break;
            }
            else {
                students.put(names[0], names[1]);
            }
        }

        Comparator<Map.Entry> compareLastName = (x, y) -> x.getKey().toString().compareTo(y.getKey().toString());
        Comparator<Map.Entry> compareFirstName = (x,y) -> x.getKey().toString().compareTo(y.getKey().toString());

        students.entrySet()
                .stream()
                .sorted(compareLastName.thenComparing(compareFirstName))
                .forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));

    }
}
