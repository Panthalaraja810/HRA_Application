package tTestPackage;

import java.util.Iterator;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		
		for(;;)
		{
			Scanner sc= new Scanner(System.in);
			//System.out.println("Enter the value: ");
			int n =sc.nextInt();
		
			int fact =1;
			
			for(int i=1; i<=n; i++)
			{
				fact =fact *i;
			}
			
			System.out.println(fact);
		}
		
	}

}
