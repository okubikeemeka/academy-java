package com.bptn.course._wk3_06_teachback_Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapsForEachLoops {

	public static void main(String[] args) {

		// Creating a Map of Canadian provinces and their populations (in millions)
		// The print statement for this will demonstrate differences in the maps despite
		// the overall similarities. Sorting occurs here.
		Map<String, Double> provinces = new TreeMap<>();
		provinces.put("Ontario", 14.5); //
		provinces.put("Quebec", 8.5);
		provinces.put("British Columbia", 5.1);
		provinces.put("Alberta", 4.4);
		provinces.put("Manitoba", null);
		// provinces.put(null, null); // Demonstrates that it can't hold null key

		// This methods will show how to iterate through a map using for each
		// loop
		// First method: Iterating Over Key-Value Pairs Using entrySet()
		// The remaining methods are same and have been demonstrated in HashMaps
		System.out.println("Provinces and their populations (entrySet):");
		for (Map.Entry<String, Double> entry : provinces.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " million");
		}

		System.out.println();
	}

}
