package com.ch.rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Curtis Henley email: henleydcurtis@gmail.com date created: 08-02-2022
 */
public class RockPaperScissors {

    public static String newGame() {
        int roundsPlayed = 0;
        int userWins = 0;
        int userLosses = 0;
        int ties = 0;
        Scanner sc = new Scanner(System.in);
        String userChoice = "";
        String compChoice = "";
//        generate random number between 0-2 for computer choice
        double numGenerator = Math.round(Math.random() * 3);
        int generatedNum = (int) numGenerator;
        System.out.println("Hello! What's your name?");
        String userName = sc.nextLine();
        System.out.println("Nice to meet you, " + userName + "!");
        System.out.println("Welcome to Rock, Paper, Scissors! How many rounds would you like to play?");
        String stringNumOfRounds = sc.nextLine();
//        determine if num of rounds meets requirements
        int numOfRounds = Integer.parseInt(stringNumOfRounds);
        if (numOfRounds < 1 || numOfRounds > 10) {
            System.out.println("I'm sorry, you can only choose from 1 round up to 10. Try again!");
        }
        System.out.println("Okay! We'll play for " + numOfRounds + " rounds.");
        System.out.println("Choose r, p, or s to make your move.");
        userChoice = sc.nextLine();
        // generate computer choice
        switch (generatedNum) {
            case 0:
                compChoice = "r";
                System.out.println("The computer played: " + compChoice);
                return compChoice;
            case 1:
                compChoice = "p";
                System.out.println("The computer played: " + compChoice);
                return compChoice;
            case 2:
                compChoice = "S";
                System.out.println("The computer played: " + compChoice);
                return compChoice;
        }
//        get user choice
        
        
        switch (userChoice) {
            case "r":
                return userChoice;
            case "p":
                return userChoice;
            case "s":
                return userChoice;
            default:
                System.out.println("Whoops! It looks like you may have entered something incorrectly!");
            System.exit(0);
        }

                System.out.println("You played: " + userChoice + ".");
        System.out.println(compChoice);
        return null;

    }

    public static void main(String[] args) {
        newGame();
    }
}
