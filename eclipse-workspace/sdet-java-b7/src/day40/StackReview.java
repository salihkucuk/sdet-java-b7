package day40;

import java.util.Stack;

public class StackReview {
	public static void main(String[] args) {
		// Stack is Last In First Out (LIFO) data structure
		// push add new element on top the stack
		// pop  get element from the top of the stack
		
		Stack<String> strs = new Stack<>();
		strs.push("Alex");
		strs.push("Kuba");
		strs.push("John");
		System.out.println(strs);
		
		String str = strs.pop();
		System.out.println(str);  // John
		System.out.println(strs); // [Alex, Kuba]
		System.out.println("---");
		
		str = strs.pop();
		System.out.println(str);  // Kuba
		System.out.println(strs); // [Alex]
	}
}