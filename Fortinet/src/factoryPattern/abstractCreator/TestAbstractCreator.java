package factoryPattern.abstractCreator;

public class TestAbstractCreator {

	public static void main(String[] args) {
		
		System.out.println("Factory method without implementation and abstract creator :");
		Country country = new India();
		country.displayCurrency();
		
		country = new UnitedStates();
		country.displayCurrency();
		
		country = new UnitedKingdom();
		country.displayCurrency();
	}

}
