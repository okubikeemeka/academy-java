package com.bptn.course._wk5_01_big_coding_monday;

public class InsertionSort {
	// This method sorts an array in ascending order using insertion sort algorithm
	public static void insertionSort(int[] arr) {

		// Check if the array is null or has less than 1 element
		if (arr == null || arr.length < 1) {
			// Return if the array is null or has less than 1 element
			return;
		}
		// Loop through the array starting from index 1 to length of the array
		// We start at index 1 as the first element is considered sorted in insertion
		// sort
		for (int i = 1; i < arr.length; i++) {
			// Store the current element
			int current = arr[i];
			// Initialize j with i - 1
			int j = i - 1;
			// Inner loop to compare current element with elements before it in the array
			while (j >= 0 && current < arr[j]) {
				// Shift the element to the right
				arr[j + 1] = arr[j];
				// Decrement j to compare with next element
				j--;
			}
			// Insert the current element at its correct position
			arr[j + 1] = current;
			// current = arr [j+1];
		}
	}

	// Do not modify below code
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 3, 4, 1, -2, 4, 8 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
 * This task has to do with insertion sort implementation, where array is sorted
 * starting from the second element, shifting larger elements to the right and
 * inserting each element in its correct position. For me, what's new is
 * learning how to manage element shifting within a loop to achieve sorting. I
 * ran into some issues along the way. I had errors due to loop boundary
 * (initially used i < arr.length-1) and an element assignment was also
 * incorrect I wrote current = arr [j+1] instead of arr[j + 1] = current; which
 * looked same but gave me errors. To avoid same mistake in the future, I will
 * pay more attention to loop boundaries and element manipulation when sorting
 * arrays
 */