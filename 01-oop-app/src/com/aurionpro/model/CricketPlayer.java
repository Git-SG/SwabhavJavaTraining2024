package com.aurionpro.model;

public class CricketPlayer {
	
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	
	public CricketPlayer() {
	}

	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int wickets) {
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public double calculateAverage() {
		double average = (double)runs / numberOfMatches;
		return average;
	}
	
	public void display() {
		System.out.println("PlayerID: " + playerId);
		System.out.println("Player Name " + name);
		System.out.println("Number of Matches: " + numberOfMatches);
		System.out.println("Player runs " + runs);
		System.out.println("Player Wickets " + wickets);
		System.out.println("Player run average " + calculateAverage());
	}
	
	
	

}
