package com.aurionpro.strategy.test;

import com.aurionpro.strategy.model.AddOperation;
import com.aurionpro.strategy.model.MultiplyOperation;
import com.aurionpro.strategy.model.OperationStrategy;

public class StrategyTest {
	
	public static void main(String[] args) {
		
		OperationStrategy op = new OperationStrategy(new AddOperation());
		
		op.doOperation(4, 5);
		
		op.setOperation(new MultiplyOperation());
		
		op.doOperation(4, 5);
	}

}
