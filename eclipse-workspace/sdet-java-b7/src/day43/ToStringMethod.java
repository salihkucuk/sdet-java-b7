package day43;

public class ToStringMethod {
	public static void main(String[] args) {
		Book book = new Book("JavaScript", 300);
		System.out.println(book); // day43.Book@4b7aa2d9
		
		String bookStr = book.toString();
		System.out.println(bookStr);
		
		/*
		 *  toString() is a common way of getting 
		 *  String representation of object. This is the method 
		 *  that every class will have from Object.
		 */
		
		Book bookTwo = new Book("Python", 500);
		System.out.println(bookTwo);
	}
}