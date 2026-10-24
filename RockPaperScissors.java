
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        String[] choices = {"", "Rock", "Paper", "Scissors"};

        System.out.println("===== ROCK PAPER SCISSORS GAME =====");
        System.out.println("Type 'stop' to exit the game.");

        while (true) {

            System.out.println("\n1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            System.out.print("Enter your choice (or type stop): ");
            String input = sc.next().toLowerCase();

            if (input.equals("stop")) {
                break;
            }

            int user;

            try {
                user = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter 1, 2, 3, or stop.");
                continue;
            }

            if (user < 1 || user > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int computer = random.nextInt(3) + 1;

            System.out.println("You chose: " + choices[user]);
            System.out.println("Computer chose: " + choices[computer]);

            if (user == computer) {
                System.out.println("Result: It's a draw!");
            } else if (
                (user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)
            ) {
                System.out.println("Result: You win!");
                userScore++;
            } else {
                System.out.println("Result: Computer wins!");
                computerScore++;
            }

            System.out.println("Your Score: " + userScore);
            System.out.println("Computer Score: " + computerScore);
        }

        System.out.println("\n===== FINAL SCORE =====");
        System.out.println("Your Score: " + userScore);
        System.out.println("Computer Score: " + computerScore);
        System.out.println("Game stopped. Thank you for playing!");

        sc.close();
    }
}
