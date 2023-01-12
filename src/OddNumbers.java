import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        //1. Declare an array with length 10 - Jake
        int[] numbers = new int[10];

        //2. Create scanner object and import scanner class - Jake
        Scanner reader = new Scanner(System.in);
        //3. Get user input, store in array using for loop - Bob
        System.out.println("Enter 10 numbers = ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reader.nextInt();
        }

        //4. Print the value of the array, use for loop or for each loop -Laura
        System.out.println("The resulted array is: ");
        for(int i:numbers){
            System.out.print(i + " ");
        }
        //. Print only odd values, use for loop to access array index - Bence
        System.out.println();
        System.out.println("The odd values are : ");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 !=0 ) {
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
