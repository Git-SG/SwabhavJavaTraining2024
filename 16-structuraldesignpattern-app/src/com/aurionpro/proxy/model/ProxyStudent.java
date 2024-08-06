package com.aurionpro.proxy.model;

public class ProxyStudent implements IStudent {

	private Student student;
	private String name;
	private int age;
	
	public ProxyStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public ProxyStudent(Student student) {
		super();
		this.student = student;
	}



	@Override
	public void study() {
		
		if(student != null) {
		System.out.println(student.getName() + " is studying");
		}
		
		student = new ProxyStudent(student)
	}

}
