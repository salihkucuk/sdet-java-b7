package day27;

public class AccessModifiersDemo {
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.str = "java";
		obj.num = 10;
		obj.strTwo = "python";
		// obj.dNum = 9.5;
		
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();
		// obj.methodFour();
	}
}