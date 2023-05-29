package Day5;

import java.util.Arrays;

public class Question21 {

	public static void main(String[] args)
	{
		
		int[] a= {5,2,3,1,7,4};
		
		int s=0;
		int e=a.length-1;
		int temp=0;
		
		for(int i=0; i<3; i++)
		{
			temp= a[s];
			a[s]= a[e];
			a[e]= temp;
			s++;
			e--;
		}
		
		System.out.print(Arrays.toString(a));
	}

}
