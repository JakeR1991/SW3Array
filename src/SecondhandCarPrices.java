public class SecondhandCarPrices {
    public static void main(String[] args) {
        // Declare an array variable named "carPrices" to store the second-hand car prices
        int[] carPrices = {12000, 34000, 56000, 15450, 45000};

// Use a for loop to iterate through the array and print each element
        for (int i = 0; i < carPrices.length; i++) {
            System.out.println("Original Car Price: " + carPrices[i]);
        }

// Update the value 12000 to 12670
        carPrices[0] = 12670;

// Use a for loop to iterate through the array again and print each element
        for (int i = 0; i < carPrices.length; i++) {
            System.out.println("Updated Car Price: " + carPrices[i]);
        }
    }
}
