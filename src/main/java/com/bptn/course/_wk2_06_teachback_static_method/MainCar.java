package com.bptn.course._wk2_06_teachback_static_method;

public class MainCar {

		        public static void main(String[] args) {
		        // Create instances of Car
		        Car Car1 = new Car("Red", "Corolla");
		        Car Car2 = new Car("Blue", "Venza");
		        //Car Car3 = new Car("White", "Tundra");

		        //CONCEPT 1: STATIC METHODS CANNOT CALL NON-STATIC METHODS DIRECTLY. SHOW WHY
		        // Call the non-static method and access variables via the class object
		        Car1.displayDetails(1); 
		        Car2.displayDetails(2); 
		       

		        // Call the static method using the class name
		        //Doesn't reference objects. 
		        Car.displayTotalCars(); // Valid call! 
		        
		        //Car.displayDetails(); // Invalid call! Why?
		        
		        
		        
		       Car1.displayDetails(1);
		        
		    }
		
	}


