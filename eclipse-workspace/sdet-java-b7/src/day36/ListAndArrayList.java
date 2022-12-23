package day36;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {
	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<>();
		books.add("Java 101");
		
		// another way of creating ArrayList
		List<String> booksTwo = new ArrayList<>();
		booksTwo.add("Java 101");
		booksTwo.add("OCA");	
		booksTwo.add("OCP");
		
		System.out.println(booksTwo.size());
		System.out.println(booksTwo.get(0));
	}
}