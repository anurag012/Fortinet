package factoryPattern.abstractCreator;

import factoryPattern.Currency;
import factoryPattern.USDollar;

public class UnitedStates extends Country {

	@Override
	protected Currency getCurrency() {
		return new USDollar();
	}

}
