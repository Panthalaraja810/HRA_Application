package tTestPackage;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

			int[] a= {4,5,4,1,5,3,2};
		
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			
			for(int i=0; i<a.length; i++)
			{
				set.add(a[i]);
			}
			
			for(int e: set)
			{
				System.out.print(e+" ");
			}
	}

}
