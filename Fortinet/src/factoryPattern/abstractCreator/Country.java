package factoryPattern.abstractCreator;

import factoryPattern.Currency;

public abstract class Country {

	public void displayCurrency() {
		Currency curr = getCurrency();
		String message = curr.getSymbol();
		System.out.println("Currency is : " +message);
	}
	protected abstract Currency getCurrency();
}
