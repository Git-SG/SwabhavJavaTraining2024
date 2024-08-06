package com.aurionpro.list.model;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getRollNumber() > student2.getRollNumber())
			return 1;
		if(student2.getRollNumber() > student1.getRollNumber())
			return -1;
		return 0;
	}


	

}
