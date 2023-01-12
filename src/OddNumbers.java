import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Create an array to store the input numbers
        int[] numbers = new int[10];

        // Loop to take 10 integer inputs from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scan.nextInt();
        }

        // Print "Odd numbers: "
        System.out.print("Odd numbers: ");

        // Loop to check for odd numbers and print
        for (int i = 0; i < 10; i++) {
            // Check if the number is odd using the formula numbers[i] % 2 != 0
            if (numbers[i] % 2 != 0) {
                // Print the odd number
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
