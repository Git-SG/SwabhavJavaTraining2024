package com.aurionpro.adapter.model;

public class HatAdapter implements IItem{
	
	Hat hat;

	public HatAdapter(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return (hat.getShortName() + hat.getLongName());
	}

	@Override
	public double getItemPrice() {
		return (hat.getBasicPrice() + hat.getTax());
	}

	@Override
	public String toString() {
		return "Hat" + hat;
	}
	
	
	

}
