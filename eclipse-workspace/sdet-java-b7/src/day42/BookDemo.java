package day42;

public class BookDemo {
	public static void main(String[] args) {
		Book book = new Book();
		// book.title = "";
		// book.setTitle(""); // exception
		book.setTitle("OCA");
		book.setAuthor("Jeane");
		book.setPages(350);
		
		System.out.println("Title: " + book.getTitle());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Pages: " + book.getPages());
		
	}
}