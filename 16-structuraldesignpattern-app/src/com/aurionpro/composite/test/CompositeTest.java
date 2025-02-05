package com.aurionpro.composite.test;

import com.aurionpro.composite.model.Composite;
import com.aurionpro.composite.model.IComponent;
import com.aurionpro.composite.model.Leaf;

public class CompositeTest {
	public static void main(String[] args) {		
		
		IComponent mouse = new Leaf("Mouse", 1000);
		IComponent keyboard = new Leaf("Keyboard", 2000);
		IComponent monitor = new Leaf("Monitor", 8000);
		IComponent ram = new Leaf("RAM slot", 2000);
		IComponent cpu = new Leaf("CPU chip", 5000);
		
		System.out.println("Price of mouse is "+ mouse.getPrice());
		
		Composite external = new Composite("External Devices");
		Composite cabinet = new Composite("Cabinet");
		Composite motherboard = new Composite("Motherboard");
		
		external.addComponent(mouse);
		external.addComponent(keyboard);
		
		cabinet.addComponent(monitor);
		
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		
		System.out.println("\nPrice of external devices is "+external.getPrice());
		System.out.println("Price of cabinet is "+cabinet.getPrice());
		System.out.println("Price of motherboard is "+motherboard.getPrice());
		
		Composite computer = new Composite("Computer");
		computer.addComponent(external);
		computer.addComponent(motherboard);
		computer.addComponent(cabinet);
		
		System.out.println("\nPrice of computer is "  + computer.getPrice());

		

	}

}
