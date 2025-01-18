package src.task;

import src.task.service.GameService;

public class Main {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.implementRockPaperScissorsGame();
    }
}
