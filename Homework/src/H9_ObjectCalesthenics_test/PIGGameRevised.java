package H9_ObjectCalesthenics_test;

import java.util.Scanner;
import java.lang.Math;

public class PIGGameRevised {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		Integer turnCounter = 0;
		Integer totalScore = 0;
		
		startTurn(turnCounter, totalScore, scanner);

	}

	public static void startTurn(Integer turnCounter, Integer totalScore, Scanner scanner) {
		Integer turnScore = 0;
		System.out.println("TURN " + turnCounter);
		System.out.println("Roll or hold? (r/h): ");
		String action = scanner.next().toLowerCase();
		if(isActionValid(action)) {
			playGame(action, turnScore, totalScore);
		}
		
	}

	public static void playGame(String action, Integer turnScore, Integer totalScore) {
		if(action == "r") {
			int rolledNumber  = rollDie();
			checkNumber(rolledNumber);
			return;
		}
		
		if(action == "h") {
			totalScore += turnScore;
		}
	}

	private static void checkNumber(int rolledNumber) {
		// TODO Auto-generated method stub
		
	}

	public static int rollDie() {
		int rolledNumber = (int)((Math.random()*6) + 1);
		
		return rolledNumber;
	}

	public static boolean isActionValid(String action) {
		if(action!="h" || action != "r") {
			return false;
		}
		
		return true;
	}

}
