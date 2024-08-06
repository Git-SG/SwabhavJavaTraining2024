package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BoxTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Box box1 = new Box();
		
		System.out.println("BOX 1:");
		
		System.out.println("Enter width ");
		int width1 = scanner.nextInt();
		box1.setWidth(width1);
		System.out.println("Enter height ");
		int height1 = scanner.nextInt();
		box1.setHeight(height1);
		System.out.println("Enter depth ");
		int depth1 = scanner.nextInt();
		box1.setDepth(depth1);
		
		System.out.println("Width: " + box1.getWidth());
		System.out.println("Height: " + box1.getHeight());
		System.out.println("Depth: " + box1.getDepth());

		System.out.println("Area of Box 1 :" + box1.calculateVolume());
		
//		Box box2 = new Box();
//		
//		System.out.println("\nBOX 2: ");
//		
//		box2.display();
//		
//		box2.initialise(20, 30 , 40);
//		
//		System.out.println("\nAfter initialisation");
//		
//		box2.display();
//		
//		System.out.println("Area of Box 2: " + box2.calculateArea());
//		
	
		
	}

}
