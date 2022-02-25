package vigneshCTS.JavaProgramming.oops;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import java.util.Scanner;

public class ContactDetailsOfHosteller {

	static Scanner input = new Scanner(System.in);

	public static Hosteller getHostellerDetails() {

		Hosteller hostelStudent = new Hosteller();

		System.out.println("Enter the Details" + "\n" + "Student Id");
		int studentId = input.nextInt();
		hostelStudent.setStudentId(studentId);

		System.out.println("Student Name");
		String studentName = input.next();
		hostelStudent.setName(studentName);

		System.out.println("Department Id");
		int daepartmentId = input.nextInt();
		hostelStudent.setDepartmentId(daepartmentId);

		System.out.println("Gender");
		String gender = input.next();
		hostelStudent.setGender(gender);

		System.out.println("Phone Number");
		String phoneNo = input.next();
		hostelStudent.setPhone(phoneNo);

		System.out.println("Hostel Name");
		String hostelName = input.next();
		hostelStudent.setHostelName(hostelName);

		System.out.println("Room Number");
		int roomNo = input.nextInt();
		hostelStudent.setRoomNumber(roomNo);

		return hostelStudent;
	}

	public static void main(String[] args) {

		Hosteller hostelStudent = getHostellerDetails();

		

		for(int i=0; i<1;)
		{
			System.out.println("Modify Room Number(Y/N)");
			char yesOrNo = input.next().charAt(0);
			
		if ((Character.compare(yesOrNo, 'y') == 0) || (Character.compare(yesOrNo, 'Y') == 0)) {
			System.out.println("New Room Number");
			int roomNo = input.nextInt();
			hostelStudent.setRoomNumber(roomNo);
			i++;
		}
		else if((Character.compare(yesOrNo, 'n') == 0) || (Character.compare(yesOrNo, 'N') == 0) ) i++;
		else 	System.out.println("Enter single char 'y/n':");	
			
		
		
		}
		
		for(int i=0; i<1; )
		{
			
			System.out.println("Modify Phone Number(Y/N)");
			char yesOrNo = input.next().charAt(0);
			
			
		if ((Character.compare(yesOrNo, 'y') == 0) || (Character.compare(yesOrNo, 'Y') == 0)) {
			System.out.println("New Phone Number");
			String phoneNo=input.next();
			hostelStudent.setPhone(phoneNo);
			i++;
		}
		else if((Character.compare(yesOrNo, 'n') == 0) || (Character.compare(yesOrNo, 'N') == 0) )i++;
		else 	System.out.println("Please enter single char 'y/n':");	
		
		
		}
	
		
		System.out.println("The Student Details\n"+hostelStudent.getStudentId()
		+" "+hostelStudent.getName()+" "+hostelStudent.getDepartmentId()
		+" "+hostelStudent.getGender()+" "+hostelStudent.getPhone()
		+" "+hostelStudent.getHostelName()+" "+hostelStudent.getRoomNumber());

	}

}
