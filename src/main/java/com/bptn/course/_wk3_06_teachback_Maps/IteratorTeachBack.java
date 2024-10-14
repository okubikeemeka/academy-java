package com.bptn.course._wk3_06_teachback_Maps;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTeachBack {
	public static void main(String[] args) {

		// Creating a Map of Canadian provinces and their populations (in millions)
		Map<String, Double> provinces = new HashMap<>();
		provinces.put("Ontario", 14.5);
		provinces.put("Quebec", 8.5);
		provinces.put("British Columbia", 5.1);
		provinces.put("Alberta", 4.4);
		provinces.put("Manitoba", 1.4);

		// Using entrySet() to iterate over key-value pairs
		System.out.println("Iterating over provinces using entrySet():");
		Iterator<Map.Entry<String, Double>> entryIt = provinces.entrySet().iterator();
		try {
			while (entryIt.hasNext()) {
				Map.Entry<String, Double> entry = entryIt.next();
				// Let's attempt to add a new province during iteration
				provinces.put("Yukon", 0.5);
				// provinces.remove("Ontario", 14.5);
				System.out.println(entry.getKey() + ": " + entry.getValue() + " million");
			}
			// Confirming an exception
		} catch (ConcurrentModificationException e) {
			System.out.println("ConcurrentModificationException occurred during map modification");
		}
		System.out.println(provinces);

		// Using keySet() to iterate over keys
		System.out.println("\nIterating over provinces using keySet():");
		Iterator<String> keyIt = provinces.keySet().iterator();
		while (keyIt.hasNext()) {
			String province = keyIt.next();
			System.out.println("Province: " + province);
		}

		// Using values() to iterate over values
		System.out.println("\nIterating over populations using values():");
		Iterator<Double> valuesIt = provinces.values().iterator();
		while (valuesIt.hasNext()) {
			Double population = valuesIt.next();
			System.out.println(population + " million");

		}
	}
}
