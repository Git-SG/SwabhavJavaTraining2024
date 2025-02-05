package com.aurionpro.facade.model;

public class Remote {

	DVDPlayer dvd;
	Projector projector;
	SoundSystem system;
	boolean isOn = false;

	public Remote(DVDPlayer dvd, Projector projector, SoundSystem system) {
		this.dvd = dvd;
		this.projector = projector;
		this.system = system;
	}

	public void startMovie() {
		System.out.println("\nStarting....");
		dvd.on();
		projector.on();
		system.start();
		dvd.start();
		isOn = true;

		System.out.println("Movie has started.");
	}

	public void stopMovie() {
		if(isOn) {
		System.out.println("\nStopping....");
		dvd.stop();
		system.stop();
		projector.off();
		dvd.off();
		System.out.println("Movie has stopped.");
		isOn = false;
		return;
		}
		
		System.out.println("Movie has not started yet");
	}

}
