import java.util.HashMap;
import java.util.Map;

public class NumberCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int multiple : multiples) {
            countMap.put(multiple, 0);  // Initialize count for each multiple
        }

        for (int number : numbers) {
            for (int multiple : multiples) {
                if (number % multiple == 0) {
                    countMap.put(multiple, countMap.get(multiple) + 1);
                }
            }
        }

        System.out.println(countMap);
    }
}
