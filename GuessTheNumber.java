import java.util.*;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int min = 1;
        int max = 100;
        int attemptsnum = 5;
        int score = 0;
        boolean playAgain = true;
        
        while (playAgain) {
            int generatedNumber = rand.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("Guess the number between " + min + " and " + max + ":");
            
            while (attempts < attemptsnum && !guessedCorrectly) {
                int userGuess = sc.nextInt();
                attempts++;
                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + generatedNumber);
            }
            
            System.out.println("Your score: " + score);
            System.out.println("Do you want to play again? (yes/no):");
            
            String playAgainChoice = sc.next().toLowerCase();
            
            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thanks for playing!");
        sc.close();
    }
}