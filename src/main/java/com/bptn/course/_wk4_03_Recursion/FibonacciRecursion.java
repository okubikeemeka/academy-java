package com.bptn.course._wk4_03_Recursion;

public class FibonacciRecursion {
	// Recursive method to calculate the nth Fibonacci number
	public static int calculateFibonacci(int n) {
		// Base case 1: Fibonacci(0) is 0
		if (n <= 0)
			return 0;
		// Base case 2: Fibonacci(1) is 1
		if (n == 1)
			return 1;

		// For other values of n, calculate Fibonacci(n) recursively

		// Calculate Fibonacci(n - 1) using recursion
		calculateFibonacci(n - 1);

		// Calculate Fibonacci(n - 2) using recursion
		calculateFibonacci(n - 2);

		// Calculate Fibonacci(n) by summing the above two values
		return n = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);

	}

	public static void main(String[] args) {
		System.out.println("First 10 Fibonacci Numbers:");

		// Loop to calculate and print the first 10 Fibonacci numbers
		for (int i = 0; i < 10; i++) {
			int result = calculateFibonacci(i);
			System.out.println("Fibonacci(" + i + ") = " + result);
		}
	}
}
