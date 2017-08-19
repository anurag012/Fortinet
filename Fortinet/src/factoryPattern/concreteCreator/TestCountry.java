package factoryPattern.concreteCreator;

import factoryPattern.Currency;

public class TestCountry {

	public static void main(String[] args) {

		System.out.println("Factory method with implementation : ");
		Currency dollar = Country.getCurrency("United States");
		System.out.println(dollar.getSymbol());
		
		Currency rupee = Country.getCurrency("India");
		System.out.println(rupee.getSymbol());
		
		Currency pound = Country.getCurrency("United Kingdom");
		System.out.println(pound.getSymbol());
		

	}

}
