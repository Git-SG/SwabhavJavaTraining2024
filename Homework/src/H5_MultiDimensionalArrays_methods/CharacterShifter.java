package H5_MultiDimensionalArrays_methods;

public class CharacterShifter {
	
	public static void shiftString(String string, int shift) {
		
		shift = shift % 26;
		
		if(shift < 0) {
			shift += 26;
		}
		
		
		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);
			
			if (Character.isLetter(ch)) {

				if (Character.isLowerCase(ch)) {
					ch = (char) ('a' + (ch + shift - 'a') % 26);
					System.out.print(ch);
				}
	
				else {
					ch = (char) ('A' + (ch + shift - 'A') % 26);
					System.out.print(ch);
				}
			
			}
			
			else {
				System.out.println("Enter a string with only alphabets");
				break;
			}

		}
	}

}
