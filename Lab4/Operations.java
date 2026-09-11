import java.util.Arrays;
public class Operations {
    public double getAverage(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }
    public int getMinimum(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
    public int getMaximum(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }
    public double getMedian(int[] grades) {
        int[] copy = Arrays.copyOf(grades, grades.length);
        Arrays.sort(copy);
        int n = copy.length;
        if (n % 2 != 0) {
            return copy[n / 2];
        } else {
            return (copy[(n / 2) - 1] + copy[n / 2]) / 2.0;
        }
    }
    public double getStandardDeviation(int[] grades) {
        double avg = getAverage(grades);
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += (grades[i] - avg) * (grades[i] - avg);
        }
        return Math.sqrt(sum / grades.length);
    }
}
