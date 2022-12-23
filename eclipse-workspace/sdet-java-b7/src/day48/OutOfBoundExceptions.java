package day48;

import java.util.ArrayList;
import java.util.List;

public class OutOfBoundExceptions {
	public static void main(String[] args) {
		//            01234
		String str = "apple";
		
		// java.lang.StringIndexOutOfBoundsException:
		// str = str.substring(0, 10); 
		System.out.println(str);
		
		int[] arr = new int[10];
		// java.lang.ArrayIndexOutOfBoundsException
		// arr[10] = 7;
		
		List<Integer> list = new ArrayList<>();
		// java.lang.IndexOutOfBoundsException:
		System.out.println(list.get(2));
	}
}