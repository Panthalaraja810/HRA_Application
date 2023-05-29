package NewJava;

import java.util.Iterator;

public class ReverseTheWordsInString {

	public static void main(String[] args) 
	{
		String s ="I am a software engineer";
		String[] arr = s.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			String str = arr[i];
			for(int j=str.length()-1; j>=0; j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}

}

