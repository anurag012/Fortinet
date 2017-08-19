package factoryPattern.abstractCreator;

import factoryPattern.Currency;
import factoryPattern.UKPound;

public class UnitedKingdom extends Country {

	@Override
	protected Currency getCurrency() {
		return new UKPound();
	}

}
