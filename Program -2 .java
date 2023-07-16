import java.util.ArrayList;

public class NumberSeriesGenerator {
    public static void main(String[] args) {
        int a = 4; // Change the value of 'a' here
        
        ArrayList<Integer> series = soln(a);
        
        System.out.println(series);
    }
    
    public static ArrayList<Integer> soln(int a) {
        ArrayList<Integer> series = new ArrayList<>();
        
        for (int i = 1; i <= a; i++) {
            int num = 2 * i - 1;
            series.add(num);
        }
        
        return series;
    }
}
