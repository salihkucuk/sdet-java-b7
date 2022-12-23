package day41;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("Honda");
		car.setPrice(25000.0);
		car.setYear(2019);
		System.out.println(car.getModel());
		System.out.println(car.getPrice());
		System.out.println(car.getYear());
		System.out.println("---");
		
		Car carTwo = new Car();
		carTwo.setModel("BMW");
		carTwo.setPrice(35000.0);
		carTwo.setYear(2000);
		// carTwo.setYear(1995);
		System.out.println(carTwo.getModel());
		System.out.println(carTwo.getPrice());
		System.out.println(carTwo.getYear());
	}
}