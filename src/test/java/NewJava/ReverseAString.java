package NewJava;

import java.util.Iterator;

public class ReverseAString {

	public static void main(String[] args)
	{
		String s="software";
		String rev= "";
		int len =s.length();
		char[] str =s.toCharArray();
		
		//1st way
		for(int i=len-1; i>=0; i--)
		{
		 rev =rev +str[i];
			
		}
		System.out.println(rev);
		
		
		
		//2nd way
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		//3rd way
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]);
		}
		
		//4th way
		StringBuilder build = new StringBuilder("software");
		System.out.println(build.reverse());
	}

}
