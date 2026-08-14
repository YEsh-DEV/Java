public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("--- Conditional Statements Demo ---");

        int score = 85;
        System.out.println("Score: " + score);

        // 1. if-else if-else statement
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 2. switch statement
        int dayOfWeek = 3;
        System.out.print("\nDay " + dayOfWeek + " is ");
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
