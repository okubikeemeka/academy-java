package com.bptn.course._03_flow_control._03_if_statement;

public class IfStatementsAndLogicalOperators {
	public static void main(String[] args) {
        // Example of logical AND (&&)
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }

        // Example of logical OR (||)
        boolean isSunny = true;
        boolean isWeekend = false;

        if (isSunny || isWeekend) {
            System.out.println("You can go out.");
        } else {
            System.out.println("You should stay indoors.");
        }

        // Example of logical NOT (!)
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("You don't need an umbrella.");
        } else {
            System.out.println("You need an umbrella.");
        }
    }
}
	
	


