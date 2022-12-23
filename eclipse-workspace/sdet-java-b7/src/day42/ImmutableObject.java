package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableObject {
	public static void main(String[] args) {
		// Immutable object is not changeable object
		// Once object is created with initial values
		// we cannot change it, only create new object
		
		// The most popular immutable object is String class
		String str = "hello"; // create string with value
		str = "apple"; // in order to change it, we need to create new string object
		
		
		// mutable object
		StringBuilder sb = new StringBuilder("hello");
		sb.append(", world");
		
		
		StringBuilder sb2 = sb;
		sb2.append("ABC");
		
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println("---");
		
		// custom immutable object
		List<String> courses = new ArrayList<>(Arrays.asList("Java", "Selenium"));
		School tla = new School("TLA", courses, "101 Main st");
		System.out.println("School name: " + tla.getName());
		System.out.println("Courses: " + tla.getCourses());
		System.out.println("Address: " + tla.getAddress());
		System.out.println("---");
		
		// only way to change immutable objects is to create new object
		tla = new School("Tech Lead Academy", courses, "101 Main st");
		System.out.println("School name: " + tla.getName());
		System.out.println("Courses: " + tla.getCourses());
		System.out.println("Address: " + tla.getAddress());
		
	}
}