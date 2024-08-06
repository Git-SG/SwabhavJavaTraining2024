package com.aurionpro.ocp.solution.model;

public class FixedDeposit {
	
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalRateInterest interest;
	
	public FixedDeposit(int accountNumber, String name, double principal, int duration,
			IFestivalRateInterest interest) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
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
	public IFestivalRateInterest getInterest() {
		return interest;
	}
	public void setInterest(IFestivalRateInterest interest) {
		this.interest = interest;
	}
	
	

}
