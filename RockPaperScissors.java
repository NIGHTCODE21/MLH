// RockPaperScissors.java
// Simple Rock-Paper-Scissors game in Java
// Compile: javac RockPaperScissors.java
// Run: java RockPaperScissors

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("=== Rock-Paper-Scissors ===");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().trim().toLowerCase();

        // Validate input
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            return;
        }

        // Computer move
        String computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win! 🎉");
        } else {
            System.out.println("You lose! 😢");
        }

        scanner.close();
    }
}
