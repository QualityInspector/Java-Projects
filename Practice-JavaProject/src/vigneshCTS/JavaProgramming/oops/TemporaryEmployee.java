package vigneshCTS.JavaProgramming.oops;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;

	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;

	}

	// Getters and Setters
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

// implement the parent unimplemented method	
	@Override
	public void calculateSalary() 
	{
		setSalary(hoursWorked*hourlyWages); 
		

	}

}
