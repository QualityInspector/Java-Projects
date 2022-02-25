package SDET_QA_Automation_Techie;

import java.util.Scanner;

public class verifyPalindrome_0405 {
	public static void verifyPalindromeNumber(int n) {
		System.out.println("Before Reversing - " + n);
		int reversedNum = 0;
		int num = n;

		for (int i = 0; i < num; num = num / 10) {
			int reminder = num % 10;

			reversedNum = (reversedNum * 10) + reminder;

		}

		System.out.println("After Reversing - " + reversedNum);

		if (n == reversedNum)
			System.out.println("Given number " + n + " is Palindrome Number");
		else
			System.out.println("Given number " + n + " isn't Palindrome Number");

	}

	public static void verifyPalindromeString(String str) {
		System.out.println("Before Reversing - " + str);
		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}

		System.out.println("After Reversing - " + reversedString);

		if(str.equals(reversedString))
			System.out.println("Given String " + str + " is Palindrome String");
		else
			System.out.println("Given String " + str + " isn't Palindrome String");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number to verify Palindrome - ");
		int n = scan.nextInt();
		verifyPalindromeNumber(n);
		
		
		System.out.print("Enter String to verify Palindrome - ");
		String s = scan.next();
		System.out.println();
		verifyPalindromeString(s);

	}

}
