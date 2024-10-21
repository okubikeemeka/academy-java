package com.bptn.course._wk4_02_sorting_algorithms;

public class InsertionSort2 {

	public void methodA(double[] arr) {
		for (int i = 1; i < arr.length; i++) {
			double val = arr[i];
			int j = i;
			while (j > 0 && val < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = val;
		}
	}
}

//In the code, an array is being iterated from the second element (index 1) to the last element, 
//and each element is inserted into its correct position by shifting larger elements to the right. 
