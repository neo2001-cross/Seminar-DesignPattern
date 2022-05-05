package RenameMethod;

public class Customer {
	
	private String name;
	private String availableBalanceInBank;
	
	
	public Customer(String name, String availableBalanceInBank) {
		this.name = name;
		this.availableBalanceInBank = availableBalanceInBank;
	}

	//Without rename method
	private String getavlBlcInank() {
		return this.availableBalanceInBank;
	}
	//What is avlBlcOfBank()
	
	private String getAvailableBalanceInBank() {
		return this.availableBalanceInBank;
	}
}
