package com.bptn.course._wk2_cars;

public class CarPublic {
	
	// Main method to create an object of the Car class and call printCarDetails()
		public static void main(String args[]) {
			
		    // Create new Car objects with specific values for color, brand, and price	
	        Car car1 = new Car("white", "BMW", 70000);
	        Car car2 = new Car("Red", "Audi", 80000);
	        
	        // Call the printCarDetails() method from the parent class to print the car's details
	        car1.printCarDetails();
	        car2.printCarDetails();
	    }
	}


