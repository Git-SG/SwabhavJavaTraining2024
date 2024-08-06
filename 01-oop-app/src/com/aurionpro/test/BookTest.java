package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total number of books: ");
		
		int size = scanner.nextInt();
		
		Book[] books = new Book[5];
		
		for (int i=0; i < size; i++) {
		
			System.out.println("Enter Book Id: ");
			int bookId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Book name: ");
			String name = scanner.nextLine();
			System.out.println("Enter Author name: ");
			String author = scanner.nextLine();
			System.out.println("Enter Price: ");
			double price = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter Publication: ");
			String publication = scanner.nextLine();
			
			books[i] = new Book(bookId, name, author, price, publication);
		
		}
		
		for (int i = 0; i < size; i++) {
			books[i].display();
		}
		scanner.close();
	}

}
