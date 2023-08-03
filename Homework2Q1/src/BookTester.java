
import java.util.ArrayList;

public class BookTester {
	public BookTester() {
		// Create books ArrayList of type Book
		ArrayList<Book> books = new ArrayList<Book>();

		books.add(new PrintBook("Java", 2020, "Ali", "XYZ", 11223344));
		books.add(new AudioBook("C++", 2019, "Mohamed", 500, 140, "Adam"));
		books.add(new AudioBook("Python", 2021, "Omar", 800, 80, "Sara"));
		books.add(new PrintBook("PHP", 2018, "Khaled", "ABC", 55667788));

		// Process each element in books ArrayList to display each book information.
		// Also, for Audio books, calculate and display their total play length.

		// Compete this code part...
		int totalLength = 0;
		for (Book b : books) {
			System.out.println(b.toString());
			if (b instanceof AudioBook)
				totalLength += ((AudioBook) b).getLength();
		}
		System.out.println("Total play length for Audio Books = " + totalLength);

	}

	public static void main(String args[]) {
		new BookTester();
	} // end main method
} // end class BookTester
