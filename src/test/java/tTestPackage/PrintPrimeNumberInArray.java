package tTestPackage;

import java.util.Scanner;

public class PrintPrimeNumberInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++)
		{
			boolean rs = isPrime(i);
			if(rs) 
				System.out.println(i+" is a Prime");
			else
				System.out.println(i+" is not a Prime");
		}

			}

			static boolean isPrime(int x) 
			{
				
				for(int i =2; i<=x/2;i++)
				{
					if(x%i==0)
						return false;
				}
				return true;
			}

}
