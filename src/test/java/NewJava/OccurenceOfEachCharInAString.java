package NewJava;

import java.util.LinkedHashSet;

public class OccurenceOfEachCharInAString {

	public static void main(String[] args) {
		
		String s="Kannada";
		String st =s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	
		for(int i=0; i<st.length(); i++)
		{
			set.add(st.charAt(i));
		}
		
		for(char ch: set)
		{
			int count=0;
			
			for(int i=0; i<st.length(); i++)
			{
				if(ch==st.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" is repeating "+count+" times");
		}
		
		
	}


}
