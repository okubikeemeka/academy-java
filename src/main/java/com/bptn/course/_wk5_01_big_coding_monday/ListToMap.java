package com.bptn.course._wk5_01_big_coding_monday;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	// create static method "convertStudentListToMap"
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {

		return students.stream().collect(Collectors.toMap(Student::getId, student -> student));

	}

	// Complete the main method
	public static void main(String[] args) {

		// Create a list of students
		ArrayList<Student> students = new ArrayList<>();

		// add student objects to this list
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));

		// Call "convertStudentListToMap" method and hold the returned value in
		// "studentMap" variable.
		Map<Integer, Student> studentMap = ListToMap.convertStudentListToMap(students);

		// Print the map
		System.out.println("Students Map: " + studentMap);
	}
}

/*
 * This task required the use of Java Streams to convert a list of student
 * objects into a map, using each student's ID as the key and student objects as
 * the values. We can see how the class was able to call the static method
 * directly and also, how flexible the "Collectors" are in different conversion
 * types for Streams. In this task, it coverted to map, while I have also seen
 * conversion to Lists in other examples. What's new? From this exercise,
 * learning to use the Collectors.toMap method with lambda expressions for
 * converting a list to a map is entirely new to me. Along the line, I
 * encountered issues regarding the return statement in the
 * "convertStudentListToMap" method as this instruction was confusing: Store and
 * return the resulting Map object in a variable called studentMap.
 */
