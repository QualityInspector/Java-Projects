package vignesh_assignments;

import java.util.Scanner;

public class ReverseStringFirstandLast 
{
	
	
	
	public static String reverseString(String str)
	{
		// 1abc2
		String newString="";
		
		newString= newString+str.charAt(str.length()-1);
		
		for(int i=1; i<str.length()-1; i++)
		{
			newString= newString+str.charAt(i);
			
		}
		
		String revString= newString+str.charAt(0);
		
		return revString;
	}
	
	static int reverseNumberUsingCasting(int num)
	{
		// 1abc2
				String str=Integer.toString(num);
				String newString="";
				newString= newString+str.charAt(str.length()-1);
				
				for(int i=1; i<str.length()-1; i++)
				{
					newString= newString+str.charAt(i);
					
				}
				
				String revString= newString+str.charAt(0);
		
				int reverseNum=Integer.valueOf(revString);
				
				
				
		System.out.println("o/p is- "+reverseNum);
		return reverseNum;
	}
	
	
	
	static void reverseNum(int num)
	{
		
		// FIND COUNT OF GIVEN NO
				int count = 0;
				for (int i = num; i > 0; i = i / 10) {
							count++;
				}
				System.out.println("Total number of digits in the given number is- " + count);

				int givenNo[]=new int[count];
				int inc=0;
				// SPLIT THE GIVEN NO & STORE IN ARRAY
				for (int i = num; i > 0; i = i / 10) {
					givenNo[inc]=i%10;
			
					
//					int i=200;
//				String s=Integer.toString(i);
			
					
					System.out.println(givenNo[inc]);
					inc++;
		}
		
		
		// 1234    indexes 4 3 2 1 
				
				String opString="";
				
				
				
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		
//		String str=scan.next();
		
		int num= scan.nextInt();
		
//		System.out.println(reverseString(str));
		
		
		reverseNumberUsingCasting(num);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
