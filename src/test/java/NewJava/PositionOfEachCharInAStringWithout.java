package NewJava;

import java.util.LinkedHashSet;

public class PositionOfEachCharInAStringWithout {

	public static void main(String[] args) {
		
		
		String s="Kannada";
		String str = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		for(char ch: set)
		{
			
			//from first position
			for(int i=0;i<str.length(); i++)
			{
				if(ch==str.charAt(i))
				{
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
			}
			
		/*	//from last position
			for(int i=str.length()-1; i>=0; i--)
			{
				if(ch==str.charAt(i))
				{
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
			}
		*/	
		}
		
	}

}
