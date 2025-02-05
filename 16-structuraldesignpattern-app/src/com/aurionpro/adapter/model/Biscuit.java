package com.aurionpro.adapter.model;

public class Biscuit implements IItem{
	
	private String name;
	private double mrp;
	
	public Biscuit(String name, double mrp) {
		this.name = name;
		this.mrp = mrp;
	}
	@Override
	public String getItemName() {
		return name;
	}
	@Override
	public double getItemPrice() {
		return mrp;
	}
	
	@Override
	public String toString() {
		return "Biscuit [name=" + name + ", mrp=" + mrp + "]";
	}
	
	
		

}
