package com.bptn.course._wk4_01_calculator_junit;

public class Calculator1 {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
