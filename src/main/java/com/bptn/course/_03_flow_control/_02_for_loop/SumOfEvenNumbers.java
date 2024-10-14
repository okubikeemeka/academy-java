package com.bptn.course._03_flow_control._02_for_loop;
   
//Program that calculates sum of even numbers between 1 and 50

public class SumOfEvenNumbers {

	public static void main(String[] args) {
	
  //int sum = 0;
		
		//Use for loop
  for (int i = 1; i <= 50; i++) {
	  
	if (i % 2 == 0) {
	 // sum = sum + i;  
		System.out.println(i);		
  }
  }
	//System.out.println("Sum of even numbers between 1 and 50: " + sum);	
		
	}

}
