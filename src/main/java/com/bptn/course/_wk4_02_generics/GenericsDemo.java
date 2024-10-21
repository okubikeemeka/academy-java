package com.bptn.course._wk4_02_generics;

public class GenericsDemo {

	public static <T> void findMaxGeneric(T num1, T num2) {
		System.out.println("You provided the following data: " + num1 + ",  " + num2);
	}

	// Find maximum between two numbers
	public static int findMax(int num1, int num2) {
		// findMaxGeneric (num1, num2); //Static method calling another. Now find max
		// can compute Max and also print
//		if(condition) {
//			//what if true
//		} else {
//			//what if false
//		}
//		
//		(condition) ? what if true : what if false;

		return (num1 > num2) ? num1 : num2;
	}

	public static void main(String[] args) {
		// See how different data types are passed into the same method and it works
		System.out.println("Max of 10 and 20: " + findMax(10, 20)); // method called directly by its name. No need to
																	// create an instance of GenericsDemo
		findMaxGeneric(10, 20); // method called directly by its name
		findMaxGeneric(10.6, 20.8); // method called directly by its name
		findMaxGeneric("Hi", "Hello"); // method called directly by its name
	}

}
