package com.bptn.course._02_scanner;

import java.util.Scanner;

public class ReciprocalCheck {

	public static void main(String[] args) {
		
		    	// Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);  

		        System.out.print("Enter a number: ");
		        
		     // Using double as input can be a decimal number
		        double number = scanner.nextDouble();  

		        // Check if the number is not zero
		        if (number != 0) {
		            double reciprocal = 1 / number;
		            System.out.println("The reciprocal of " + number + " is: " + reciprocal);
		        } else {
		            System.out.println("Reciprocal is undefined for zero.");
		        }
		        
		        scanner.close();  // Close the scanner
		    }
		}


	


