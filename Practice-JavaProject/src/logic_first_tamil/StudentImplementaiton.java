package logic_first_tamil;

public class StudentImplementaiton {

	public static void main(String[] args) {
		int[] student1marks = { 80, 85, 70, 75, 70 };
		Student student1 = new Student("Arun", student1marks);
		System.out.println(student1.name + " total marks are " + student1.calculateTotal());
		int[] student2marks = { 86, 75, 95, 94, 74 };
		Student student2 = new Student("Dinesh",student2marks);
		System.out.println(student2.name + " total marks are " + student2.calculateTotal());
		int[] student3marks = { 50, 35, 50, 75, 50 };
		Student student3 = new Student("anu", student3marks);
		System.out.println(student3.name + " total marks are " + student3.calculateTotal());
		int[] student4marks = { 150, 160, 180, 160, 130, 190};
		Student student4 = new Student("Dhinesh", 123, student4marks);
		System.out.println(student4.name + " total marks are " + student4.calculateTotal());
	}

}
