import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class p07_MapDistricts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, List<Integer>> cities = new HashMap<>();

        List<String> inputs = Arrays.asList(scan.nextLine().split("\\s+"));

        for (String input : inputs) {
            String[] inputArgs = input.split(":");
            String city = inputArgs[0];
            int population = Integer.valueOf(inputArgs[1]);

            cities.putIfAbsent(city, new ArrayList<>());
            cities.get(city).add(population);
        }

        int bound = Integer.valueOf(scan.nextLine());

        cities.entrySet().stream()
                .filter(getFilterByPopulationPredicate(bound))
                .sorted(getSortByDescendingPopulationComparator())
                .forEach(getPrintMapEntryConsumer());

    }

    private static Predicate<Map.Entry<String, List<Integer>>> getFilterByPopulationPredicate(int bound) {
        return n -> n.getValue().stream()
                .mapToInt(Integer::valueOf)
                .sum() >= bound;
    }

    private static Comparator<Map.Entry<String, List<Integer>>> getSortByDescendingPopulationComparator() {
        return (n1, n2) ->
                Integer.compare(
                        n2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        n1.getValue().stream().mapToInt(Integer::valueOf).sum());
    }

    private static Consumer<Map.Entry<String, List<Integer>>> getPrintMapEntryConsumer() {

    }



}
