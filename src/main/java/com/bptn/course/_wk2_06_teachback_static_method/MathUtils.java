package com.bptn.course._wk2_06_teachback_static_method;

public class MathUtils {
	
	// Method to calculate some MathUtils
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    
}

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    } 
    return true;

}

// Static method to demonstrate usage of utility methods
     public static void demonstrate() {
    System.out.println("Factorial of 6: " + factorial(6)); // 120
    System.out.println("Is 13 prime? " + isPrime(13)); // true

}

}
