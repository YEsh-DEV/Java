public class LoopControlDemo {
    public static void main(String[] args) {
        System.out.println("--- Loop and Control Statements Demo ---");

        // 1. For Loop
        System.out.println("\n1. For Loop (counting 1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. While Loop
        System.out.println("\n2. While Loop (counting down from 5):");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // 3. Do-While Loop
        System.out.println("\n3. Do-While Loop (guarantees at least one execution):");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 3);
        System.out.println();

        // 4. Break and Continue
        System.out.println("\n4. Break and Continue (count 1 to 10, skip 4, stop at 7):");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue; // Skip current iteration, so 4 won't be printed
            }
            if (i == 8) {
                break; // Exit the loop entirely when i reaches 8
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
