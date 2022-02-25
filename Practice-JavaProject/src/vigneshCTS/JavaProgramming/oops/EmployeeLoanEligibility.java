package vigneshCTS.JavaProgramming.oops;

import java.util.Scanner;

public class EmployeeLoanEligibility {

	
	
	
	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Employee Id: ");
		int employeeId = input.nextInt();

		System.out.println("Enter Employee name: ");
		String employeeName = input.next();

		Loan loan = new Loan();
		Employee emp=null;

		
		for (int i = 0; i < 1;) {
			System.out.println("Enter Employee Status: ");
			 String employeeStatus = input.next();
			 

			if (employeeStatus.toLowerCase().contentEquals("permanent")) {
				System.out.println("Enter Basicpay: ");
				int basicPay = input.nextInt();

				emp = new PermanentEmployee(employeeId, employeeName, basicPay);
				emp.setEmployeeStatus(employeeStatus);
				emp.calculateSalary();
				
//				loan.calculateLoanAmount(emp);
				i++;
				
			} 
			else if (employeeStatus.toLowerCase().contentEquals("temporary")) 
			{
				System.out.println("Enter Hours Worked:");
				int hoursWorked = input.nextInt();
				System.out.println("Enter Hourly Wages:");
				int hourlyWages = input.nextInt();
				emp = new TemporaryEmployee(employeeId, employeeName, hoursWorked, hourlyWages);
				emp.setEmployeeStatus(employeeStatus);
				emp.calculateSalary();
//				loan.calculateLoanAmount(emp);
				i++;

			} else
				System.out.println("pls enter Employee status correctly.");
	
		}
		System.out.println("Enter the Loan amount you want:");
		int wantedLoanAmount=input.nextInt();
		
		int eligibleLoanAmount=(int)loan.calculateLoanAmount(emp);
		
		System.out.println("Employee Details: \n "+ emp.getEmployeeName()+"("+emp.getEmployeeId()+")" + "\n Current Salary:- " + (int) emp.getSalary() );
		
		if(eligibleLoanAmount>=wantedLoanAmount)
		{
			System.out.println("Employee eligible for required loan amount "+wantedLoanAmount);
		}
		else
		{
			System.out.println("Employee not eligible for required loan amount "+wantedLoanAmount+"\n Eligible Loan Amount are "+eligibleLoanAmount);
		}
		
		
	}
}























