package H8_ObjectArrays_model;

public class Book {
	
	private int bookId;
	private String name;
	private String author;
	private double price;
	
	public Book() {
	}

	public Book(int bookId, String name, String author, double price) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public int getbookId() {
		return bookId;
	}

	public void setbookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public void display() {
		System.out.println("BookID: " + getbookId());
		System.out.println("Book Name: " +  getName());
		System.out.println("Book Author: " + getAuthor());
		System.out.println("Book Price: " + getPrice());
		System.out.println();
	}
	
//	public static void sortByPrice(Book[] books) {
//	System.out.println("Array sorted by descending order of Price is: \n");
//	Arrays.sort(books, (b1,b2) -> Double.compare(b2.getPrice(), b1.getPrice()));
//	
//	for(int i = 0; i < books.length; i++) {
//		books[i].display();
//	}
//}
	
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
