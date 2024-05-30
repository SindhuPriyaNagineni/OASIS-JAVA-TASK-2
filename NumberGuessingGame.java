package sindhu1;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 10;
        int score = 100;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                System.out.println("Your score is: " + score);
                break;
            } else if (guess < randomNumber) {
                System.out.println("The number is higher than " + guess + ". Try again.");
            } else {
                System.out.println("The number is lower than " + guess + ". Try again.");
            }
            
            score -= 10; // Decrease score for each attempt
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts.");
            System.out.println("The correct number was: " + randomNumber);
        }
        
        scanner.close();
    }
}
