package com.bptn.course._wk2_06_teachback_static_method;

public class MainVehicle {
	
	    public static void main(String[] args) {
	       new Vehicle(); // Create first instance
	        new Vehicle(); // Create second instance
	       // Create third instance
	        
	        
	     // Output: Current number of vehicles: 3
	        System.out.println("Current number of vehicles: " + Vehicle.getCount()); 
	    }

}
