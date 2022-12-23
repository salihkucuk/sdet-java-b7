package day43;

public class SuperObjectClass {
	public static void main(String[] args) throws Exception {
		Book book = new Book("OCA", 500);
		
		System.out.println(book.title);
		System.out.println(book.numberOfPages);
		
		Class clazz = book.getClass();
		System.out.println(clazz.getName()); // day43.Book
		
		System.out.println(book.toString()); // day43.Book@7ad041f3
		System.out.println(book.equals(null)); // false
		System.out.println(book.hashCode()); // 2060468723
		
		// These methods for multithreading environment
		book.notify();
		book.notifyAll();
		book.wait();
		book.wait(2000);
		book.wait(200, 0);
		
		/*
		 * In Java every class automatically inherits from java.lang.Object
		 * class. Java want to give generic behaviors for every object that
		 * ever will be created.
		 * 
		 */
	}
}