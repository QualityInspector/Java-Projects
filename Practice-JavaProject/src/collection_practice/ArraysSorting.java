package collection_practice;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSorting {

	static void ArrayIntegerSorting() {
		Integer[] marks = new Integer[] { 85, 74, 95, 94, 75 };
//		for(String s:str)
		for (int m : marks)
			System.out.println(m);

		System.out.println("********Ascending*******");

		Arrays.sort(marks);
		System.out.println(Arrays.toString(marks));
		Arrays.sort(marks, Collections.reverseOrder());
		System.out.println("********Descending*******");

		System.out.println(Arrays.toString(marks));

	}

	
	static void ArrayStringSorting()
	{
	String[] str= new String[]{"dhinesh", "vignesh", "gunasekaran", "anusuya", "xxx", "zzz" };

	
	
	
	
	}
	public static void main(String[] args) {

		ArrayIntegerSorting();

	}

}
