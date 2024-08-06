package H8_ObjectArrays_model;

public class POCEnum {
	public static void main(String[] args) {

		EnumWeek day = EnumWeek.THURSDAY;

		System.out.println("The day is" + day);
		System.out.println(day + " is present at position" + day.ordinal());
		System.out.println(day.getDayNumber());
		System.out.println(day.toString());
		System.out.println(day.compareTo(EnumWeek.SATURDAY));
		System.out.println(day.equals(EnumWeek.THURSDAY));
		System.out.println(EnumWeek.FRIDAY.getDayNumber());

		EnumWeek[] daysOfTheWeek = EnumWeek.values();

		for (int i = 0; i < daysOfTheWeek.length; i++) {
			System.out.print(daysOfTheWeek[i] + " ");
		}
		
		System.out.println();

		switch (day) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("The day is a weekday");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("The day is a wwekend");
			break;
		}
		

	}
}
