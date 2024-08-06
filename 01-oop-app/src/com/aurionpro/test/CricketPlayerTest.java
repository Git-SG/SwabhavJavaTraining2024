package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		CricketPlayer[] players = new CricketPlayer[11];

		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter player ID:");
			int playerId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Player Name:");
			String name = scanner.nextLine();
			System.out.println("Enter number of matches:");
			int numberOfMatches = scanner.nextInt();
			System.out.println("Enter number of runs:");
			int runs = scanner.nextInt();
			System.out.println("Enter number of wickets:");
			int wickets = scanner.nextInt();

			players[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, wickets);

		}

		for (int i = 0; i < players.length; i++) {
			players[i].display();
		}
	}
}
