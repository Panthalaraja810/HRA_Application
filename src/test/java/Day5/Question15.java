package Day5;

import java.util.LinkedHashSet;

public class Question15 {

	// i/p= aaabbcdddf o/p=a3b2cd3f
	
	public static void main(String[] args)
	{
		String  s="aaabbcdddf";
		
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		for(char ch: set)
		{
			int count =0;
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.print(ch);
			if(count>1)
			{
			System.out.print(count);
			}
		}
		
		
	}

}
