package com.bptn.course._wk2_cars;

 class Car {
	  // Declare private instance variables
	  private String color;
	  private String brand;
	  private int price;
	 
	  // Constructor to initialize the car's attributes (color, brand, price)
	  public Car(String color, String brand, int price) {
	    this.color = color;
	    this.brand = brand;
	    this.price = price;
	  }

	// Public method that calls the private print() method to display car details
	  public void printCarDetails() {
	    this.print();  
	  }
	 
	  // Private method to print the car's details (color, brand, and price)
	  private void print() {
	  System.out.println("Car{" +
	          "color='" + color + '\''+
	          ", brand='" + brand + '\'' +
	          ", price=" + (int) price +
	          '}');  
	  
	  /*private void print () {
	  System.out.println("Car{color='" + color + "', brand='" + brand + "', price=" + (int) price + '}'); */
	}
 }	 
 
 	  
	  
	 
	  

