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

import java.util.HashMap;
import java.util.Map;

public class StudentScoreAggregator {

	public static double calculateAverage(Student student, Map<String, Double> scores) {

		double sum = 0.0;

		for (Double score : scores.values()) {
			sum += score;
		}

		double average = sum / scores.size();

		return average;
	}

	public static void main(String[] args) {
		Map<String, Double> scores = new HashMap<>();
		scores.put("course1", 90.0);
		scores.put("course2", 75.5);
		scores.put("course3", 98.3);

		Student s1 = new Student("Student One", scores);

		System.out.printf("The average score is: %.2f", calculateAverage(s1, scores));

	}

}
