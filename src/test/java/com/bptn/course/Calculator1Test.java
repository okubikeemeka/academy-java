package com.bptn.course;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bptn.course._wk4_01_calculator_junit.Calculator1;

public class Calculator1Test {

	// Initialise the object
	private Calculator1 myCal;
	int[] choice = { 1, 2, 3, 4, 5 };

	@BeforeEach
	void setUp() {
		myCal = new Calculator1();
	}

	// Provide the data
	@Test
	void testAdd() {
		// Run the test -> compare against the expected output
		assertEquals(15, myCal.add(5, 10), "5 +10 should equal 15");
	}

	@Test
	void testSubtract() {
		assertEquals(-5, myCal.subtract(5, 10), "5 -10 should equal -5");
	}

	@Test
	void testMultiply() {
		assertEquals(50, myCal.multiply(5, 10), "5 *10 should equal 50");
		assertEquals(40, myCal.multiply(8, 5), "8 *4 should equal 40");
		assertEquals(30, myCal.multiply(6, 5), "6 *5 should equal 30");
		assertEquals(20, myCal.multiply(5, 4), "5 *4 should equal 20");
	}

	@Test
	void testDivideByZero() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			myCal.divide(10, 0);
		});
		assertEquals("Cannot divide by zero.", exception.getMessage());
	}

}