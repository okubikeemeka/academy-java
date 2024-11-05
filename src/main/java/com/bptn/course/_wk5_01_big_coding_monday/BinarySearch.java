package com.bptn.course._wk5_01_big_coding_monday;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search
	// for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		Arrays.sort(arr);

		// Initialize low and high pointers for the start and end of the array
		// respectively
		int low = 0;
		int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low
		// pointer
		while (high >= low) {
			// Calculate the middle index

			int mid = (low + high) / 2;

			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
				return mid;
			}
			// If the element at the middle index is less than the key, move the low pointer
			// to the middle + 1
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			// If the element at the middle index is greater than the key, move the high
			// pointer to the middle - 1
			else {
				high = mid - 1;
			}
		}
		// If the key is not found, return -1
		return -1;

	}

	// Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}

/*
 * This question involved implementing a binary search to find an element's
 * index in a sorted array. Sorting the array is crucial as binary search can
 * only be performed on sorted arrays. The use of pointers (low, mid and high)
 * helped narrow down the search range and mid is particularly important in the
 * "Divide and Conquer" approach which splits the array into 2 halves. What's
 * new? I gained an understanding of how to adjust the low and high pointers
 * based on comparisons with the middle element. Along the line, I ran into
 * issues that had to do with comparing mid directly to key instead of the
 * element at the mid index. The key lesson is to always ensure that elements at
 * the relevant indices are used in comparisons rather than just the indexes.=
 * Eg: (arr[mid] == key) instead of (mid == key) as the latter will lead to
 * wrong result.
 * 
 */
