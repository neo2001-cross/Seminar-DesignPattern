package ParameterizeMethod;

public class Employee {
	private int salary;
	
	public void tenPercentRaise () {
		salary *= 1.1;
	}
	
	public void fivePercentRaise () {
		salary *= 1.05; 
	}
	
	//Two function above like static function, we can use but when you want to raise different, you need to re-programming
	
	public void raise(int percent) {
		salary *= 1 + percent/100;
	}
}
