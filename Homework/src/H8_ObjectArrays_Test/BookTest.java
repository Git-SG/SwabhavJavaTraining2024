package H8_ObjectArrays_Test;

import java.util.Scanner;

import H8_ObjectArrays_model.Book;
import H8_ObjectArrays_model.BookUtils;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total number of books: ");
		int numberOfBooks = scanner.nextInt();

		Book[] books = new Book[numberOfBooks];

		for (int i = 0; i < books.length; i++) {

			System.out.println("Enter Book Id: ");
			int bookId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Book name: ");
			String name = scanner.nextLine();
			System.out.println("Enter Author name: ");
			String author = scanner.nextLine();
			System.out.println("Enter Price: ");
			double price = scanner.nextDouble();

			books[i] = new Book(bookId, name, author, price);

		}

		Book.sortByPrice(books);

		scanner.close();
	}

}
