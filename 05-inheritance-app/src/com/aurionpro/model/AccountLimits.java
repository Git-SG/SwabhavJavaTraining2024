package com.aurionpro.model;

public enum AccountLimits {
	
	OVER_DRAFT_LIMIT(10000),
	MIN_BALANCE(1000);
	
	final private int limit;
	
	private AccountLimits(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}
	
	

}
