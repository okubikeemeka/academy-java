package com.bptn.course._wk2_06_teachback_static_method;

    //CONCEPT 2: STATIC METHODS CAN ACCESS STATIC VARIABLES

	public class Vehicle {
	    // Static variable to count instances
	    private static int count = 0;

	    // Constructor
	    public Vehicle() {
	    	
	    	// Increment count whenever a new instance is created
	        count++; 
	    }

	    // Static method to get the current count
	    public static int getCount() {
	        return count;
	        
	        
	    }
	}


