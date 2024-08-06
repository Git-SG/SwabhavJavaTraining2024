package com.aurionpro.ocp.violation.model;

public class FixedDeposit {
	
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	
	
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrincipal() {
		return principal;
	}


	public void setPrincipal(double principal) {
		this.principal = principal;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public FestivalType getFestival() {
		return festival;
	}


	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	
	public double getInterestRates(FestivalType festival) {
		switch(festival) {
		case NEWYEAR: return 8;
		case DIWALI: return 8.5;
		case HOLI: return 7.5;
		case OTHERS: return 6.5;
		}
		
		return 0.0;
	}
	
	public double calculateSimpleInterest(double principal, int duration, FestivalType festival) {
		return ((principal*duration*getInterestRates(festival)) / 100);
	}
	
	public void printDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Name: " + name);
		System.out.println("Principal amount: " + principal);
		System.out.println("Duration of FD: " + duration);
		System.out.println("Type of festival: " + festival.toString());
		System.out.println("Rate of interest: " + getInterestRates(festival));
		System.out.println("Simple interest: " + calculateSimpleInterest(principal, duration, festival));
	}

}
