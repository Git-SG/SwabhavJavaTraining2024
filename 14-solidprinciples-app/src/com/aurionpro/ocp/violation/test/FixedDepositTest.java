package com.aurionpro.ocp.violation.test;

import com.aurionpro.ocp.violation.model.FestivalType;
import com.aurionpro.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		
		FixedDeposit fd = new FixedDeposit(1, "Sarthak", 1000, 5, FestivalType.DIWALI);
		
		fd.printDetails();
	}

}
