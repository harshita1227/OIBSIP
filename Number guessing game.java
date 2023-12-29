import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it.");

        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
