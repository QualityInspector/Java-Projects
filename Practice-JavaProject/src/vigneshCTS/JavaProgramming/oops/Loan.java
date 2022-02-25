package vigneshCTS.JavaProgramming.oops;

public class Loan 
{
	PermanentEmployee pEmployee;
	TemporaryEmployee tEmployee;
	
	
	
	public double calculateLoanAmount(Employee employeeObj)
	{
		double loanAmount=0;
		
		if(employeeObj.getEmployeeStatus().equalsIgnoreCase("permanent"))
		{ 
			loanAmount= employeeObj.getSalary()*((double)15/100);
			
		}
		else if(employeeObj.employeeStatus.equalsIgnoreCase("temporary"))
		{
			
			loanAmount= employeeObj.getSalary()*((double)10/100);
			
		}
		return loanAmount;
	}
	
	
	

	
}
