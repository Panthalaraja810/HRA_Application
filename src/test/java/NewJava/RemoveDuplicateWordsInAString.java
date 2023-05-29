package NewJava;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		
		String s="I am I am a software a engineer";
		String[] str = s.split(" ");
		
	LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length; i++)
		{
			set.add(str[i]);
		}
		
		for(String st: set)
		{
			System.out.print(st+" ");
		}
		
		
	}

}
