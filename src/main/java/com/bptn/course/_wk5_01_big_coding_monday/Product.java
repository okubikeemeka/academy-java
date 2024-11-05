package com.bptn.course._wk5_01_big_coding_monday;

import java.util.ArrayList;
import java.util.List;

public class Product {

	// Create your instance variables
	int id;
	String name;
	double price;

	// Create a constructor to initialize the product properties
	// It does this using 'this' keyword
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Create a static method "countProducts"
	public static long countProducts(List<Product> productsList) {
		// Stream method on productsList to get a stream of Product objects
		return productsList.stream()

				// Filter products based on the price and get the count of products
				.filter(productList -> productList.price < 30000).count();

	}

	public static void main(String[] args) {
		// Create a list of products
		List<Product> productsList = new ArrayList<Product>();

		// Add products to the list
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));

		// Call "countProducts" method and hold return type in "count" variable
		long count = Product.countProducts(productsList);

		// Print the count of products whose price is less than 30000
		System.out.println("Number of products with price less than 30000: " + count);
	}
}
/*
 * This task involved the use of Java Streams and lambda expressions to perform
 * filter and count operations with a specified condition (price < 30000). Here,
 * we can see how the class "Product" is able to call the "countProducts" method
 * directly as it's static. Line 25 also demonstrates method chaining, combining
 * both interediate and terminal operations. What's new? Java Streams is still
 * new to me and I was able to gain more understanding on how it can make
 * processes like filtering and counting less complex, with easy to understand
 * and readable codes. Methods can be chained and used to manipulate
 * collections. Along the line, I ran into issues on the data type to be used
 * for the "countProducts" method as I was confused on the use of "int" or
 * "long". In the future, I will always ensure to choose the appropriate data
 * type irrespective of how tricky the situation might be.
 */