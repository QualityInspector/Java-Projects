package vigneshCTS.JavaProgramming.ArraysandStrings;

import java.util.Arrays;
import java.util.Scanner;

public class LeastOffer {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int noOfProducts = scan.nextInt();
		String itemName[] = new String[noOfProducts];
		int itemPrice, discountPercent;

		int discountAmount[] = new int[noOfProducts];
		int leastDiscountAmount = 0;

		for (int i = 0; i < noOfProducts; i++) {
			String itemNamePriceisDcount = scan.next();
			String[] splitString = itemNamePriceisDcount.split(",");
			itemName[i] = splitString[0];
			itemPrice = Integer.parseInt(splitString[1]);
			discountPercent = Integer.parseInt(splitString[2]);
			;

//				System.out.println(itemName[i]+" "+itemPrice+" "+discountPercent);
			discountAmount[i] = (int) (itemPrice * ((double) discountPercent / 100));

		}
		if (noOfProducts == 1)
			leastDiscountAmount = discountAmount[0];
		else {
			for (int i = 0; i < noOfProducts - 1; i++) {

				if (i == 0)
					leastDiscountAmount = discountAmount[i];

				if (leastDiscountAmount <= discountAmount[i + 1])
					continue;
				else
					leastDiscountAmount = discountAmount[i + 1];

			}
		}

//		System.out.println(Arrays.toString(discountAmount));
//		System.out.println(leastDiscountAmount);

		for (int j = 0; j < noOfProducts; j++) {
			if (discountAmount[j] == leastDiscountAmount)
				System.out.println(itemName[j]);
		}
		
		
		
	scan.close();

	}

}
