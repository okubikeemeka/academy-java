package com.bptn.course._wk3_03_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {

	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		// Print the size of the map
		System.out.println("Map size: " + map.size());

		// Use a for loop to print the key-value pairs in the map
		for (Map.Entry<String, Integer> mapentry : map.entrySet()) {
			System.out.println("Key: " + mapentry.getKey() + ", Value: " + mapentry.getValue());
		}

		// Use get() method to get the value of key "A"
		map.get("A");
		System.out.println("Value of key 'A': " + map.get("A"));

		// use put() method to add a new key-value pair to the map
		map.put("D", 4);
		System.out.println("Map after adding a new key-value pair: ");
		for (Map.Entry<String, Integer> mapentry : map.entrySet()) {
			System.out.println("Key: " + mapentry.getKey() + ", Value: " + mapentry.getValue());
		}

		// Use the containsKey() method to check if the key "C" exists in the map

		// map.containsKey("C"); {
		if (map.containsKey("C")) {
			System.out.println("Key 'C' exists in the map");
		} else {
			System.out.println("Key 'C' does not exist in the map");
		}
	}

}
