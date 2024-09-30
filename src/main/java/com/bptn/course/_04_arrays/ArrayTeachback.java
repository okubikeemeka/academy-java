package com.bptn.course._04_arrays;

import java.util.Arrays;

public class ArrayTeachback {

	public static void main(String[] args) {
	
   //Declaring an Array called 'position'
   // Note Array type and name	
   //int score for single integer variables		
	int[] position;
	
	//Creating an Array (use of 'new' operator)
	// int[] position = new int[5] declares and creates at the same time
	// 5 specifies the size of this array (5 elements). No specific values
	position = new int[5];
	
	//Initialize the arrays. 
	// int[] position = {5,8,3,2,9}; initializes this too at the same time
	position[0] = 5;
	position[1] = 8;
	position[2] = 3;
	position[3] = 2;
	position[4] = 9;
	
	//Accessing the arrays. Note first position always starts at index '0'
	// This helps us print elements individually without a loop
	System.out.println("Array element1: " + position[0]);
	System.out.println("Array element2: " + position[1]);
	System.out.println("Array element3: " + position[2]);
	System.out.println("Array element4: " + position[3]);
	System.out.println("Array element5: " + position[4]);
	
   //Size of an Array
	System.out.println("Size of the array: " +position.length);
		
	//Assigning a new value to an array
	 position[1] = 12;
	System.out.println("Updated position [1]: " +position [1]);
	
	//Call next method from main method to see the output
	anotherOption();
	}
	
	public static void anotherOption () {
	//Use of Arrays.toString. Note the importation of java.util.Arrays to enable use	
	int [] position = {7,4,1,6,0};
	System.out.println("Array in anotherOption: " +Arrays.toString (position));
	
	//Using indexToPrint as an alternative to loop to print element at specific indices
	
	int indexToPrint = 2;
	System.out.println("Element in index 2 of anotherOption: " + (position[indexToPrint]));	
	
	//Using loop to print element at specific indices
	System.out.println("Array in anotherOption: ");
    for (int i = 0; i < position.length; i++) {
        System.out.println("Element at index " + i + ": " + position[i]);
    }
		
	

	
	/*System.out.println("Printing specific elements at specified indices:");
    for (int i = 0; i < specificIndices.length; i++) {
        int index = specificIndices[i];
        System.out.println("Element at index " + index + ": " + position[index]);
    }*/
}
}
