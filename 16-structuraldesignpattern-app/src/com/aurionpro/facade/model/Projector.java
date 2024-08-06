package com.aurionpro.facade.model;

public class Projector implements IDevice {

	@Override
	public void on() {
		System.out.println("Projector is on");
	}

	@Override
	public void off() {
		System.out.println("Projector is off");

	}

}
