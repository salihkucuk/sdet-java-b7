package day27;

/*
 * Access modifiers control visibility
 * public - accessible from everywhere
 * protected - accessible within the same package
 *             and in the subclass.
 * default - accessible within the same package   
 * private - accessible within the same class         
 */
public class AccessModifiers {
	public String str;
	protected int num;
	String strTwo; // default access modifier
	private double dNum;
	
	public void methodOne() {
		System.out.println("Method one");
	}
	
	protected void methodTwo() {
		System.out.println("Method two");
	}
	
	void methodThree() {
		System.out.println("Method three");
	}
	
	private void methodFour() {
		System.out.println("Method four");
	}
}