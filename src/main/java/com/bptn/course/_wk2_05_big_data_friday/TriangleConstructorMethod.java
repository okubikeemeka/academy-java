package com.bptn.course._wk2_05_big_data_friday;

   public class TriangleConstructorMethod {
	 int a, b, c, base, height;
	  
	  public TriangleConstructorMethod (int a, int b, int c, int base, int height) {
		  this.a = a;
		  this.b = b;
		  this.c = c;
		  this.base = base;
		  this.height = height;
	  }
	  
		//Method for perimeterCalculator
		
		public int perimeterCalculator () {	
		return  a + b + c;
		
		}
		
		//Method for areaCalculator
		public int areaCalculator () {
		return  (base * height) / 2;
		}
		
		//Static method to call the class using an object of the class
		public static void main (String[]args){

			TriangleConstructorMethod object = new TriangleConstructorMethod (7, 10, 35, 7, 10);

	       int perimeter = object.perimeterCalculator();
	       int area = object.areaCalculator();

	       System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
	   }
	}       

	

      