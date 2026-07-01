import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        // Initialize the Scanner to read user input
        Scanner input = new Scanner(System.in);

        // 1. Prompt the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        // Safety check for empty or invalid array sizes
        if (size <= 0) {
            System.out.println("\nError: Array size must be greater than 0.");
            input.close();
            return;
        }

        // 2. Create an integer array of the specified size
        int[] numbers = new int[size];

        // 3. Prompt the user to enter each element one by one
        System.out.println("\nPlease enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = input.nextInt();
        }

        // 4. Search through the array to find the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // 5. Display the results in a clear and professional format
        System.out.println("\n=================================");
        System.out.println("         SEARCH RESULTS          ");
        System.out.println("=================================");
        System.out.printf(" Maximum Value : %d\n", maxValue);
        System.out.printf(" Found at Index : %d\n", maxIndex);
        System.out.println("=================================");

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
