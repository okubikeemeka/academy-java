package com.bptn.course._wk4_01_linear_search;

import java.util.ArrayList;

public class ArrayListSearcher {
	/**
	 * Finds the index of a value in an ArrayList of integers.
	 * 
	 * @param elements an array containing the items to be searched.
	 * @param target   the item to be found in elements.
	 * @return an index of target in elements if found; -1 otherwise.
	 */
	public static int sequentialSearch(ArrayList<Integer> elements, int target) {
		for (int j = 0; j < elements.size(); j++) {
			if (elements.get(j) == target) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(-2);
		numList.add(9);
		numList.add(38);
		numList.add(-23);
		System.out.println("Tests of sequentialSearch");
		System.out.println(sequentialSearch(numList, 3));
		System.out.println(sequentialSearch(numList, 9));
		System.out.println(sequentialSearch(numList, -23));
		System.out.println(sequentialSearch(numList, 99));
	}
}
