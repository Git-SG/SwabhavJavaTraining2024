package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Circle;

public class CircleTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius1 = scanner.nextDouble();
		Circle circle1 = new Circle(radius1);
//		circle1.setRadius(radius);
		
		System.out.println("Radius: " + circle1.getRadius());
		
		System.out.println("The area of the circle is " + circle1.calculateArea(radius1));
	}

}
