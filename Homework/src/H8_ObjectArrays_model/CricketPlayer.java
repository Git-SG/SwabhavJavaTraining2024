package H8_ObjectArrays_model;

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
	
	public double getAverage() {
		double average = (double)runs / numberOfMatches;
		return average;
	}
	
	public void display() {
		System.out.println("PlayerID: " + playerId);
		System.out.println("Player Name: " + name);
		System.out.println("Number of Matches: " + numberOfMatches);
		System.out.println("Player runs: " + runs);
		System.out.println("Player Wickets: " + wickets);
		System.out.println("Player run average: " + getAverage());
		System.out.println();
	}
	
	public static void sortAscending(CricketPlayer[] players) {
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
	
//	public static void displayPlayers(CricketPlayer[] players) {
//	
//	System.out.println("Array sorted by ascending order of Average is: \n");
//	Arrays.sort(players, (p1,p2) -> Double.compare(p1.getAverage(), p2.getAverage()) );
//	for (int i = 0; i < players.length; i++) {
//		players[i].display();
//	}
	
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

}
