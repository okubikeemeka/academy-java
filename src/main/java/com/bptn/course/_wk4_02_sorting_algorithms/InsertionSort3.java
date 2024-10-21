package com.bptn.course._wk4_02_sorting_algorithms;

import java.util.Arrays;

public class InsertionSort3 {
	public static void insertionSort(int[] elements) {
		for (int j = 1; j < elements.length; j++) {
			int temp = elements[j];
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 86, -20, 14, 40 };
		System.out.println(Arrays.toString(arr1));
		insertionSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}

/*
 * How to Spot Insertion Sort in Code To identify an insertion sort, look for
 * the following: An outer for loop that starts at one and loops through the
 * entire array (see line 5 above) Storing the element value at the outer loop
 * index in temp (see line 6) Setting the possible index to the outer loop index
 * (see line 7) An inner while loop that loops while the possible index is
 * greater than 0 and the value in temp is less than the value at the possible
 * index minus one (see line 8) Set the value at the possible index to the one
 * to the left of it (the one at possible index minus one) (see line 9)
 * Decrement the possible index (subtract one from it) (see line 10) When the
 * while loop ends, set the value at the possible index to temp (see line 12)
 */