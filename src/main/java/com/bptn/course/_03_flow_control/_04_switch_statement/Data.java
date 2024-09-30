package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		//double billAmount = 0.0;
		
			System.out.println("welcome to the mobile data");
			System.out.println("Please select plan: ");
			System.out.println("1. 1G - $10");
			System.out.println("2. 5G - $30");
			System.out.println("3. 10G - $50");
			System.out.println("4. unlimited - $70");
			System.out.println("5. Exit");
			
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1: System.out.println("You have selected 1G, the total cost is $10");
						break;
				case 2: System.out.println("You have selected 5G, the total cost is $30");
						break;
				case 3: System.out.println("You have selected 10G, the total cost is $50");
						break;
				case 4: System.out.println("You have selected unlimited, the total cost is $70"); 
						break;
				case 5: System.out.println("Thank you for stopping by!");
						break;
				default:System.out.println("Invalid Choice!");
			}
         scanner.close();
	}
		
}  


