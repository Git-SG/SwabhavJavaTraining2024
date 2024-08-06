package H8_ObjectArrays_model;

import java.util.Arrays;

public class BookUtils {
	
//	public static void sortByPrice(Book[] books) {
//		System.out.println("Array sorted by descending order of Price is: \n");
//		Arrays.sort(books, (b1,b2) -> Double.compare(b2.getPrice(), b1.getPrice()));
//		
//		for(int i = 0; i < books.length; i++) {
//			books[i].display();
//		}
//	}
	
	public static void sortByPrice(Book[] books) {
		System.out.println("Array sorted by descending order of Price is: \n");
		for(int i = 0; i < books.length-1; i++) {
			Boolean keepSwapping = false;
			for (int j = 0; j < books.length-1; j++) {
				if(books[j].getPrice() < books[j+1].getPrice()) {
					Book temp = books[i];
					books[j] = books [j+1];
					books[j+1] = temp;
					keepSwapping = true;
				}
			}
			
			if (!keepSwapping) {
				break;
			}
		}
		
		for(int i = 0; i < books.length; i++) {
			books[i].display();
		}
	}
}
