package recurrsion;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FibonacciSeries
{
	static int count=0;

	
	  
	
	
	
	static int fibonacci(int n1, int n2, int total) throws Exception
	{
		
		if(count==0)
		System.out.print(n1+" "+n2+" ");
		int n3=n1+n2;
		
		System.out.print(n3+" ");
		count++;
		try
		{
		if(count==total-2)
			throw new RecurrsionStopException("Recurrsion stops ");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return fibonacci(n2, n3, total);
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner scan= new Scanner(System.in);
				
		System.out.print("Enter 1st input: ");
		int firstNo=scan.nextInt();
		System.out.print("Enter 2nd input: ");
		int secondNo=scan.nextInt();
		System.out.print("Enter total series number: ");
		int totalNo=scan.nextInt();
		fibonacci(firstNo, secondNo, totalNo);
	}

}
