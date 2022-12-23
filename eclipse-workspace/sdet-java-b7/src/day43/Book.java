package day43;

public class Book {
	public String title;
	public int numberOfPages;
	
	public Book() {
		
	}
	
	public Book(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null && !(obj instanceof Book)) {
			return false;
		}
		
		Book book = (Book)obj;
		return book.title.equals(this.title) 
				&& book.numberOfPages == this.numberOfPages;
	}
	
	@Override
	public int hashCode() {
		return title.hashCode() + numberOfPages;
	}
	
	@Override
	public String toString() {
		return "{title=" + title + ", numberOfPages=" + numberOfPages + "}";
	}
}