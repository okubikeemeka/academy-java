package com.bptn.course._06_Big_Data_Friday;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        int continueCalc;

        do {  //do while ensures that the code keeps running and giving outputs while conditions are met till user decides to exit.
        	
            // calculator menu output for user
            System.out.println("/...Calculator Menu.../");
            System.out.println("Press 1 for Addition");
           System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Square a number");
            System.out.println("Press 6 to find Square Root");
            System.out.println("Press 7 to find the Reciprocal");
            System.out.print("Enter your choice: ");
            
            
            choice = scanner.nextInt();

            // Check the user's choice and perform the operation
            //Else if is used repeatedly to test several conditions in the sequence
            if (choice == 1) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + result);
                
            }      else if (choice == 2) {
            	
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is = " + result);
                
            }  else if (choice == 3) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
                
                //Nested if here to ensure denominator is not zero as it produces undefined result
            }    else if (choice == 4) {
                 System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    double remainder = num1 % num2;
                    System.out.println("Dividing " + num1 + " by " + num2 + ", the quotient is " + result);
                    System.out.println("The remainder is " + remainder);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                //One number entered here as only one is needed for square
            } else if (choice == 5) {
                System.out.print("Enter the number to find Square: ");
                num1 = scanner.nextDouble();
                result = num1 * num1;
                System.out.println("The square of the number " + num1 + " is = " + result);
                
            } else if (choice == 6) {
                System.out.print("Enter the number to find Square Root: ");
                num1 = scanner.nextDouble();
                
                //Nested if here to ensure the number entered is not less than zero
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("The square root of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("No square root for negative numbers.");
                }
                
                //Nested if here to ensure zero is not entered as reciprocal of zero is undefined
            } else if (choice == 7) {
                System.out.print("Enter the number to find Reciprocal: ");
                num1 = scanner.nextDouble();
                if (num1 != 0) {
                    result = 1 / num1;
                    System.out.println("The reciprocal of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("Reciprocal of zero is undefined.");
                }
            } else {
                System.out.println("Invalid choice! Please make a valid choice.");
            }
            

            // Asks the user to continue or exit, after a condition is executed at least once
            System.out.print("To continue calculation Press 1, else press any other number to exit: ");
            continueCalc = scanner.nextInt();

        } while (continueCalc == 1);

        // Print final message and close scanner to avoid data leak
        System.out.println("Exiting the calculator. Goodbye!");
        scanner.close();
    }
}



