package com.bptn.course._06_Big_Data_Friday;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in); 
        // The correct number to guess, assigned to the variable 'targetNumber'
        int targetNumber = 23; 
        // Variable to store the user's guess
        int guess; 
        // Initialize to false as the user has not made any correct guess.
        //Ensures loop runs until correct guess is made
        boolean correctGuess = false; 

        System.out.println("Welcome to the guess the number game!");

        // ! is used to indicate that loop keep running as long as the guess is incorrect
        while (!correctGuess) {
            System.out.print("Please enter a number between 1 and 100: "); 
            // Read the user's guess
            guess = scanner.nextInt(); 

            // Check the user's guess
            if (guess<1 || guess >100) {
                 System.out.println("Your guess must be between 1 and 100. Try again."); 
           } else if (targetNumber < guess) {
                System.out.println("Too high! Try again.");
            } else if (targetNumber > guess) {
                System.out.println("Too low! Try again."); 
            } else {
                correctGuess = true; // Set to true when the guess is correct
                System.out.println("Congratulations! You guessed the number correctly!");
            }
        }

        scanner.close(); // Close the scanner to avoid data leaks
    }
}

