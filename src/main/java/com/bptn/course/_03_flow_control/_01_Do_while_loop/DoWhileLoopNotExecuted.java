package com.bptn.course._03_flow_control._01_Do_while_loop;

public class DoWhileLoopNotExecuted {

	public static void main(String[] args) {
		
		        int i = 6;  // Initialize the counter to a value greater than 5

		        // Do-while loop that executes once and then evaluates the condition
		        System.out.println("Do-While Loop (Executed Once):");
		        do {
		            System.out.println(i);  // This will execute once
		            i++;  // Incrementing i
		        } while (i <= 5);  // This condition will be false after the first execution

		        System.out.println("The do-while loop executed once, but the condition was false.");
		    }
		

	}


