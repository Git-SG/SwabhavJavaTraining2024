package H8_ObjectArrays_model;

import java.util.Arrays;

public class CricketPlayerUtils {
	
	public static void getMaximumAveragePlayer(CricketPlayer[] players) {
		
		double maxAverage = 0;
		for(int i = 0; i < players.length; i++) {
			if (players[i].getAverage() >= maxAverage) {
				maxAverage = players[i].getAverage();
			}
		}
		
		System.out.println("The details for player(s) with Maximum Average are: \n");
		
		for(int i = 0; i < players.length; i++) {
			if (players[i].getAverage() == maxAverage) {
				players[i].display();
			}
		}
	}
	
//	public static void displayPlayers(CricketPlayer[] players) {
//		
//		System.out.println("Array sorted by ascending order of Average is: \n");
//		Arrays.sort(players, (p1,p2) -> Double.compare(p1.getAverage(), p2.getAverage()) );
//		for (int i = 0; i < players.length; i++) {
//			players[i].display();
//		}
	
	public static void displayPlayers(CricketPlayer[] players) {
		System.out.println("Array sorted by ascending order of Average is: \n");
		
		for (int i = 0; i < players.length-1; i++) {
			Boolean keepSwapping = false;
			for (int j = 0; j < players.length-1; j++) {
				if(players[j].getAverage() > players[j+1].getAverage()) {
				CricketPlayer temp = players[j];
				players[j] = players[j+1];
				players[j+1] = temp;
				keepSwapping = true;
				}
			}
			
			if (!keepSwapping) {
				break;
			}
		}
		
		for (int i = 0; i < players.length; i++) {
			players[i].display();
		}
	}

}
