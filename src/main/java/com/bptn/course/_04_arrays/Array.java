package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
	//Initialize array of choice with six integer values		
	int [] Array1 = {1,4,3,6,9,2};	
		
	//Print third and fifth elements 
	System.out.println("Third element: " + Array1 [2]);
	System.out.println("Fifth element: " + Array1 [4]);
		
	//Update first element to 30
	Array1[0] = 30;
	System.out.println("Updated first element: " + Array1 [0]);
	
	//Update the last element using 'length' without directly referencing the index
	Array1[Array1.length-1] = 130;
	System.out.println("Updated last element: " +Array1[Array1.length-1] );
		
	//Print the elements of the array one by one using for loop
	for (int i = 0; i < Array1.length; i++) {
		System.out.println("Elements at index: " + i + " is " + Array1[i]); 
	}
		
    //Print the elements of the array in reverse one by one using for loop
	for (int i = Array1.length-1; i >= 0; i--) {
	 System.out.println("Elements at index: " + i + " is " + Array1[i]);	
	}
		
	//Print the elements of the array using for each loop
	for (int element: Array1) {
		System.out.println(element);{
	}
		
	}	
		
	//Print all the values of the Array
	System.out.println(Arrays.toString(Array1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
