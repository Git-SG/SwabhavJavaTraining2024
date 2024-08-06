package com.aurionpro.state.test;

import com.aurionpro.state.model.Ordered;
import com.aurionpro.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		
		Packet packet = new Packet(new Ordered());
		
		packet.printCurrentState();
		
		packet.goToNextState();
		packet.printCurrentState();

		packet.goToNextState();
		packet.printCurrentState();

		packet.goToPreviousState();
		packet.printCurrentState();

	}

}
