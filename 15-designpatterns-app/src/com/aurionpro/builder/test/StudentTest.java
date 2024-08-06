package com.aurionpro.builder.test;

import com.aurionpro.builder.model.Student;
import com.aurionpro.builder.model.StudentBuilder;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student student = new StudentBuilder().setName("Sarthak")
											  .setRollNumber(1)
											  .getStudent();
		
		System.out.println(student);
	}

}
