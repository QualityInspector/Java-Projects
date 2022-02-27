package java_basics;

public class HelloWorld {

int x=2;
	
	
	public static void main(String[] args) 
	{
	
// comments added for commit through git commandas in cmd line 

		
		int a=20, b=2;
		
		
		try {
			int c=a/b;
			if(c==10)
				throw new MyException("answer must not be 10");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
	// printing Hello world
		System.out.println("Hellow world");
		
		
	}
	
	
	

}
