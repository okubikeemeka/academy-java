package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchStatement {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			
			System.out.println("welcome to the menu");
			System.out.println("Please choose an item from the list: ");
			System.out.println("1. coke - $2.99");
			System.out.println("2. pepsi - $8.99");
			System.out.println("3. juice - $9.99");
			System.out.println("4. water - $6.99");
			System.out.println("5. Exit");
			
			int choice;
			choice = scanner.nextInt();
			
			System.out.println("Enter amt");
			double amt;
			amt = scanner.nextDouble();
			
			switch(choice) {
				case 1: if(amt>2.99) {
					System.out.println("change is: "+ (amt - 2.99));
				} else if(amt==2.99){
					System.out.println("Take your coke");
				} else {System.out.println("Try again");}
						break;
				case 2: if(amt>8.99) {
					System.out.println("change is: "+ (amt - 8.99));
				} else if(amt==8.99){
					System.out.println("Take your pepsi");
				} else {System.out.println("Try again");}
						break;
				
				case 5: System.out.println("Thank you for stopping by");
						break;
				default:System.out.println("Invalid Choice!");
			}
			scanner.close();
	}
		}
