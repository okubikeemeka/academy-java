package com.bptn.course._05_strings;
import java.util.Scanner;

public class StringOperationsUsingSwitch {

	public static void main(String[] args) {
	

		
		        Scanner scanner = new Scanner(System.in);
		        
		        // Prompt user to enter a string
		        System.out.println("Enter a string: ");
		        String inputString = scanner.nextLine();
		        
		        // Display the menu of string operations
		        System.out.println("Choose an operation:");
		        System.out.println("1. Get length of the string");
		        System.out.println("2. Convert string to uppercase");
		        System.out.println("3. Reverse the string");
		        System.out.println("4. Concatenate another string");

		        // Read the user's choice
		        int choice = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline after the integer input

		        switch (choice) {
		            case 1: 
		                // Get length of the string
		                System.out.println("Length of the string: " + inputString.length());
		                break;

		            case 2:
		                // Convert the string to uppercase
		                System.out.println("String in uppercase: " + inputString.toUpperCase());
		                break;

		            case 3:
		                // Reverse the string
		                String reversedString = new StringBuilder(inputString).reverse().toString();
		                System.out.println("Reversed string: " + reversedString);
		                break;

		            case 4:
		                // Concatenate another string
		                System.out.println("Enter another string to concatenate: ");
		                String anotherString = scanner.nextLine();
		                String concatenatedString = inputString + anotherString;
		                System.out.println("Concatenated string: " + concatenatedString);
		                break;

		            default:
		                System.out.println("Invalid choice! Please choose a valid operation.");
		                break;
		        }

		        scanner.close();
		    }

	}


