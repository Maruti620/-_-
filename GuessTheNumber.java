import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 10;
        int score = 100; // Initial score

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Guess it!");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Your score is: " + score);
                break;
            } else {
                System.out.println("Wrong guess!");

                if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                // Deduct points for each incorrect attempt
                score -= 20;
            }
        }

        System.out.println("The correct number was: " + targetNumber);
        scanner.close();
    }
}
