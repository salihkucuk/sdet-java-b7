package day25;

public class Book {
	public String title;
	public String author;
	public int pages;
	
	public Book() {
		System.out.println("inside empty constructor");
	}
	
	public Book(String title, String author, int pages) {
		System.out.println("inside constructor with 3 args");
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public void displayDetails() {
		System.out.println("title: " + this.title);
		System.out.println("author: " + this.author);
		System.out.println("pages: " + this.pages);
	}
	
}