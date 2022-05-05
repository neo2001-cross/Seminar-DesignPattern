package SeparateQueryfromModifier;

public class Customer {
	private String name;
	private int age;
	private String gender;
	private String relationship;
	
	public Customer(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.relationship = "Available";
		this.gender = gender;
	}
	
	//Modify and take value in the same function
	public String chooseThisPerson() {
		this.relationship = "Married";
		return name;
	}
	
	//Separated
	public void chooseToMarried() {
		this.relationship = "Married";
	}
	
	public String getName() {
		return name;
	}
}
