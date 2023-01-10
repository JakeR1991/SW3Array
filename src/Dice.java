// how to use Random
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        // random instance/object
        Random randomGenerator = new Random();

        // variable to contain the dice
        int diceNumber = randomGenerator.nextInt(6)+1; // +1 as without this random will generate 0-5

        System.out.println("The dice number is " + diceNumber);

        // extension : var crazyDice 1-10

        int crazyDice = randomGenerator.nextInt(10)+1;

        System.out.println("The crazy dice number is " + crazyDice);
    }
}
