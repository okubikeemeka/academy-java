package com.bptn.course._wk2_01_classes_and_objects;

class SalesDepartment extends Department {


	
	private double totalSalesAmount;
	
	public SalesDepartment (String deptName, int noOfEmployees, double totalSalesAmount) {
	super(deptName, noOfEmployees);
	this.totalSalesAmount = totalSalesAmount;
	
}
}