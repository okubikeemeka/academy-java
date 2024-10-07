package com.bptn.course._wk2_01_classes_and_objects;

class TechDepartment extends Department {


      private double totalPurchaseAmount;

    public TechDepartment (String deptName, int noOfEmployees, double totalPurchaseAmount) {
	super(deptName, noOfEmployees);
	this.totalPurchaseAmount = totalPurchaseAmount;

	
	
}
}