package com.aurionpro.state.model;

public class Ordered implements IPacketState{
	
	private String currentState = "ordered";

	@Override
	public IPacketState next(Packet packet) {
		System.out.println("Packet moved to Dispatched state");
		return new Dispatched();
	}

	@Override
	public IPacketState current(Packet packet) {
		return new Ordered();
	}

	@Override
	public IPacketState previous(Packet packet) {
		return new Ordered();
	}

	public String getState() {
		return currentState;
	}

	

}
