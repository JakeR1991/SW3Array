import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        // Create and initialize two arrays with random values between 1 and 20
        Random rand = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = rand.nextInt(20) + 1;
            array2[i] = rand.nextInt(20) + 1;
        }

        // Print the arrays
        System.out.println("Array 1:");
        for (int i : array1) {
            System.out.println(i);
        }
        System.out.println("Array 2:");
        for (int i : array2) {
            System.out.println(i);
        }

        // Find duplicates
        System.out.println("Duplicate values:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
