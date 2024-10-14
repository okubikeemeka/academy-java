package com.bptn.course._wk3_06_teachback_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapsForEachLoops {

	public static void main(String[] args) {

		// Creating a Map of Canadian provinces and their populations (in millions)
		// The print statement for this will demonstrate differences in the maps despite
		// the overall similarities
		Map<String, Double> provinces = new HashMap<>();
		provinces.put("Ontario", 14.5); // Key "Ontario" on the left , value (14.5) on the right.
		provinces.put("Quebec", 8.5);
		provinces.put("British Columbia", 5.1);
		provinces.put("Alberta", 4.4);
		provinces.put("Manitoba", 1.4);
		provinces.put("Alberta", 5.4);
		provinces.put("Alberta", 7.4);

		// The following methods will show how to iterate through a map using for each
		// loop
		// First method: Iterating Over Key-Value Pairs Using entrySet()
		System.out.println("Provinces and their populations (entrySet):");
		for (Map.Entry<String, Double> entry : provinces.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " million");
		}

		System.out.println();

		// Second method: Iterating Over Keys Using keySet()
		System.out.println("Provinces (keySet):");
		for (String province : provinces.keySet()) {
			System.out.println(province);
		}

		System.out.println();

		// Third method: Iterating Over Values Using values()
		System.out.println("Populations (values):");
		for (Double population : provinces.values()) {
			System.out.println(population + " million");
		}

		System.out.println();

		// Fourth method: Using a For-Each Loop with If Statements
		System.out.println("Provinces with populations greater than 5 million:");
		for (Map.Entry<String, Double> entry : provinces.entrySet()) {
			if (entry.getValue() > 5) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + " million");
			}
		}
	}

}
