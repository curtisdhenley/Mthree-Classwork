package com.ch.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Curtis Henley
 * email: henleydcurtis@gmail.com
 * date created: 08-03-2022
 */
public class SimpleCalculator {
    
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int subtract(int x, int y) {
        return x - y;
    }
    
    public static int multiply(int x, int y) {
        return x * y;
    }
    
    public static int divide(int x, int y) {
        return x / y;
    }
    
    public static void calculations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome to the myCalculator App! \n");
        System.out.println("\n Please enter two numbers");
        System.out.println("\n Your first number: ");
        String stringFirstNum = sc.nextLine();
        int firstNumber = Integer.parseInt(stringFirstNum);
        System.out.println("\n Your next number: ");
        String stringSecondNum = sc.nextLine();
        int secondNumber = Integer.parseInt(stringSecondNum);
        System.out.println("\n Now, choose the type of math you'd like!");
        System.out.println("\n Make a selection: (*, +, /, -) or if you wish to close the App enter X");
        String operator = sc.nextLine();

        int addResults = add(firstNumber, secondNumber);
        int subtractResults = subtract(firstNumber, secondNumber);
        int multiplyResults = multiply(firstNumber, secondNumber);
        int divideResults = divide(firstNumber, secondNumber);

        String userResults = "You selected: " + firstNumber + " " + operator + " " + secondNumber + "\n Which equals: ";

        switch (operator) {
            case "*":
                System.out.println(userResults + multiplyResults);
                break;
            case "+":
                System.out.println(userResults + addResults);
                break;
            case "/":
                System.out.println(userResults + divideResults);
                break;
            case "-":
                System.out.println(userResults + subtractResults);
                break;
            case "X":
                System.out.println("Thanks for using this!");
                System.exit(0);
            default: 
                System.out.println("\n Please select a valid operator!");
        }
        
        String runAgain;

        do {
            System.out.println("\n Would you like to play again? Yes or No");
            runAgain = sc.nextLine();
            if (runAgain.equalsIgnoreCase("Yes")) {
                System.out.println("\n You chose to continue");
                calculateAgain();
            } else {
                System.out.println("\n You chose to exit");
                System.out.println(" Thanks for using the myCalculator App. Bye! ");
                System.exit(0);
            }
        } while (true);
        
    }
    
    public static void calculateAgain() {
            calculations();
        }

}
