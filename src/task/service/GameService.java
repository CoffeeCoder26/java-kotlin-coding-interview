package src.task.service;

import src.task.enums.ChoiceEnum;
import src.task.enums.ResultEnum;
import src.task.model.GameCounter;

import java.util.Random;

public class GameService {

    public void implementRockPaperScissorsGame() {
        GameCounter gameCounter = new GameCounter();
        int numberOfRounds = 100;

        for (int round = 1; round <= numberOfRounds; round++) {
            ChoiceEnum playerAChoiceEnum = ChoiceEnum.ROCK;
            ChoiceEnum playerBChoiceEnum = generateRandomChoice();
            ResultEnum roundResult = determineRoundWinner(playerAChoiceEnum, playerBChoiceEnum);
            updateGameCounters(roundResult, gameCounter);
        }
        printGameOutput(gameCounter, numberOfRounds);
    }

    private ChoiceEnum generateRandomChoice() {
        Random random = new Random();
        int choice = random.nextInt(ChoiceEnum.values().length);
        return ChoiceEnum.values()[choice];
    }

    private ResultEnum determineRoundWinner(ChoiceEnum playerAChoiceEnum, ChoiceEnum playerBChoiceEnum) {
        if (playerAChoiceEnum == playerBChoiceEnum)
            return ResultEnum.DRAW;
        switch (playerAChoiceEnum) {
            case ROCK:
                return playerBChoiceEnum == ChoiceEnum.SCISSORS ? ResultEnum.WIN : ResultEnum.LOSE;
            case PAPER:
                return playerBChoiceEnum == ChoiceEnum.ROCK ? ResultEnum.WIN : ResultEnum.LOSE;
            case SCISSORS:
                return playerBChoiceEnum == ChoiceEnum.PAPER ? ResultEnum.WIN : ResultEnum.LOSE;
            default:
                return ResultEnum.DRAW;
        }
    }

    private void updateGameCounters(ResultEnum roundResult, GameCounter gameCounter) {
        switch (roundResult) {
            case WIN:
                gameCounter.incrementPlayerAWinsCounter();
                break;
            case LOSE:
                gameCounter.incrementPlayerBWinsCounter();
                break;
            case DRAW:
                gameCounter.incrementNumberOfDraws();
                break;
        }
    }

    private static void printGameOutput(GameCounter gameCounter ,int numberOfRounds) {
        System.out.println("Player A wins: " + gameCounter.getPlayerAWinsCounter() + " out of " + numberOfRounds + " rounds");
        System.out.println("Player B wins: " + gameCounter.getPlayerBWinsCounter() + " out of " + numberOfRounds + " rounds");
        System.out.println("Number of draws: " + gameCounter.getNumberOfDraws() + " out of " + numberOfRounds + " rounds");
    }
}
