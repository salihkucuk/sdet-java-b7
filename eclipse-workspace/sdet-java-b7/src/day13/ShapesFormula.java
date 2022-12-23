package day13;

public class ShapesFormula {
	public static final double PI = 3.14;
	
	/**
	 * Circumference of circle = 2 * pi * radius
	 */
	public static double getCircumference(int radius) {
		return 2 * PI * radius;
	}
	
	/**
	 * Area of circle = pi * radius^2
	 */
	public static double getAreaOfCirlce(int radius) {
		return PI * (radius * radius);
	}
	
	/**
	 * Surface area of sphere = 4 * pi * radius^2
	 */
	public static double getSurfAreaOfSphere(int radius) {
		return 4 * PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		double c = getCircumference(5);
		System.out.println(c);
		double area=getAreaOfCirlce(5);
		System.out.println(area);
	}
}