package tTestPackage;

import java.util.LinkedHashSet;

public class CountNoOfVowelsInAStringwithoutDuplicates {

	public static void main(String[] args) 
	{
		String st="Engineer";
		
		String s = st.toLowerCase();
		char[] str = s.toCharArray();
	
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(str[i]);
		}
		
		int count=0;
		for(char ch: set)
		{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
					System.out.print(ch);
				}
			
		}
		System.out.print(" ="+count);
	}

}
