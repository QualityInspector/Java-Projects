package logic_first_tamil;

import java.util.Scanner;

public class patternPrograms 
{
	
	static Scanner scan= new Scanner(System.in);
	
	
	static void withoutUsingNestedfor() 
	{
		System.out.print("Enter number to print square star pattern- ");
		
		int n=scan.nextInt();
		
		int totalStars= n*n;
		
		for(int i=1; i<=totalStars ; i++) 
		{
			
			
			if((i%n==1) && (i!=1))
			System.out.print("\n");
			
			System.out.print("*");
		}
		
	}

	public static void main(String[] args) 
	{
		
		withoutUsingNestedfor();

	}

}
