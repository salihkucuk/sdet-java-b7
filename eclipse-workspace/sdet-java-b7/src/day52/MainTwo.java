package day52;

import java.util.ArrayList;
import java.util.List;

public class MainTwo {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Tesla", "white", 2019));
		cars.add(new Car("Tesla", "black", 2022));
		cars.add(new Car("BMW", "white", 2018));
		cars.add(new Car("BMW", "red", 2017));
		cars.add(new Car("Audi", "blue", 2022));
		
		TestDrive.testDriverNew(cars, (Car car) -> {
			return car.year == 2017;
		});
		
		System.out.println("--");
		TestDrive.printDetailsNew(cars, (Car car) -> {
			return car.model + ", " + car.year;
		});
	}
}