package vignesh_assignments;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.commons.lang3.StringUtils;

public class StringProblems {
	static Scanner scan = new Scanner(System.in);

	public static String firstLetterCaps_Method1() {
		System.out.println("ENTER String name to Capitalizr 1st letter- ");
		String inputString = scan.nextLine();

		String[] strArray = inputString.split(" ");
//				inputString.split(" ");
//				StringUtils.split(inputString);
//				inputString.split("\\s+");
		String s = "";
		for (int i = 0; i < strArray.length; i++) {
			s = s + strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1) + " ";

		}

		return s;

	}

	public static void firstLetterCaps_Method2()
	{
		System.out.println("Enter String name to Capitalizr 1st letter- ");
		String inputString=scan.nextLine();
		
		System.out.println("Given String length is- "+inputString.length());
		
		int inc=0;
		String output="";
		
		for(int i=0; i<inputString.length(); i++)
		{
			int charCompare=Character.compare(inputString.charAt(i), ' ');
			String verifySpace=inputString.charAt(i)+"";
			
			if(i==0)
			{
				output= output+(""+inputString.charAt(i)).toUpperCase();
			}
			else if(verifySpace.contains(" "))
			{
				inc++;
				output= output+inputString.charAt(i);
				
			}
			else if(inc==1)
			{
				
				output=output+(""+inputString.charAt(i)).toUpperCase();
				inc=0;
			}
			else
				output= output+inputString.charAt(i);
				
			
		}
		System.out.println(output);
		
		
		
		
	
	}

	public static void main(String[] args) {

//		System.out.println(firstLetterCaps_Method1());
		firstLetterCaps_Method2();
	}

}
