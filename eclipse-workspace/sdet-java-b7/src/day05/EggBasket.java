package day05;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		numberOfBaskets = 10;
		eggsPerBasket = 6;
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("if you have");
		// when we concatenate String with other data types, the output is always String
		System.out.println(numberOfBaskets + " baskets, and");
		System.out.println(eggsPerBasket + " eggs per basket, then");
		System.out.println("the total number of eggs is " + totalEggs);
	}
}