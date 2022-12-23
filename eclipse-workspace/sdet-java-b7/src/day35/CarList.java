package day35;

import java.util.ArrayList;

public class CarList {
	public static void main(String[] args) {
		// TODO create ArrayList of String 
		// with these elements ["bmw", "audi", "honda", "tesla"]
		// print each element in the new line
		
		ArrayList<String> carList = new ArrayList<>();
		carList.add("bmw");
		carList.add("audi");
		carList.add("honda");
		carList.add("tesla");
		System.out.println(carList.get(0)); 
		System.out.println(carList.get(1)); 
		System.out.println(carList.get(2)); 
		System.out.println(carList.get(3)); 
		    
		    for(int i=0; i<carList.size(); i++) {
		    	System.out.println(carList.get(i));
		    }
		
			for (String car : carList) {
				System.out.println(car);
			}
		
	}
}