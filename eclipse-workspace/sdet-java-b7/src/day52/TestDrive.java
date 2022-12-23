package day52;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestDrive {
	public static void testDrive(List<Car> cars, CarTester carTester) {
		for (Car car : cars) {
			if (carTester.test(car)) {
				car.drive();
			}
		}
	}
	
	public static void printDetails(List<Car> cars, CarDetails carDetails) {
		for (Car car : cars) {
			System.out.println(carDetails.getDetails(car));
		}
	}
	
	// We can use built in functional interfaces provided by Java
	public static void testDriverNew(List<Car> cars, Predicate<Car> predicate) {
		for (Car car : cars) {
			if (predicate.test(car)) {
				car.drive();
			}
		}
	}
	
	public static void printDetailsNew(List<Car> cars, Function<Car, String> function) {
		for (Car car : cars) {
			System.out.println(function.apply(car)); 
		}
	}
	
}