package vigneshCTS.JavaProgramming.oops;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;

	// added extra
	protected String employeeStatus;

	// constructor with 2 Arguments employeeId, employeeName

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;

	}

	// abstract method
	public abstract void calculateSalary();

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

}
