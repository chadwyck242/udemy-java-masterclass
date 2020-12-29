package com.chadwyck242;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was: " + highScore);

        // Initialize variables for use in the challenge below
        int topScore;
        String name;
        int position;

        // The method calls that fulfill the challenge requirements
        topScore = 1500;
        name = "Xmmb223";
        position = calculateHighScorePosition(topScore);
        displayHighScorePosition(name, position);

        topScore = 900;
        name = "Xmmc224";
        position = calculateHighScorePosition(topScore);
        displayHighScorePosition(name, position);

        topScore = 400;
        name = "Xmmd225";
        position = calculateHighScorePosition(topScore);
        displayHighScorePosition(name, position);

        topScore = 50;
        name = "Xmme226";
        position = calculateHighScorePosition(topScore);
        displayHighScorePosition(name, position);


    }

    // Calculates the final score for the game and returns it as an int
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    // Print out the name and current position of a given player as a string
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table!");
    }

    // Calculates and returns the position of the player as an int
    public static int calculateHighScorePosition(int score){
        int finalPosition;

        if (score >= 1000) {
            finalPosition = 1;
        }
        else if (score >= 500){
            finalPosition = 2;
        }
        else if (score >= 100) {
            finalPosition = 3;
        } else {
            finalPosition = 4;
        }

        return finalPosition;
    }
}
