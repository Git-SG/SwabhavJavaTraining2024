package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.aurionpro.list.model.NameComparator;
import com.aurionpro.list.model.RollNumberComparator;
import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentComparator;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter number of elements to be added");
//		int numberOfElements = scanner.nextInt();
//		List<Student> students = new ArrayList<Student>();
//		
////		for(int i = 0; i < numberOfElements; i++) {
////			
////			System.out.println("Enter roll number");
////			int rollNumber = scanner.nextInt();
////			System.out.println("Enter name");
////			String name = scanner.next();
////			System.out.println("Enter percentage");
////			double percentage = scanner.nextDouble();
////			
////			students.add(new Student(rollNumber, name, percentage));
////			
////		}
////		
////		for(Student student: students)
////			System.out.println(student);
		
		
		
		
		
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "Sarthak", 100));
		students.add(new Student(2, "Shashikant", 80.23));
		students.add(new Student(3, "Gangan", 90.59));		
		
		printList(students);
		Collections.sort(students, new RollNumberComparator());
		
		printList(students);
		
		System.out.println("Soted name wise");
		
		Collections.sort(students, new StudentComparator.RollNumberComparator());
		
		printList(students);
		
		
		
//		
//		System.out.println("\nUsing iterator");
//		Iterator<Student> studentIterator = students.iterator();
//		while(studentIterator.hasNext()) 
//			System.out.println(studentIterator.next());
//		
//		System.out.println("\nUsing List Iterator hasNext");
//		ListIterator<Student> studentListIterator = students.listIterator();
//		while(studentListIterator.hasNext())
//			System.out.println(studentListIterator.next());
//		System.out.println("\nUsing List Iterator hasPrevious");
//		while(studentListIterator.hasPrevious())
//			System.out.println(studentListIterator.previous());
//			
//		
//		
		
		
	}

	private static void printList(List<Student> students) {
		for(Student student: students)
			System.out.println(student);
	}
	

}
