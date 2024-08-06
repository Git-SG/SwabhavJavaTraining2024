package com.aurionpro.state.model;

public interface IPacketState {
	
	IPacketState next(Packet packet);
	IPacketState current(Packet packet);
	IPacketState previous(Packet packet);
	String getState();

	

}
