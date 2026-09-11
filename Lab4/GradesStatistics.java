import java.util.Scanner;
public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + " (0-100): ");
            int grade = sc.nextInt();
            while (grade < 0 || grade > 100) {
                System.out.print("Invalid grade. Enter a value between 0 and 100: ");
                grade = sc.nextInt();
            }
            grades[i] = grade;
        }
        Operations op = new Operations();
        System.out.printf("Average: %.2f\n", op.getAverage(grades));
        System.out.println("Minimum: " + op.getMinimum(grades));
        System.out.println("Maximum: " + op.getMaximum(grades));
        System.out.printf("Median: %.2f\n", op.getMedian(grades));
        System.out.printf("Standard Deviation: %.2f\n", op.getStandardDeviation(grades));
        sc.close();
    }
}
