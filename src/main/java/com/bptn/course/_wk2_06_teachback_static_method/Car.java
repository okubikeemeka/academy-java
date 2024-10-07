package com.bptn.course._wk2_06_teachback_static_method;

public class Car {
	
	    // Instance variable (non-static)
	    private String color;
	    private String model;

	    // Static variable
	    public static int numberOfCars = 0;

	    // Use constructor to initialize some details and increment car count
	    public Car(String color, String model) {
	        this.color = color;
	        this.model = model;
	        numberOfCars++; // Increment the static variable for each new instance
	    }

	    // Non-static method to display car details
	    public void displayDetails(int carNum) {
	        System.out.println("Car " + carNum + " details: " + color + " " + model);
	       
	    }

	    
	    //Increases with new car object created
	    //WHY CAN'T this. BE USED HERE?
	    public static void displayTotalCars() {
	        System.out.println("Total number of cars: " + numberOfCars);
	        
	        
	    }
	}



	
	
	
	
	
	
	
	
	
	
	
	


