package day43;

public class CompareCustomObjects {
	public static void main(String[] args) {
		Book bookOne = new Book("Java", 200);
		Book bookTwo = new Book("Java", 200);
		
		// Are these two objects are equal?
		// Their properties are same but these are two different objects
		
		// How to compare objects in Java?
		// 1. We can compare each property one by one
		if (bookOne.title.equals(bookTwo.title) && bookOne.numberOfPages == bookTwo.numberOfPages) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		// 2. We can override equals method in Book class and use it here
		// equals by default works exactly the same as == operator
		// bookOne == bookTwo -> if pointing to the same object or not
		
		if (bookOne.equals(bookTwo)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}