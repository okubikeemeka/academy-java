package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class ifElseStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter any integer value: ");
		
		int num = scanner.nextInt();
		//If statements can be used with logical operators like &&, !, ||
		if (num % 2 ==0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		
		scanner.close();
	}
}