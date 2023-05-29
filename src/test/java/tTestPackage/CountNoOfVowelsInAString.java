package tTestPackage;

public class CountNoOfVowelsInAString {

	public static void main(String[] args)
	{
		String s="Engineer";
		
		String st = s.toLowerCase();
		int count =0;
		
		for(int i=0; i<st.length(); i++)
		{
			
			char ch = st.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')		
			{
			count++;	
			System.out.print(st.charAt(i));
			}
			
		}
		System.out.println(" ="+count);
	}

}
