package vigneshCTS.JavaProgramming.oops;

public class PermanentEmployee extends Employee	 {
	private double basicPay;

	
	// constructor with 3 Arguments
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) 
	{
		super(employeeId, employeeName);
		this.basicPay= basicPay;
		
	}
	
	
	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}



	@Override
	public void calculateSalary() {
	
		
		setSalary(basicPay-(basicPay*0.12));
	
		
	}
	
	
	

}
