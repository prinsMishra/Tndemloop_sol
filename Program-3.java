import java.util.ArrayList;
import java.util.List;

public class NumberSeries {
    public static List<Integer> generateSeries(int a) {
        List<Integer> series = new ArrayList<>();
        int number = 1;

        while (series.size() < a) {
            series.add(number);
            number += 2;
        }

        return series;
    }

    public static void main(String[] args) {
        int a = 5; // Change this value to test different inputs
        List<Integer> series = generateSeries(a);

        System.out.println("Output:");
        for (int num : series) {
            System.out.print(num + " ");
        }
    }
}
