package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	
	AreaCalculator calculator;
	
	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test finished");
	}

	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5), "Should give area of circle");
	}

	@Test
	void testCalculateAreaOfRectangle() {
		assertEquals(200, calculator.calculateAreaOfRectangle(10,20), "Should give area of rectangle");
	}

	@Test
	void testCalculateAreaOfTriangle() {
		assertEquals(100, calculator.calculateAreaOfTriangle(10,20), "Should give area of triangle");
	}

}
