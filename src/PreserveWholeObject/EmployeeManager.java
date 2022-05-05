package PreserveWholeObject;

public class EmployeeManager {
	public EmployeeManager() {
		
	}
	
	public void testEmployeeName(String employeeName) {
		System.out.println(employeeName);
	}
	
	public void testEmployeeAge(int employeeAge) {
		System.out.println(employeeAge);
	}
	public void testEmployee(Employee employee) {
		System.out.println(employee.name);
		System.out.println(employee.age);
	}
}
