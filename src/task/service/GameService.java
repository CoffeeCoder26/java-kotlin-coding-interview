package src.task.service;

import java.util.Random;

public class GameService {

    public void implementRockPaperScissorsGame() {
        int playerAWinsCounter = 0;
        int playerBWinsCounter = 0;
        int numberOfDraws = 0;
        int numberOfRounds = 100;

        for (int round = 1; round <= numberOfRounds; round++) {
            String playerAChoice = "ROCK";
            String playerBChoice = generateRandomChoice();
            String roundResult = determineRoundWinner(playerAChoice, playerBChoice);

            if (roundResult.equals("WIN")) {
                playerAWinsCounter++;
            } else if (roundResult.equals("LOSE")) {
                playerBWinsCounter++;
            } else {
                numberOfDraws++;
            }
        }

        System.out.println("Player A wins " + playerAWinsCounter + " of 100 games");
        System.out.println("Player B wins " + playerBWinsCounter + " of 100 games");
        System.out.println("Draws: " + numberOfDraws + " of 100 games");

    }


    private String generateRandomChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return "ROCK";
            case 1:
                return "PAPER";
            case 2:
                return "SCISSORS";
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }

    private String determineRoundWinner(String playerAChoice, String playerBChoice) {
        if (playerAChoice.equals(playerBChoice))
            return "DRAW";
        switch (playerAChoice) {
            case "ROCK":
                return playerBChoice.equals("SCISSORS") ? "WIN" : "LOSE";
            case "PAPER":
                return playerBChoice.equals("ROCK") ? "WIN" : "LOSE";
            case "SCISSORS":
                return playerBChoice.equals("PAPER") ? "WIN" : "LOSE";
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}
