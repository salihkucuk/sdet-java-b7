package day34;

public class VarargsTwo {
	public static void main(String[] args) {
		String res = join("hello", "world");
		System.out.println(res);
		
		res = join("Java", "JavaScript", "PHP");
		System.out.println(res);
		
		String[] strArr = {"A", "B", "C", "D", "E", "X", "Y", "X"};
		res = join(strArr);
		System.out.println(res);
	}
	
	public static String join(String... strs) {
		int size = strs.length;
		System.out.println("Number of arguments: " + size);
		
		StringBuilder resSb = new StringBuilder();
		for (String str : strs) {
			resSb.append(str);
		}
		
		return resSb.toString();
	}
}