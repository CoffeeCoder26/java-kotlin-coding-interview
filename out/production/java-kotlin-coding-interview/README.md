# Coding Interview: Rock Paper Scissors

## The Task

Write a program that plays multiple rounds of Rock, Paper, Scissors (https://en.wikipedia.org/wiki/Rock-paper-scissors) and shows the final results of the game.The code should at least provide the minimal functional requirements listed below, have high test coverage and adhere to common clean code rules. 

KEEP IT SIMPLE - remember: we're not looking for a full-blown business application, but a basis for discussion and further development. A simple text output for the result will do.

Minimal functional requirements:
* One player should always play randomly, the other should always choose rock. No user interaction should be required (i.e. no reading from stdin and waiting for a user interaction)
* The application should play 100 rounds of the game
* The application should evaluate the game logic, i.e. the result (e.g. WIN, DRAW, LOSE) of two actions (e.g. ROCK, PAPER, SCISSOR) competing against each other
* The application should calculate at least the number of wins for each player and the number of draws.
 

## Technical requirements

Language: Kotlin, tests in a language and with a framework of your choice
Approach: ideally "test-driven
Build files (e.g. for Gradle or Maven) should be included in the project
 
[Fork this repository](https://github.com/cocharge/coding-interview/fork) and push changes to your forked personal repository.

The output of the program should be like the following:

```
"Player A wins 31 of 100 games"
"Player B wins 37 of 100 games"
"Draws: 32 of 100 games"
```

Good luck!