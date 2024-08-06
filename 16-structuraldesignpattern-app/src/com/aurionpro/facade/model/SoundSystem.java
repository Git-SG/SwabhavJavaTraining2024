package com.aurionpro.facade.model;

public class SoundSystem implements ISystem {
	
	int volume;

	public SoundSystem(int volume) {
		this.volume = volume;
	}

	@Override
	public void start() {
		System.out.println("Sound System has started");
	}

	@Override
	public void stop() {
		System.out.println("Sound System has stopped");

	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	

}
