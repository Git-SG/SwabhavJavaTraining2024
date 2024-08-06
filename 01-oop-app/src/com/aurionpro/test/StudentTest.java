package com.aurionpro.test;

import com.aurionpro.model.Student;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Roll number: ");
		int rollNumber1 = scanner.nextInt();
//		student1.setRollNumber(rollNumber1);
		
		System.out.println("Enter Name: ");
		String name1 = scanner.next();
//		student1.setName(name1);
		
		System.out.println("Enter Age: ");
		int age1 = scanner.nextInt();
//		student1.setAge(age1);
		
		System.out.println("Enter Percentage: ");
		double percentage1 = scanner.nextDouble();
//		student1.setPercentage(percentage1);
		
		Student student1 = new Student(rollNumber1, name1, age1, percentage1);
		
		System.out.println("Roll number : " + student1.getRollNumber());
		System.out.println("Name : " + student1.getName());
		System.out.println("Age : " + student1.getAge());
		System.out.println("Percentage : " + student1.getPercentage());
		System.out.println("Grade :" + student1.showGrade(percentage1));
		
	}

}
