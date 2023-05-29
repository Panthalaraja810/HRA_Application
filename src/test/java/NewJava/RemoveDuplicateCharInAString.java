package NewJava;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInAString {

	public static void main(String[] args) {
		
		String s="Kannada";
	
		String st = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<st.length(); i++)
		{
			set.add(st.charAt(i));
		}
		
		for(Character ch:set)
		{
		System.out.print(ch+" ");
		}
		
	}

}
