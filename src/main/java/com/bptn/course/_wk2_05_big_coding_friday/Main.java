package com.bptn.course._wk2_05_big_coding_friday;

public class Main {

	public static void main(String[] args) {
		// create an instance of Employee class and initialize it with salary = 100 and
		// hoursPerDay = 8
		Employee student = new Employee(100, 8);

		// Call the methods set to update salary and hoursPerDay from the Employee class
		student.setSalary(100);
		student.setHoursPerDay(8);

		// print the salary of the employee
		System.out.println(student.getSalary());
	}
}
