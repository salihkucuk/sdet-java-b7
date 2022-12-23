package day46;

import java.util.Arrays;

public class SortCustomObjects {
	public static void main(String[] args) {
		Book[] books = {
				new Book("OCA", 500),
				new Book("OCP", 600),
				new Book("Java", 550),
				new Book("Algorithms", 800)
		};
		
		System.out.println(Arrays.toString(books));
		
	}
}

class Book {
	public String title;
	public int numberOfPages;
	
	public Book(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "{title=" + title + ", numberOfPages=" + numberOfPages + "}";
	}
}