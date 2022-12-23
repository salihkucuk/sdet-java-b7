package day19;

public class EnumInJava {
	enum Country {
		USA, 
		Canada, 
		UK, 
		Brazil,
		India
	}
	
	public static void main(String[] args) {
		System.out.println(getFeeByCountry(Country.USA));
		System.out.println(getFeeByCountry(Country.UK));
		System.out.println(getFeeByCountry(Country.Canada));
		
		// India - 8.0
		System.out.println(getFeeByCountry(Country.India)); // 8.0
		
		// Doesn't compile
		// System.out.println(getFeeByCountry("China")); // doesn't accpet string
		// System.out.println(getFeeByCountry(Country.China)); // China is not part of the enum
	}
	
	/*
	 * USA     - 10.0
	 * Canada  - 12.0
	 * UK      - 9.0
	 * Brazil  - 9.0
	 * India   - 8.0
	 */
	public static double getFeeByCountry(Country country) {
		if (country.equals(Country.USA)) {
			return 10.0;
		} else if (country.equals(Country.Canada)) {
			return 12.0;
		} else if (country.equals(Country.UK) || country.equals(Country.Brazil)) {
			return 9.0;
		} else if (country.equals(Country.India)) {
			return 8.0;
		} else {
			return 10.0;
		}
	}
}