package com.aurionpro.model;

import java.util.concurrent.Callable;

public class NewCallableTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return (int)(Math.random()*1000);
	}
	

}
