package vignesh_assignments;

import java.util.Scanner;

public class BasicPrograms {
	static Scanner scan = new Scanner(System.in);

	public static void fibonacciSeries() {

		// 2 3 5
		System.out.println("Enter 1st Number");
		int firstNo = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int secondNo = scan.nextInt();
		System.out.println("Enter how many time to print");
		int times = scan.nextInt();

		System.out.print(firstNo + " " + secondNo + " ");
		for (int i = 0; i < times - 2; i++) {
			int newNo = firstNo + secondNo;
			System.out.print(newNo + " ");
			firstNo = secondNo;
			secondNo = newNo;
		}

	}

	public static void checkPrimeNoInRange() {
		System.out.println("Prime Number Verification for a range");

		System.out.println("Enter 1st Range");
		int range1 = scan.nextInt();
		System.out.println("Enter 2nd Range");
		int range2 = scan.nextInt();

		for (int n = range1; n <= range2; n++) {
			boolean flag = false;

			if ((n == 0) || (n == 1))
				;

			else if ((n == 2) || (n == 3))
				System.out.print(n + " ");

			else {
				for (int i = 2; i <= n / 2; i++) {

					if (n % i == 0) {
						flag = true;

						break;
					}

				}
				if (flag == false)
					System.out.print(n + " ");

			}

		}
		scan.close();

	}

	public static void verifyPalindromeString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to verify Palindrome- ");
		String str = scan.next();

		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			revString = revString + str.charAt(i);

		}

//		System.out.println("Reversed String- "+revString);

		if (revString.equals(str))
			System.out.println("is Palindrome");
		else
			System.out.println("isn't Palindrome");

		scan.close();
	}

	public static void verifyPalindromeNumber() {
		System.out.println("Enter Number to verify Palindrome- ");
		int n = scan.nextInt();

		int nCopy = n;
		int revNum = 0;
		for (; n > 0; n = n / 10)
//			for (int i = 0; i < n; n = n / 10)
		{
// 1234
			int reminder = n % 10;

			revNum = revNum * 10 + reminder;

		}
		System.out.println("after reversing " + revNum);

		if (revNum == nCopy)
			System.out.println("is Palindrome");
		else
			System.out.println("isn't Palindrome");

		scan.close();
	}

	public static void findFactorial()
	{
		System.out.print("Enter Number to find Factorial- ");
		int n = scan.nextInt();

		int op = 1;

		for (int i = n; i >= 1; i--) {

			op = op * i;
			

		}

		System.out.println(op);
	}
	
	public static void verifyArmstrongNo()
	{
		System.out.print("Enter Number to verify Armstrong Number- ");
		int n = scan.nextInt();
		
		int nCopy=n;
		// 153
		int ans=0;
		for(int i=0; i<n; n=n/10)
		{
			int cube=1;
			int reminder= n%10;
			
			for(int j=1; j<=3; j++)
			{
				cube=cube*reminder;
				
			}
			
			ans= ans+cube;
		}
		
	System.out.println("after applying 3 cube and adding them-"+ans);
	
	if(n==ans)
		System.out.println("given "+n+" is Armstrong Number ");
	else
		System.out.println("given "+n+" isn't Armstrong Number ");
	
	}

	public static void main(String[] args) {

		
		// creating conflict by adding checkPrime() 1st & fibonacci() 2nd
		
		checkPrimeNoInRange();
		fibonacciSeries();

//		verifyPalindromeString();

//		verifyPalindromeNumber();

		findFactorial();
		
//		verifyArmstrongNo();
		
		

	}

}
