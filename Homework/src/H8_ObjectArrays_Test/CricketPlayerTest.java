package H8_ObjectArrays_Test;

import java.util.Arrays;
import java.util.Scanner;

import H8_ObjectArrays_model.CricketPlayer;
import H8_ObjectArrays_model.CricketPlayerUtils;

public class CricketPlayerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Players: ");
		int numberOfPlayers = scanner.nextInt();
		CricketPlayer[] players = new CricketPlayer[numberOfPlayers];

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
				
		CricketPlayer.sortAscending(players);
		
		CricketPlayer.getMaximumAveragePlayer(players);
		
		scanner.close();
	}

}
