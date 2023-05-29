package Day5;

public class Pattern13 {

	//A B C D E
	//F G H I J
	//K L M N O
	//P Q R S T
	//U V W X Y
	
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
			System.out.println();
		}
	}

}
