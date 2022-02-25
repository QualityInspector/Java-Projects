package edureka;

import java.util.Scanner;

public class VerifyMirrorInverse {

	public static int[] findMirrorInverse(int count, int[] arr) {
		int mirrorInv[] = new int[count];
		int index;
		// 3 4 2 0 1

		for (int i = 0; i < arr.length; i++) {

			index = arr[i];
			
			mirrorInv[index] = i;

		}
		int inc = 0;
		// verification
		for (int i = 0; i < arr.length; i++) {
			
					if (arr[i] == mirrorInv[i]) {
//						System.out.println("index " + i + " matches in both array");
						inc++;
					} else {
						System.out.println(" Given array isn't Mirror Inverse");
						break;
					}
				
			}
		

	if(count==inc)System.out.println("Given Array is Mirror Inverse");

	return mirrorInv;

	}

	public static void verify(int[] arr) {

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of Array elements- ");
		int arrayCount = scan.nextInt();

		int arr[] = new int[arrayCount];

		System.out.println("Enter array Elements starts from zeroth index");
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter index " + i + " value ");
			arr[i] = scan.nextInt();
//			System.out.println("index " + i + " value " + arr[i]);
		}

		
		
		
		findMirrorInverse(arrayCount, arr);

	}

}
