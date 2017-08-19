package factoryPattern.concreteCreator;

import factoryPattern.Currency;
import factoryPattern.INRupee;
import factoryPattern.UKPound;
import factoryPattern.USDollar;

public class CurrencyFactory {

	public static Currency getCurrency(String country) {
		if(country.equalsIgnoreCase("India")) {
			return new INRupee();
		}else if(country.equalsIgnoreCase("United States")) {
			return new USDollar();
		}else if(country.equalsIgnoreCase("United Kingdom")) {
			return new UKPound();
		}else {
			throw new IllegalArgumentException("Currency not found");
		}
	}
}
