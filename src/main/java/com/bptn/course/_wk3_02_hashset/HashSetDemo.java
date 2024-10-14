package com.bptn.course._wk3_02_hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> mySet = new HashSet<>();

		// Stores only unique elements, no duplicates
		// Elements are unordered
		mySet.add("Toronto");
		mySet.add("Vancouver");
		mySet.add("Hamilton");
		mySet.add("Hamilton");
		mySet.add("Hamilton");
		mySet.add("Hamilton");

		System.out.println(mySet);

		System.out.println(mySet.contains("Toronto"));

		mySet.remove("Hamilton");
		System.out.println(mySet);
	}

}
