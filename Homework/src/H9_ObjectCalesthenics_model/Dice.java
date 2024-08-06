package H9_ObjectCalesthenics_model;

import java.lang.Math;

public class Dice {
	
	public int roll() {
		Integer rolledNumber = (int)((Math.random()*6)+1);
		return rolledNumber;
	}

}
