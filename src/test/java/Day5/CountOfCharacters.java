package Day5;

import java.util.LinkedHashSet;

public class CountOfCharacters {

	public static void main(String[] args) 
	{
		String s="awweexxxyyyyyy";
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length(); i++)
		{
			set.add((s.charAt(i)));
		}
		
		for(char ch: set)
		{
			int count =0;
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" count: "+count);
		}
		
		
		
		
	}

}
