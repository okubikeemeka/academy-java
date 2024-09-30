package com.bptn.course._06_Big_Data_Friday;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in); //Create scanner object for input
        //Variables to store user inputs and initialize string inputs
		int userChoice; 
		String str1 = "";
		String str2 = "";
		int contInput;
		
		
		do {
			
		System.out.println("/...String Menu.../");
		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate two Strings");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");
		System.out.println("Enter the option:");
		
		userChoice = scanner.nextInt();
		scanner.nextLine(); //Consume newline character from nextInt()
		
		switch (userChoice) {
		case 1: //This is to check for Palindrome
		System.out.println("Palindrome Check");	
		System.out.print("Enter a string: ");
		str1 = scanner.nextLine();	
		String cleanedString = str1.replaceAll("\\s+", "").toLowerCase(); //Cleans input and converts to lowercase//
		String revStr = new StringBuilder (cleanedString).reverse().toString();	
		if (cleanedString.equals(revStr)) {
		System.out.println("\"" + str1 + "\" is a palindrome");
		} else { 
		System.out.println("\"" + str1 + "\" is not a palindrome");	
		}
		break; 
		
		case 2: // String is reversed here
			//String builder is mutable and helps modify string content. 
			//Stringbuilder.reverse() reverses the sequence of characters while .toString() converts it back to string.	
		System.out.println("Reverse a string");	
		System.out.print("Enter a string: ");
		str1 = scanner.nextLine();
		String reversedString = new StringBuilder (str1).reverse().toString();	
		System.out.println("Reversed string: " +reversedString);
		break;
		
		case 3: // The user inputs are concatenated here
			// Note the use of '+' operator in the concatenation process
	;	
		System.out.print("Enter the first string: ");
		str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		str2 = scanner.nextLine();
		String strConcat = str1 + str2;
		System.out.println(strConcat);
		break;
		
		case 4: // Use of '.equals' here provided a basis for comparison for the two strings.
			System.out.println("String Comparison");
			System.out.print("Enter the first string: ");
			str1 = scanner.nextLine();
			System.out.print("Enter the second string: ");
			str2 = scanner.nextLine();			
		if (str1.equals(str2)) {
		System.out.println("The entered strings are equal");	
		}
		else {
		System.out.println("The entered strings are not equal");	
		}
		break;
		
		case 5: //String length is calculated here using '.length'. Note the int data type too
			System.out.println("Calculate the Length of String");
			System.out.print("Enter a string: ");
			str1 = scanner.nextLine();
			int length = str1.length();
			System.out.println("The length of the entered string is: " +length); 
		    break;
		    
		    default:  //User sees this after selecting a number outside 1 - 5.
			System.out.println("Invalid choice! Please make a valid choice.");
			break;
			
		}    //Adding a break here will make the program to exit the loop after the first iteration, so should be avoided.
			System.out.println("To continue input, Press 1, else press any other number to exit: "); 
		    contInput = scanner.nextInt(); 
			
		
		
		} 
		
		while (contInput == 1); //This makes the code to continue running as long as the user selects 1 to continue.
		
		//User sees this after selecting a number asides 1 when asked to continue. Scanner is closed to prevent data leaks
		System.out.println("Exiting the program. Goodbye!");
		scanner.close();  
		
		}
	}



//Do while used here as the code will keep running provided user selects 1 to continue, which meets the 'while' condition
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
