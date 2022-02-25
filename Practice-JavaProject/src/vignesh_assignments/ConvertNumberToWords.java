package vignesh_assignments;

import java.util.Scanner;

public class ConvertNumberToWords {

	public static void numberToWords(int num) {

		String[][] arr = { {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" },
				{ "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
						"Nineteen" },
				{ "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" } };

		String hundreds = "Hundred and";

		// FIND COUNT OF GIVEN NO
		int count = 0;
		for (int i = num; i > 0; i = i / 10) {
			count++;
		}
		System.out.println("Digits- " + count);

		int givenNo[] = new int[count];
		int inc = 0;
		// SPLIT THE GIVEN NO & STORE IN ARRAY
		for (int i = num; i > 0; i = i / 10) {
			givenNo[inc] = i % 10;
//					System.out.println(givenNo[inc]);
			inc++;
		}

		/*
		 * 1-9 index 0 11-19 index 1 20-90 index 2
		 */

		String[] opString = new String[count];
		int counter = 0;

		// Convert number to String
//	    0
		if (count == 0) 
		{
			System.out.println("given number is Zero");
		} 
//		 1-9
		else if (count == 1) 
		{
			for (int i = 0; i < arr[0].length; i++) 
			{
				if (i+1 == givenNo[counter]) 
				{
					System.out.println("Given number is- " + arr[0][i]);
					opString[counter] = arr[0][i];
				}
			}

		} 
		
//		 10-99
		else if (count == 2) 
		{
			if (givenNo[1] == 1) 
			{
				for (int i2 = 0; i2 <= arr[1].length; i2++) 
				{
					if (i2==givenNo[0]) 
					{
						opString[counter] = arr[1][i2];
						System.out.println("Given Number is- " + opString[counter]);

					}

				}
			} 
			else if (givenNo[0] == 0) 
			{
				for(int j2 = 0; j2 < arr[2].length; j2++)
				{
					if(j2+2==givenNo[1])
					{
						opString[counter] = arr[2][j2];
						System.out.println("Given number is- "+opString[counter]);
					}
					
				}

				
			} else 
			{
				for (int x2 = 0; x2 <= arr[2].length; x2++) 
				{
					for (int y2 = 0; y2 <= arr[0].length; y2++) 
					{
						if((x2+2==givenNo[1]) && (y2+1==givenNo[0]))
						{
							opString[counter]= arr[2][x2]+" "+arr[0][y2];
							System.out.println(opString[counter]);
						}

					}

				}

			}

		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		numberToWords(num);

	}

}
