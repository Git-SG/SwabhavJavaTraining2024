package com.aurionpro.list.model;

import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		student1.setName(student1.getName().toLowerCase());
		student2.setName(student2.getName().toLowerCase());
		
		LinkedList<String> students = new LinkedList<String>();
		students.add(student1.getName());
		students.add(student2.getName());
		
		Collections.sort(students);
		
		if(students.get(0).equals(student1.getName()))
			return -1;
		if(students.get(1).equals(student1.getName()))
			return 1;			
			
		return 0;
	}
	

}
