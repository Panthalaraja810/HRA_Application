package tTestPackage;

import java.util.Scanner;

public class PrimeNumber {

	
	 static int count=0;
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n =sc.nextInt();
		
		
		isPrime(n);
		
		
		
				
		if(count==2)
		{
			System.out.println("is Prime");
		}
		else 
		{
			System.out.println("not prime");
		}
	}

	public static int isPrime(int n) 
	{
		for(int i=1; i<=n; i++)
		{
			if(n%i==0) {
				
				count++;
			}
		}
		return count;
	}

}
