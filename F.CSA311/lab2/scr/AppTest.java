package lab2.scr;

public class AppTest {
    public static double calculateAverage(double[] heights) {
        if (heights.length == 0) return 0;

        double sum = 0;
        for (double h : heights) {
            sum += h;
        }
        return sum / heights.length;
    }

    public static void main(String[] args) {
        // Интерфэйс бүхий оролт энд байж болно
    }
}
