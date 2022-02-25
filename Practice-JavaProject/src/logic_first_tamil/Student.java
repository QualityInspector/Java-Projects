package logic_first_tamil;

public class Student 
{
	String name;
	int rollNo;
	int[] marks;
	
	int total=0;
	
	
	Student(String name, int[] marks_10th)
	{
		this.name=name;
		this.rollNo= rollNo;
		this.marks= marks_10th;
		
	}
	Student(String name, int rollNo, int[] marks_12th)
	{
		this.name=name;
		this.rollNo= rollNo;
		this.marks= marks_12th;
		
	}
	
	int calculateTotal()
	{
		
		for(int i=0; i<marks.length; i++)
		total= total+marks[i];
		
		
		return total;
	}
	
	

}
