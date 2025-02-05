package com.aurionpro.test;

import com.aurionpro.model.Base;
import com.aurionpro.model.Derived1;
import com.aurionpro.model.Derived2;

public class RuntimeAndCompiletimeTest {
	
	public static void main(String[] args) {
		Base base = new Base();
		base.display();
		
		Derived1 derived1 = new Derived1();
		derived1.display();
		
		base = derived1;
		
		System.out.println("Runtime polymorphism");
		base.display();
		
		Base base1 = new Derived2();
		
		base1.display();
		
	}

}
