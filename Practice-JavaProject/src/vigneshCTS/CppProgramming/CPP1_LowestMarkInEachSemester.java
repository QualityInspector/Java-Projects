package vigneshCTS.CppProgramming;

import java.util.Scanner;

public class CPP1_LowestMarkInEachSemester {

	static Scanner scan = new Scanner(System.in);
	static int noOfSemesters;

	// this method not neccessary if we find min value inside main method nested for loop 
	static int[] findMin(int[][] semMarks) {
		int minMarksInEachSemester[] = new int[noOfSemesters];

		int count = 0;

		for (int i = 0; i < semMarks.length; i++) // semester iteration
		{
			for (int j = 0; j< semMarks[i].length - 1; j++) // Each sem Marks iteration
			{
				
				if (semMarks[i][j] <= semMarks[i][j + 1]) {
					minMarksInEachSemester[count] = semMarks[i][j];
				} else {
					minMarksInEachSemester[count] = semMarks[i][j + 1];
				}

			}
			System.out.println("Minimum mark in " + Math.abs(i + 1) + " semester:" + minMarksInEachSemester[count]);
			count++;
		}

		return minMarksInEachSemester;
	}

	public static void main(String[] args) {

		System.out.println("Enter number of semester:");
		noOfSemesters = scan.nextInt();

		int semMarks[][] = new int[noOfSemesters][];

		int minMarksInEachSemester[] = new int[noOfSemesters];
	int count=0; 
		for (int i = 0; i < semMarks.length; i++) // semester iteration
		{
			System.out.println("Enter number of subjects in "+Math.abs(i+1)+" semester:");
			int noOfSubjects = scan.nextInt();
			semMarks[i] = new int[noOfSubjects];
			System.out.println("Marks obtained in semester " + Math.abs(i+1) + " :");

			for (int j = 0; j < semMarks[i].length; j++)  // Each sem Marks iteration
			{

				semMarks[i][j] = scan.nextInt();
			
				// IF we use separate method to find minimum this if else isn't needed
				/* if(j==0)
					continue;
				
				else 
				{
					if (semMarks[i][j-1] <= semMarks[i][j]) {
						minMarksInEachSemester[count] = semMarks[i][j-1];
					} else {
						minMarksInEachSemester[count] = semMarks[i][j];
					}

					
				}
				  
				 */
				
			}
			
			count++;
		}
		

	for(int it = 0; it<minMarksInEachSemester.length; it++)
	{
		System.out.println("Minimum mark in " + Math.abs(it + 1) + " semester:" + minMarksInEachSemester[it]);

	}

	findMin(semMarks);

}

}
