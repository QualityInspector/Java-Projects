package arrayPrograms;

import java.util.Scanner;

public class ArrayCalculations {

	
	
	// find Min & Max of an array
	
	public static int findMinimum(int[] arr) {

		int min = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (i == 0) {
				min = arr[0];
//				System.out.println("Assigning initial value "+a+" to a vaiable");
			}
			if (min <= arr[i + 1])
				continue;
			else
				min = arr[i + 1];

//			System.out.println("Minimum is "+a);
		}

		return min;
	}

	public static int findMaximum(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (i == 0)
				max = arr[0];
//				System.out.println("Assigning initial value "+a+" to a vaiable");

			if (max <= arr[i + 1])
				max = arr[i + 1];
			else
				continue;
//			System.out.println("Minimum is "+a);
		}

		return max;
	}
	
	
	public static double findAverage(int[] arr) {
		
		
		double avg=0;
		double total=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			total= total+arr[i];
			
		}
//		System.out.println("total is "+total+" length is "+arr.length);
		
		avg= total/arr.length;

		return avg; 

	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array length- ");
		int arrLength = scan.nextInt();

		int[] arr = new int[arrLength];
		System.out.println("Enter array index elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt();

		}

		System.out.println("Min number- " + findMinimum(arr));
		System.out.println("Max number- " + findMaximum(arr));
		System.out.println("Average number- " + findAverage(arr));

	}

}
