package com.aurionpro.ocp.solution.model;

public class SimpleInterestCalculator {
	
	private FixedDeposit fd;
	
	public double calculateSimpleInterest(FixedDeposit fd) {
		return ((fd.getPrincipal()*fd.getDuration()*fd.getInterest().getInterestRate())/100);
	}

}
