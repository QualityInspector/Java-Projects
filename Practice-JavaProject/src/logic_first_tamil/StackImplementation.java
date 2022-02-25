package logic_first_tamil;

import java.util.Scanner;

public class StackImplementation
{
	
	
	
	public static void main(String[] args) 
	{
		
		// Stack push, pop implememtation
		// implement similar to Queue (FIFO) as well
		
		Stack sRef= new Stack();
			sRef.set('a');
			sRef.set('b');
			sRef.set('c');
			sRef.set('d');
			sRef.set('e'); 
			
			
			System.out.println(sRef.get());
			System.out.println(sRef.get());
			System.out.println(sRef.get());
			System.out.println(sRef.get());
			System.out.println(sRef.get());
		
	}

}
