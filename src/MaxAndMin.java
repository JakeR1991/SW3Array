//import random function
import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        //create array of size 10, name this array myArray
        int[] myArray = new int[10];
        //create random object
        Random rand = new Random();

        // use for loop to access array index, generate random integers between 1-10 and store it in the array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(10) + 1;
            // print the array
            System.out.print(myArray[i] + " ");
        }   System.out.println();

        // find the biggest value, initiate variable maxValue, assign array index 0 & use for loops to find the maxValue and print
        int maxValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
        }
        System.out.println("The maximum value is: " + maxValue);

        // find the smallest value, initiate variable minValue, assign array index 0 & use for loops to find the minValue and print
        int minValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        System.out.println("The minimum value is: " + minValue);
    }
}
