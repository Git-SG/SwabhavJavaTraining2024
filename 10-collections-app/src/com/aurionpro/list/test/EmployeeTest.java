package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		
		List <Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Sarthak", 10000));
		employees.add(new Employee(2, "Shashikant", 80000));
		employees.add(new Employee(3, "Gangan", 900000));
		
		printList(employees);
		
		Collections.sort(employees, EmployeeComparator.EmployeeIdComparator());
		
		
		
	}
	
	private static void printList(List<Employee> employees) {
		for(Employee employee: employees)
			System.out.println(employee);
	}
	

}
