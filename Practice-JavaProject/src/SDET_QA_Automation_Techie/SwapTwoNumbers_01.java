package SDET_QA_Automation_Techie;

import java.util.Scanner;

public class SwapTwoNumbers_01 {

	public static void using3rdVariable(int a, int b) {

		int c;

		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping---");
		System.out.println("First & Second number are: " + a + " " + b);

	}

	public static void withoutUsing3rdVarAddSub(int a, int b) {

		b = a + b;
		a = b - a;
		b = b - a;

		System.out.println("After Swapping---");
		System.out.println("First & Second number are: " + a + " " + b);

	}

	public static void withoutUsing3rdVarMulDiv(int a, int b) {

		b = a * b;
		a = b / a;
		b = b / a;

		System.out.println("After Swapping---");
		System.out.println("First & Second number are: " + a + " " + b);

	}
	
	public static void withoutUsing3rdsingleLine(int a, int b) {

		
		b=a+b-(a=b);

		System.out.println("After Swapping---");
		System.out.println("First & Second number are: " + a + " " + b);

	}

	
	public static void main(String[] args) {

		int a, b;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		a = scan.nextInt();
		System.out.println("Enter Second number");
		b = scan.nextInt();
		System.out.println("Given First number & Second number are: " + a + " " + b);

		using3rdVariable(a, b);
		withoutUsing3rdVarAddSub(a, b);
		withoutUsing3rdVarMulDiv(a, b);
		withoutUsing3rdsingleLine(a, b);

	}

}
