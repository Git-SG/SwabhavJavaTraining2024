package com.aurionpro.facade.model;

import java.util.Scanner;

public class DVDPlayer implements IDevice, ISystem {
	
	public DVDPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select a movie");
		String movie = scanner.nextLine();
		System.out.println("The selected movie is " + movie);
	}

	@Override
	public void start() {
		System.out.println("DVD Player has started");
	}

	@Override
	public void stop() {
		System.out.println("DVD Player has stopped");

	}

	@Override
	public void on() {
		System.out.println("DVD Player is on");

	}

	@Override
	public void off() {
		System.out.println("DVD Player is off");

	}

}
