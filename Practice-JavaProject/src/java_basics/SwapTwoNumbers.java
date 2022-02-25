package java_basics;

import java.util.Scanner;

public class SwapTwoNumbers 
{
	
	static void usingBitwiseXOR(int a, int b)
	{
		System.out.println("output- "+a+" "+b);
//		b= (a^b)^ (a=b);
		a= (a^b)^ (b=a);
		
		System.out.println("output- "+a+" "+b);
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter 1st number- ");
		int a=scan.nextInt();
		System.out.print("Enter 2nd number- ");
		int b=scan.nextInt();
		
		usingBitwiseXOR(a, b);
		
	}
	

}
