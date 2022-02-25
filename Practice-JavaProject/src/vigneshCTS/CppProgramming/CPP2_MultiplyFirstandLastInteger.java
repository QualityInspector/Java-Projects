package vigneshCTS.CppProgramming;

import java.util.Scanner;

public class CPP2_MultiplyFirstandLastInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String ipString = scan.next();
		int a[] = new int[2];
	
		int inc = 0;
		if (ipString.length() <= 1) {
			System.out.println("Please Enter minimum of 2 char input String");
		} else {
			for (int i = 0; i < ipString.length(); i++) {
				if ((i == 0) || (i == ipString.length() - 1))
				{	
					a[inc] = Integer.valueOf(""+ipString.charAt(i));
				
				inc++;
				}

				
			}
		}
		
		if(ipString.length()>1)
		System.out.println("Result:"+a[0]*a[1]);

	}

}
