import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int sides, sum=0;
        int[] dice;
        boolean rollAgain = false;

        System.out.print("How many die? ");
        dice = new int[input.nextInt()];

        System.out.print("How many sides on each? ");
        sides = input.nextInt();

        do {
            for (int i=0; i<dice.length; i++) {
                sum += dice[i] = rand.nextInt(sides)+1;
            }

            System.out.println("\nYou rolled: " + Arrays.toString(dice) + " for a total of " + sum + ".");

            System.out.print("\nRoll again? (Y/N) ");
            if (input.next().toLowerCase().equals("y")) rollAgain = true;
            else rollAgain = false;

        } while (rollAgain);
    }
}
