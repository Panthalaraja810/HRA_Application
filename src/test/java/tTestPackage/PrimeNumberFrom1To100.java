package tTestPackage;

import java.util.Scanner;

public class PrimeNumberFrom1To100 {

//	static int count = 0;

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value: ");
//		int n = sc.nextInt();
//
//		isPrime(n);
//
//	}
//
//	public static void isPrime(int n) {
//		for (int i = 1; i <= n; i++) {
//			count = 0;
//			for (int j = 1; j <= n; j++) {
//
//				if (i % j == 0) {
//
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.println(i);
//			}
//
//		}
//		
//	}
	
	
	
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
