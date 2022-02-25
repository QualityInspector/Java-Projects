package vigneshCTS.CppProgramming;

import java.util.Scanner;

public class CPP3_DivideNumbers {

	static int divideNumbers(int num) {
		String convertedString = Integer.toString(num);
		int reminder, a = 0, b = 0, divideNo = 0;
		if (convertedString.length() == 2) {

			for (int i = num; i > 0; i /= 10) {
				reminder = i % 10;

				if (i == num)
					a = reminder;
				else
					b = reminder;

			}
			divideNo = b / a;
			

		} else {

			System.out.println("please provide 2 digit integer");
		}

		return divideNo;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		int inputNo = scan.nextInt();

		System.out.println(divideNumbers(inputNo));

	}

}
