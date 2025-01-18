package src.task.model;

public class GameCounter {
    private int playerAWinsCounter;
    private int playerBWinsCounter;
    private int numberOfDraws;

    public void incrementPlayerAWinsCounter() {
        playerAWinsCounter++;
    }

    public void incrementPlayerBWinsCounter() {
        playerBWinsCounter++;
    }

    public void incrementNumberOfDraws() {
        numberOfDraws++;
    }

    public int getPlayerAWinsCounter() {
        return playerAWinsCounter;
    }

    public int getPlayerBWinsCounter() {
        return playerBWinsCounter;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }
}
