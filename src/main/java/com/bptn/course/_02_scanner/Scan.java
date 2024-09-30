package com.bptn.course._02_scanner;
import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);	
	
	/*System.out.println("What's your name? ");
	String name = scanner.nextLine();*/
		
		System.out.println("What's your first name?");
		String name = scanner.nextLine();
		
		System.out.println("What's your age?");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("What's your senior quote?");
		String quote = scanner.nextLine();
		
		System.out.print("Your name is " + name + ", your age is " + age );
		System.out.println(" and your senior quote is: " + quote);

	
	scanner.close();	
		
	}
}
