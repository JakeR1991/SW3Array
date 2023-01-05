import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        // Create and initialise an integer array, length is 5, assign 5 numbers
        int[] arr = {1, 2, 3, 4, 5};

        // Ask the user to enter a value to search for & assign this to userNumber variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search for: ");
        int userNumber = scanner.nextInt();

        // Declare a new variable called valueFind and assign it to False
        boolean valueFind = false;

        // Use for loop to compare the userNumber with array element, if you find a match (==) change the valueFind from false to true
        for (int num : arr) {
            if (num == userNumber) {
                valueFind = true;
            }
        }

        // Print the result
        if (valueFind) {
            System.out.println("Value " + userNumber + " found in array");
        } else {
            System.out.println("Value was not found in array");
        }
    }
}