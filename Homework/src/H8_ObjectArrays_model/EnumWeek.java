package H8_ObjectArrays_model;

public enum EnumWeek {
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(),
	SATURDAY(7);
	
	final private int dayNumber;
	
	EnumWeek() {
		dayNumber = ordinal() + 1;
	}

	private EnumWeek(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public int getDayNumber() {
		return dayNumber;
	}
	
	
	

}
