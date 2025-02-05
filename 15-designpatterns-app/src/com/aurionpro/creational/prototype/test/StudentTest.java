package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.IPrototype;
import com.aurionpro.creational.prototype.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		IPrototype prototype = new Student("VVHS" , 8, 'J', 14, 0, null);
		
		System.out.println(prototype);
		
		Student student1 = (Student)prototype.getClone();
		
		System.out.println(student1.getClone());
				
		student1.setRollNumber(1);
		student1.setName("Sarthak");
		
		System.out.println(student1);
		
	}

}
