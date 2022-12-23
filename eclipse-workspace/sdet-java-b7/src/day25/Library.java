package day25;

public class Library {
	public static void main(String[] args) {
		// TODO
		// 1.Create 2 objects from Book class with all 
		//   properties assigned (any value)
		
		// 2.Print both object details
		
		Book bookOne = new Book();
		bookOne.title = "OCA";
		bookOne.author = "Jeanne Boyarsky";
		bookOne.pages = 400;
		
		Book bookTwo = new Book("Java", "Savitvh", 650);
		
		System.out.println("Table one");
		bookOne.displayDetails();
		
		System.out.println("---");
		
		System.out.println("Table two");
		bookTwo.displayDetails();
		
	}
}