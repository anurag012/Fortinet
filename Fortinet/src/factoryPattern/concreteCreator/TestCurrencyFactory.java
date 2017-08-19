package factoryPattern.concreteCreator;

import factoryPattern.Currency;

public class TestCurrencyFactory {

	public static void main(String[] args) {

		System.out.println("Factory method with implementation : ");
		Currency dollar = CurrencyFactory.getCurrency("United States");
		System.out.println(dollar.getSymbol());
		
		Currency rupee = CurrencyFactory.getCurrency("India");
		System.out.println(rupee.getSymbol());
		
		Currency pound = CurrencyFactory.getCurrency("United Kingdom");
		System.out.println(pound.getSymbol());
		

	}

}
