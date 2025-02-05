package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operation;
	
	@BeforeEach
	void init() {
		operation = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Finished");
	}
	

	@Test
	void testAddition() {		
		assertEquals(30, operation.addition(10, 20), "Must Perform addition");
	}
	
	@Test
	void testSubtraction() {		
		assertEquals(-10, operation.subtraction(10, 20));
	}
	
	@Test
	void testMultiplication() {		
		assertEquals(200, operation.multiplication(10, 20));
	}
	
	@Test
	void testDivision() {		
		assertEquals(2, operation.division(20, 10));
		
		assertThrows(ArithmeticException.class, ()->operation.division(10, 0), "Arithmetic exception expected");
	}
	
	@Test
	void testSquareOfArrayElements()
	{
		int[] squares = {25, 36, 49};
		int[] numbers = {5, 6, 7};
		
		assertArrayEquals(squares, operation.squareOfArrayElements(numbers));
	}
	
	@Test
	void testIsEven() {
		assertTrue(operation.isEven(6));
		assertFalse(operation.isEven(7));
	}

}
