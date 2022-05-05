package PreserveWholeObject;


public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee("Nguyen Le Ngoc Huy", 21, "Male");
		EmployeeManager manager = new EmployeeManager();
		
		manager.testEmployeeName(employee.name);
		manager.testEmployeeAge(employee.age);
		
		//To do both of function above you need too use attribute of the object
		//But just one function below you can do both works, give it object and let it do what it want
		
		manager.testEmployee(employee);
	}

}
