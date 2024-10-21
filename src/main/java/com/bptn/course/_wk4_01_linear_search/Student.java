package com.bptn.course._wk4_01_linear_search;

public class Student {
	private int rollNumber;
	private String name;

	// Create parameterized constructor
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	// Create getter method for roll number
	// variable which returns rollNumber
	public int getRollNumber() {
		return rollNumber;
	}

	// Create getter method for name variable which
	// returns name
	public String getName() {
		return name;
	}
}
