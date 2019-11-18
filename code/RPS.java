import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {

        String user, comp;
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            System.out.print("What do you go (\'r\'ock, \'p\'aper, or \'s\'cissors): ");
            user = input.next();

            while (!(user.contains("r") || !(user.contains("p")) || !(user.contains("s")))) {
                System.out.print("Invalid input, try again: ");
                user = input.next();
            }

            comp = rps();

            if (user.charAt(0) == comp.charAt(0)) System.out.println("I went " + comp + ", so it's a tie, go again.");
            else if (user.charAt(0) == 'r' && comp.charAt(0) == 'p') gameOver = win(comp);
            else if (user.charAt(0) == 'r' && comp.charAt(0) == 's') gameOver = loss(comp);
            else if (user.charAt(0) == 'p' && comp.charAt(0) == 's') gameOver = win(comp);
            else if (user.charAt(0) == 'p' && comp.charAt(0) == 'r') gameOver = loss(comp);
            else if (user.charAt(0) == 's' && comp.charAt(0) == 'r') gameOver = win(comp);
            else if (user.charAt(0) == 's' && comp.charAt(0) == 'p') gameOver = loss(comp);
        }
    }

    public static String rps() {
        Random rand = new Random();

        int num = rand.nextInt(3);

        if (num == 0) return "rock";
        else if (num == 1) return "paper";
        else return "scissors";
    }

    public static boolean win(String comp) {
        System.out.println("I went " + comp + ", I win!");
        return true;
    }

    public static boolean loss(String comp) {
        System.out.println("I went " + comp + ", YOU win!");
        return true;
    }
}
