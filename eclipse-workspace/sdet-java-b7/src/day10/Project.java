package day10;

public class Project {
	public static void main(String[] args) {
    int amount=78;
    
    System.out.println(amount+" cents in coins:");
    
    System.out.println(amount/25);
    amount=amount%25;
    
    System.out.println(amount/10);
    amount=amount%10;
    
    System.out.println(amount/5);
    amount=amount%5;
    
    System.out.println(amount);
}
}
