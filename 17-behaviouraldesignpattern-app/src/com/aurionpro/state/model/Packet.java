package com.aurionpro.state.model;

public class Packet {
	private IPacketState state = new Ordered();

	public Packet(IPacketState state) {
		super();
		this.state = state;
	}
	
	public void goToNextState() {
		state = state.next(this);
	}
	
	public void goToPreviousState() {
		state = state.previous(this);
	}
	
	public void printCurrentState() {
		System.out.println("The order is " + state.getState());
	}

	public IPacketState getState() {
		return state;
	}

	public void setState(IPacketState state) {
		this.state = state;
	}
	
	
	
}
