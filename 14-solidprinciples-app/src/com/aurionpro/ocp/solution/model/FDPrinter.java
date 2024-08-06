package com.aurionpro.ocp.solution.model;

public class FDPrinter {
	
	private FixedDeposit fd;
	private SimpleInterestCalculator calculator;
	
	public void printDetails(FixedDeposit fd, SimpleInterestCalculator calculator) {
		System.out.println("Account Number: " + fd.getAccountNumber());
		System.out.println("Name: " + fd.getName());
		System.out.println("Principal amount: " + fd.getPrincipal());
		System.out.println("Duration of FD: " + fd.getDuration());
//		System.out.println("Type of festival: " + festival.toStrin/g());
		System.out.println("Rate of interest: " + fd.getInterest().getInterestRate());
		System.out.println("Simple interest: " + calculator.calculateSimpleInterest(fd));
	}

}
