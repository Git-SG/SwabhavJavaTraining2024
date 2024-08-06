package com.aurionpro.state.model;

public class Delivered implements IPacketState{
	
	private String currentState = "delivered";


	@Override
	public IPacketState next(Packet packet) {
		return new Delivered();
	}

	@Override
	public IPacketState current(Packet packet) {
		return new Delivered();
	}

	@Override
	public IPacketState previous(Packet packet) {
		System.out.println("Packet moved to Dispatched state");

		return new Dispatched();
	}
	
	public String getState() {
		return currentState;
	}

}
