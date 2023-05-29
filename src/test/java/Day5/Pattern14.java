package Day5;

public class Pattern14 {

	//A B C D E
	//A B C D E
	//A B C D E
	//A B C D E
	//A B C D E
	
	
	public static void main(String[] args) 
	{
		
		int n=5;
		
		char k ='A';
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(k++ +" ");
			}
			k='A';
			System.out.println();
		}

	}

}
