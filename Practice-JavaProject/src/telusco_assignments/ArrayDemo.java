package telusco_assignments;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		
		// Multi-Dimensional Array
		
		int a[]= {1, 2, 3, 4};
		int b[]= {5, 6, 7, 8};
		int c[]= {1, 3, 5, 7};
		int d[]= {2, 4, 6, 8, 4, 4};
		
		
		int arr[][]= {a, b, c, d};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(" "+arr[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		
		


	}

}
