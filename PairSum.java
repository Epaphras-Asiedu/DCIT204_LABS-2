import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        // Initialize Scanner for reading user input
        Scanner input = new Scanner(System.in);

        // 1. Prompt the user for the array size
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        // Check if a pair is even possible
        if (size < 2) {
            System.out.println("\nError: You need at least 2 elements to find a pair.");
            input.close();
            return;
        }

        // 2. Create the array and accept each element from the user
        int[] numbers = new int[size];
        System.out.println("\nPlease enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = input.nextInt();
        }

        // 3. Prompt the user to enter a Target Sum
        System.out.print("\nEnter the Target Sum to search for: ");
        int targetSum = input.nextInt();

        // 4. Brute Force (Nested Loop) algorithm to look for a matching pair
        boolean pairFound = false;

        System.out.println("\n=================================");
        System.out.println("         SEARCH RESULTS          ");
        System.out.println("=================================");

        // Outer loop selects the first element
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop selects the second element (starts at i + 1 to avoid matching an element with itself)
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    // 5. If a pair is found, display indices, values, and the equation
                    System.out.println("Pair Found!");
                    System.out.printf("First Element  -> Index: %d, Value: %d\n", i, numbers[i]);
                    System.out.printf("Second Element -> Index: %d, Value: %d\n", j, numbers[j]);
                    System.out.printf("Equation       -> %d + %d = %d\n", numbers[i], numbers[j], targetSum);
                    
                    pairFound = true;
                    break; // Break inner loop
                }
            }
            if (pairFound) {
                break; // Break outer loop once the first matching pair is found
            }
        }

        // 6. If no pair exists, print an appropriate message
        if (!pairFound) {
            System.out.printf("No pair exists that adds up to the target sum of %d.\n", targetSum);
        }
        System.out.println("=================================");

        // Close the scanner to prevent resource leaks
        input.close();
    }
}