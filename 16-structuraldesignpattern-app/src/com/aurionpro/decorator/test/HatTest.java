package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.GoldenHat;
import com.aurionpro.decorator.model.IHat;
import com.aurionpro.decorator.model.RibbonedHat;
import com.aurionpro.decorator.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		IHat hat = new StandardHat();
		
		IHat goldenHat = new GoldenHat(hat);
		
		IHat ribbonedHat = new RibbonedHat(goldenHat);
		
		System.out.println("Name: " + ribbonedHat.getName());
		System.out.println("Price: " + ribbonedHat.getPrice());
		System.out.println("Description: " + ribbonedHat.getDescription());
		 
	}

}
