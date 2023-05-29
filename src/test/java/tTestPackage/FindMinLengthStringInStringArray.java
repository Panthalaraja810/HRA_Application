package tTestPackage;

import org.apache.commons.math3.analysis.function.Min;

public class FindMinLengthStringInStringArray {

	public static void main(String[] args) 
	{
//		String[] s= {"abc","abcd","abcdd","ab"}; //ab
//		
//		String min_len = s[0];
//		
//		for(int i=0;i<s.length; i++)
//		{
//			if(min_len.length()>s[i].length())
//			{
//				min_len =s[i];
//			}
//		}
//		System.out.println(min_len);
	
		
		
		String[] s= {"abc","ab","dv","abcd","sbcd"};
		
		String min_len = s[0];
		
		for(int i=0; i<s.length; i++)
		{
			if(min_len.length()<s[i].length())
			{
				min_len =s[i];
			}
		}
		
		for(int i=0; i<s.length; i++)
		{
			if(min_len.length()==s[i].length())
			{
				System.out.println(s[i]+" ");
			}
		}
		
	}

}
