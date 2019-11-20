import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int sides, numDie, sum=0;
        int[] dice;
        boolean rollAgain = false;

        do {
            System.out.print("How many die? ");
            numDie = input.nextInt();
        } while (numDie < 1);

        dice = new int[numDie];

        do {
            System.out.print("How many sides on each? ");
            sides = input.nextInt();
        } while (sides < 1);

        do {
            sum = 0;
            for (int i=0; i<dice.length; i++) {
                sum += dice[i] = rand.nextInt(sides)+1;
            }

            System.out.println("\nYou rolled: " + Arrays.toString(dice) + " for a total of " + sum + ".");

            System.out.print("\nRoll again? (Y/N) ");
            if (input.next().toLowerCase().charAt(0) == 'y') rollAgain = true;
            else rollAgain = false;

        } while (rollAgain);

        System.out.println("Thanks for using my dice roller program!");
    }
}
