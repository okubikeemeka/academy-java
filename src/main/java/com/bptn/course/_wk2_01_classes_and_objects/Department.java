package com.bptn.course._wk2_01_classes_and_objects;

class Department {
	
	private String deptName;
	private int noOfEmployees;
	
	
	public Department (String deptName, int noOfEmployees) {
		this.deptName = deptName;
		this.noOfEmployees = noOfEmployees;
	}	
		public void DeptInfo() {
			System.out.println("Department name: " + deptName);
			System.out.println("NoOfEmployees: " + noOfEmployees);
		}


}
	
