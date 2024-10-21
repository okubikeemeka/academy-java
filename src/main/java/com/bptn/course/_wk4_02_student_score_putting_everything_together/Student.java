package com.bptn.course._wk4_02_student_score_putting_everything_together;

/*You are building a system to store and manage students' scores
across various subjects. Each student has a name and a list of
subjects with associated scores. You need to group students by
their names and calculate their average score.

Task: Write a method that takes a list of students (each student
having multiple subjects and scores) and returns a Map<String,
Double> where the key is the student's name and the value is their
average score.

Hint: Use a HashMap to group by student name and calculate
averages. */

import java.util.Map;

public class Student {

	private String name;
	private Map<String, Double> subjectScores;

	public Student(String name, Map<String, Double> subjectScores) {
		this.name = name;
		this.subjectScores = subjectScores;
	}

}
