package com.aurionpro.state.model;

public class Dispatched implements IPacketState{
	
	private String currentState = "dispatched";


	@Override
	public IPacketState next(Packet packet) {
		System.out.println("Packet moved to Delivered state");

		return new Delivered();
	}

	@Override
	public IPacketState current(Packet packet) {
		return new Dispatched();
	}

	@Override
	public IPacketState previous(Packet packet) {
		System.out.println("Packet moved to Ordered state");

		return new Ordered();
	}

	public String getState() {
		return currentState;
	}

}
