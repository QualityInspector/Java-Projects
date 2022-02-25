package edureka;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int firstNo = scan.nextInt();
//		System.out.print(" ");
		int secondNo = scan.nextInt();
		System.out.print("Enter the operator- ");
		char operator = scan.next().charAt(0);

		int result = 0;

		switch (operator) {
		case '+':
			result = firstNo + secondNo;

			break;
		case '-':
			result = firstNo - secondNo;
			break;
		case '*':
			result = firstNo * secondNo;
			break;
		case '/':
			result = firstNo / secondNo;
			break;

		default:
			System.out.println("Operator doesn't match");
			break;
		}

		System.out.println("Result after the operation- " + result);

	}

}
