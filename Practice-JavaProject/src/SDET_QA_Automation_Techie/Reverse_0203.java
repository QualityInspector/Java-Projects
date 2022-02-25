package SDET_QA_Automation_Techie;

import java.util.Scanner;

public class Reverse_0203 {

	public static int numberReverse(int n) {
		System.out.println("Before Reversing - " + n);
		int reversedNum = 0;

		for (int i = 0; i < n; n = n / 10) {
			int reminder = n % 10;

			reversedNum = (reversedNum * 10) + reminder;

		}

		System.out.println("After Reversing - " + reversedNum);

		return reversedNum;
	}

	public static String stringReverse(String str) {
		System.out.println("Before Reversing - " + str);
		String reversedString="";
		for (int i = str.length() - 1; i >= 0; i--) {
			// dhinesh
			
			reversedString = reversedString + str.charAt(i);
		}

		System.out.println("After Reversing - " + reversedString);

		return str;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number to reverse - ");
		int n = scan.nextInt();
		System.out.println();
		numberReverse(n);
		
		System.out.print("Enter any Word to reverse - ");
		String s = scan.next();
		System.out.println();
		stringReverse(s);

	}

}
