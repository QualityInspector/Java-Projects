package vignesh_assignments;

import java.util.Scanner;

public class FindCharacterCountInaString {

	
	public static void findCount(String str, int n, char chr)
	{
		// Example input are    abcb1   9  b
		
		
		System.out.println("Givne String is : "+ str);
		String combinedString= ""; 
		int count=0;
		int reset=0;
		for(int i=0; i<n; i++)
		{
			
			if(i%(str.length())==0)
			{
			   reset=0;
			}
			int compareChars= Character.compare(chr, str.charAt(reset));
			
			if(compareChars==0)
				count++;
			
			combinedString=combinedString+str.charAt(reset);
			reset++;
			
			
		}
		System.out.println("Combined String are : "+combinedString);
		
		System.out.println("Total duplicate character found int the combined String is : "+ count);
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter input String - ");
		String ipString = scan.next();
		System.out.print("Enter no.of char to repeat the given String - ");
		int numberOfChar= scan.nextInt(); 
		System.out.print("Enter the character to find Duplicate in the combined String :");
		char inputChar= scan.next().charAt(0); 
		
		findCount(ipString, numberOfChar, inputChar);
		
		

		
		
		
		
		

	}

}



























