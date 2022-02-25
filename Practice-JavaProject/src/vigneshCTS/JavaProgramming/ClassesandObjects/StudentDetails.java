package vigneshCTS.JavaProgramming.ClassesandObjects;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Student's Id:");
		int studentId = scan.nextInt();
		
		System.out.println("Enter Student's Name:");
		String studentName = scan.next();
		
		System.out.println("Enter Student's address:");
		String studentAddress = scan.next();
		
		
		
		Student student=null;
		
		for(int i=0; i<1; i++)
		{
		System.out.println("Whether the student is from NIT(Yes/No):");
		String NITyesOrNo = scan.next();
		
		if(NITyesOrNo.toLowerCase().equals("yes"))
		{
		student= new Student(studentId, studentName, studentAddress);
		}
		else if(NITyesOrNo.toLowerCase().equals("no"))
		{	
			
			System.out.println("Enter the college name:");
			scan.nextLine();
			String collegeName = scan.nextLine();
			
			
		student= new Student(studentId, studentName, studentAddress, collegeName);
		
		}
		else
		{
			System.out.println("Wrong Input");
			i--;
		}
		
		}
System.out.println("Student id:"+student.getStudentId());
System.out.println("Student name:"+student.getStudentName());
System.out.println("Address:"+student.getStudentAddress());
System.out.println("College name:"+student.getCollegeName());
		
	
	}

}
