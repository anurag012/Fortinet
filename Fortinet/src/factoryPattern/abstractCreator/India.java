package factoryPattern.abstractCreator;

import factoryPattern.Currency
;
import factoryPattern.INRupee;

public class India extends Country {

	@Override
	protected Currency getCurrency() {
		return new INRupee();
	}

}
