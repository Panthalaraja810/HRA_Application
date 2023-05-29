package tTestPackage;

import java.util.LinkedHashSet;

public class PrintPositionInReverseWithoutDuplicates {

	public static void main(String[] args) {

		int[] a= {4,5,4,1,5,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		for(int e: set)
		{
			for(int i=a.length-1; i>=0; i--)
			{
				if(e==a[i])
				{
					System.out.println(e+" position is "+(i+1));
					break;
				}
			}
		}
		
	}
}
