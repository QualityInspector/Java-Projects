package logic_first_tamil;

public class Stack 
{
	char cArray[]= new char[4];
	int index;
	
	public Stack() 
	{
	index= -1;	
	}
	
	void set(char value)
	{
		if(index<cArray.length-1)
		{
		cArray[++index]=value;
		}
		else
		{
			System.out.println("Stack full");
			
		}
	}
	
	
	
	char get()
	{
		if(index>=0)
		{
		return cArray[index--];
		}
		else
		{
			System.out.println("Stack Empty");
			return 'x';
		}
	}
	
	

}
