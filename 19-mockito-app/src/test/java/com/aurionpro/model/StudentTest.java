package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	
	IStudentService studentService;
	Student student;
	
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
		
	}

	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getTotalMarks()).thenReturn(650.0);
		Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10);
		assertEquals(65, student.calculatePercentage());
	}

}
