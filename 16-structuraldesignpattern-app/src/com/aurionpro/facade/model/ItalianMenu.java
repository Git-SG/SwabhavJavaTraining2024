package com.aurionpro.facade.model;

public class ItalianMenu implements IMenu{
	
	@Override
	public void displayMenu() {
		System.out.println("\nItalian Menu \n1.Pizza \n2.Pasta \n3.Lasagna");
	}

}
