package com.aurionpro.list.model;

public class Employee {
	
	private int employeeID;
	private String name;
	private double salary;
	
	public Employee(int employeeID, String name, double salary) {
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
